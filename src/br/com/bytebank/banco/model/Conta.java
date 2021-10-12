package br.com.bytebank.banco.model;

/**
 * A classe {@code Conta} é a base de todas as contas criadas no Bytebank. É abstrata, logo somente
 * as suas filhas podem ser instanciadas.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public abstract class Conta {
    private double saldo;
    private final int agencia;
    private final int numero;
    private Cliente titular;
    private static int total;
    protected String tipo;
    
    /**
     * Constrói uma nova conta com o número da {@link #agencia} e o {@link #numero} da conta.
     * Caso a agência seja menor que 1001, ou o número da conta seja menor/igual a zero, uma
     * {@linkplain IllegalArgumentException} é lançada e a instância não é criada.
     *
     * @param agencia Número inteiro, maior que 1000, que define a agência.
     * @param numero  Número inteiro positivo que define o número da conta.
     */
    public Conta(int agencia, int numero) {
        if (agencia < 1001) {
            throw new IllegalArgumentException("Número de agência inválida!");
        } else this.agencia = agencia;
        
        if (numero <= 0) {
            throw new IllegalArgumentException("Número de conta inválido!");
        } else this.numero = numero;
        
        total++;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }
    
    /**
     * Método que retorna o {@code Cliente} guardado no atributo {@link #titular} da instância.
     *
     * @return Objeto do tipo Cliente
     */
    public Cliente getTitular() {
        return titular;
    }
    
    /**
     * Método que define um {@code Cliente} como valor do atributo {@link #titular} da instância.
     *
     * @param titular Objeto do tipo Cliente
     */
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    /**
     * Método que retorna o valor do {@code static} {@link #total} da classe da instância. Este é
     * acrescido de 1 sempre que uma instância nova é criada.
     *
     * @return Número inteiro estático
     */
    public static int getTotal() {
        return total;
    }
    
    /**
     * Método que retorna o {@link #tipo} da classe da instância. O "tipo" de conta é definido no {@code constructor}
     * das classes filhas {@linkplain ContaCorrente} e {@linkplain ContaPoupanca}.
     *
     * @return String que define o tipo da conta, e.g. "Conta Corrente"
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Método que realiza um depósito de dinheiro na conta. Caso o valor informado for menor ou igual a zero,
     * uma nova {@link DepositarException} é lançada, dizendo que o valor é inválido e evitando o depósito.
     * <p>Caso o valor informado for maior que zero, então o {@linkplain #saldo} da instância é acrescido desse valor.
     *
     * @param valor Número não inteiro a ser depositado no saldo
     */
    public void depositar(double valor) throws DepositarException {
        if (valor <= 0) {
            throw new DepositarException("Impossível depositar R$" + valor + " - Valor inválido!");
        }
        
        this.saldo += valor;
    }
    
    /**
     * Método que realiza um saque na conta, e pode ser sobrescrito. Caso o valor informado for maior que o
     * {@linkplain #saldo} da instância, uma {@link SacarException} é lançada, dizendo que o saldo da conta
     * é insuficiente e evitando o saque.
     * <p>Caso contrário, se o valor informado for válido, ele é então debitado do saldo da instância.
     *
     * @param valor Número não inteiro a ser sacado do saldo
     */
    public void sacar(double valor) throws SacarException {
        if (this.saldo < valor) {
            throw new SacarException("Impossível sacar R$" + valor + " - Seu saldo é de R$" + this.saldo);
        } else if (valor <= 0) {
            throw new SacarException("Impossível sacar R$" + valor + " - Valor inválido!");
        }
        
        this.saldo -= valor;
    }
    
    /**
     * Método que transfere dinheiro de uma conta para outra. O primeiro parâmetro recebe o valor a ser
     * transferido, e o segundo recebe a instância de {@code Conta} que receberá a transferência.
     * <p>Se o valor informado for maior que o {@linkplain #saldo} da instância, uma {@link TransferirException}
     * é lançada, informando que o saldo é insuficiente e evitando a transferência.</p>
     * <p>Caso o valor for menor ou igual ao {@linkplain #saldo} da instância, ele é então debitado desse saldo e
     * depositado na Conta destino. Caso o depósito retorne uma {@linkplain DepositarException}, a mensagem da
     * exceção é impressa e a transferência é revertida.
     *
     * @param valor        Número não inteiro a ser transferido de um saldo para outro
     * @param contaDestino Objeto do tipo Conta
     */
    public void transferir(double valor, Conta contaDestino) throws TransferirException {
        if (this.saldo < valor) {
            throw new TransferirException("Impossível transferir R$" + valor + " - Seu saldo é de R$" + this.saldo);
        } else if (valor <= 0) {
            throw new TransferirException("Impossível transferir R$" + valor + " - Valor inválido!");
        }
        
        this.saldo -= valor;
        try {
            contaDestino.depositar(valor);
        } catch (DepositarException ex) {
            System.out.println(ex.getMessage());
            this.saldo += valor;
        }
    }
}
