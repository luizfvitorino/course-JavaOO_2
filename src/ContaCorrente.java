public class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        this.tipo = "Conta Corrente";
    
        System.out.println("Criando a " + tipo + " 0" + numero + " na agência " + agencia + "...");
    }
    
    @Override
    public void sacar(double valor) {
        valor += 2; // Taxa de R$2 para realizar o saque
        super.sacar(valor);
    }
    
}
