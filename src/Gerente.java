import java.util.Objects;

public class Gerente extends Funcionario{
    private String senha;
    
    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }
    
    public boolean autenticar(String senha) {
        return Objects.equals(senha, this.senha);
    }
}
