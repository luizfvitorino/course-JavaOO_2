public class ContaDefault {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public ContaDefault(int agencia, int numero) {
        if (agencia < 1001) {
            System.out.println("Número de agência inválida!");
            this.agencia = 1001;
        } else this.agencia = agencia;
        
        if (numero <= 0) {
            System.out.println("Número de conta inválido!");
            this.numero = 0;
        } else this.numero = numero;
        
        System.out.println("Criando a conta 0" + numero + " na agência " + agencia + " ...");
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
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else System.out.println("Você deve inserir um valor maior que zero!");
    }
    
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else System.out.println("Saldo insuficiente para realizar o saque.");
        return false;
    }
    
    public boolean transferir(double valor, ContaDefault contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            return true;
        } else System.out.println("Saldo insuficiente para realizar a transferência.");
        return false;
    }
}
