public class Diretor extends Funcionario {
    
    private String cargo = "Diretor";
    
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    public double getBonificacao() {
        return super.getBonificacao(2) + this.getSalario();
    }
    
}
