public class Diretor extends Funcionario {
    
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.cargo = "Diretor";
    }
    
    public double getBonificacao() {
        return super.getBonificacao(2) + this.getSalario();
    }
    
}
