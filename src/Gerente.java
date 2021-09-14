import java.util.Objects;

public class Gerente extends Funcionario{
    private String cargo = "Gerente";
    private String login;
    private String senha;
    
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setSenha(String senha) {
        if (senha.length() > 6 && senha.length() <= 8) {
            this.senha = senha;
        } else System.out.println("A sua senha precisa ter entre 6 e 8 caracteres.");
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        if (login.length() > 4 && login.length() <= 12) {
            this.login = login;
        } else System.out.println("O seu login precisa ter entre 4 e 12 caracteres.");
    }
    
    public double getBonificacao() {
        return super.getBonificacao(1) + this.getSalario();
    }
    
    public void autenticar(String login, String senha) {
        String caller = this.getCargo() + " @" + this.getLogin();
        
        if (Objects.equals(login, this.login) && Objects.equals(senha, this.senha)) {
            System.out.println("Login autorizado: Seja bem-vinde, " + caller + "!");
        } else System.out.println("Login não autorizado: Reveja as suas informações.");
    }
}
