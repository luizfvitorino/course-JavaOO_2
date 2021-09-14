public class Estagiario extends Funcionario {
    private String cargo = "Estagiário";
    
    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    public double getBonificacao() {
        return super.getBonificacao() + 200.0;
    }
}
