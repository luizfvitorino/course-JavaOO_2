import java.util.Objects;

public class Administrador extends Funcionario implements Autenticavel {
    
    private String login;
    private String senha;
    private String caller = this.getCargo() + " @" + this.getLogin();
    
    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.cargo = "Administrador";
    }
    
    @Override
    public String getLogin() {
        return this.login;
    }
    
    @Override
    public void setCredenciais(String login, String senha) {
        
        if (login.length() > 6 && login.length() <= 12) {
            this.login = login;
        } else System.out.println("O seu login precisa ter entre 6 e 12 caracteres.");
    
        if (senha.length() > 6 && senha.length() <= 8) {
            this.senha = senha;
        } else System.out.println("A sua senha precisa ter entre 6 e 8 caracteres.");
    }
    
    @Override
    public boolean autenticar(String senha) {
        if (Objects.equals(senha, this.senha)) {
            System.out.println("Login autorizado: Seja bem-vinde, " + caller + "!");
            return true;
        } else System.out.println("Login não autorizado: Reveja as suas informações.");
        return false;
    }
}
