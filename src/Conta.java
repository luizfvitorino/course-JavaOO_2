public abstract class Conta
{
    private double saldo;
    private final int agencia;
    private final int numero;
    private Cliente titular;
    private static int total;
    protected String tipo;
    
    public Conta (int agencia, int numero) {
        if (agencia < 1001) {
            System.out.println("Número de agência inválida!");
            this.agencia = 1001;
        } else this.agencia = agencia;
        
        if (numero <= 0) {
            System.out.println("Número de conta inválido!");
            this.numero = 0;
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
    
    public static int getTotal() {
        return total;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else System.out.println("Você não pode depositar zero reais!");
    }
    
    public void sacar(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsUncException("Impossível sacar R$" + valor + " - Seu saldo é de R$" + this.saldo);
            // Verifica se o saldo é menor que o valor informado; caso seja, lança uma exceção
            // de saldo insuficiente, imprimindo o saldo disponível.
        }
        this.saldo -= valor;
    }
    
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
}
