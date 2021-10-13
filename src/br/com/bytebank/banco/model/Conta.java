package br.com.bytebank.banco.model;

/**
 * Base de todas as contas criadas no Bytebank. A classe é abstrata, logo somente as suas classes filhas podem ser
 * instanciadas.
 * <p>As instâncias guardam um objeto {@code Cliente} como titular, saldo, agência, número e
 * tipo da conta. Além disso, existe um número inteiro estático que guarda o total de contas criadas no Bytebank.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public abstract class Conta {
    private double saldo;
    private final int agencia;
    private final int numero;
    private Cliente titular;
    private static int total;
    protected String tipo;
    
    /**
     * Constrói uma nova {@code Conta} com a {@link #agencia} e o {@link #numero} da conta.
     * <p>Caso a agência seja menor que 1001, ou o número da conta seja menor ou igual a zero, uma
     * {@linkplain IllegalArgumentException} é lançada e a instância não é criada.
     *
     * @param agencia inteiro >1000 que define a agência
     * @param numero  inteiro positivo que define o número da conta
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
    
    public Cliente getTitular() {
        return titular;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    /**
     * Retorna o atributo {@link #tipo} da instância. O tipo de conta é <b>definido no construtor</b> das classes filhas
     * desta.
     *
     * @return tipo da conta, e.g. "Conta Corrente"
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Retorna o valor do {@code static} {@link #total} da classe instanciada. O total guarda um número inteiro que é
     * <b>acrescido de 1 sempre que uma instância é criada</b>.
     *
     * @return inteiro estático que guarda o total de contas criadas
     */
    public static int getTotal() {
        return total;
    }
    
    /**
     * Realiza um depósito de dinheiro na conta. Caso o valor informado for maior que zero, o {@linkplain #saldo} da
     * instância é acrescido desse valor.
     * <p>Caso contrário, uma nova {@link DepositarException} é lançada, dizendo que o valor é
     * inválido e interrompendo o depósito.
     *
     * @param valor valor a ser depositado
     */
    public void depositar(double valor) throws DepositarException {
        if (valor <= 0)
            throw new DepositarException("Impossível depositar R$" + valor + " - Valor inválido!");
        this.saldo += valor;
    }
    
    /**
     * Realiza um saque na conta. Caso o valor informado for maior que o {@linkplain #saldo} da instância, uma {@link
     * SacarException} é lançada, dizendo que o saldo da conta é insuficiente e interrompendo o saque.
     * <p>Caso contrário, se o valor informado for válido, ele será debitado do saldo.
     *
     * @param valor valor a ser debitado do saldo
     */
    public void sacar(double valor) throws SacarException {
        if (this.saldo < valor)
            throw new SacarException("Impossível sacar R$" + valor + " - Seu saldo é de R$" + this.saldo);
        else if (valor <= 0)
            throw new SacarException("Impossível sacar R$" + valor + " - Valor inválido!");
        this.saldo -= valor;
    }
    
    /**
     * Método que transfere dinheiro de uma conta para outra. Se o valor informado for maior que o {@linkplain #saldo}
     * da instância, uma {@linkplain TransferirException} é lançada, dizendo que o saldo é insuficiente e interrompendo
     * a transferência.
     * <p>Caso contrário, o valor informado será <b>debitado do saldo da instância e depositado na
     * Conta destino</b>. Caso o depósito retorne uma {@linkplain DepositarException}, a mensagem da exceção é exibida e
     * a transferência é revertida.
     *
     * @param valor        valor a ser transferido
     * @param contaDestino Objeto {@code Conta} a receber o valor transferido
     */
    public void transferir(double valor, Conta contaDestino) throws TransferirException {
        if (this.saldo < valor)
            throw new TransferirException("Impossível transferir R$" + valor + " - Seu saldo é de R$" + this.saldo);
        else if (valor <= 0)
            throw new TransferirException("Impossível transferir R$" + valor + " - Valor inválido!");
        this.saldo -= valor;
        
        try {
            contaDestino.depositar(valor);
        } catch (DepositarException ex) {
            System.out.println(ex.getMessage());
            this.saldo += valor;
        }
    }
}
