public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
        this.tipo = "Conta Poupança";
    
        System.out.println("Criando a " + tipo + " 0" + numero + " na agência " + agencia + "...");
    }
    
}
