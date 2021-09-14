public class Estagiario extends Funcionario{
    
    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.cargo = "Estagiário";
    }
    
    public double getBonificacao() {
        return super.getBonificacao(1);
    }
    
}
