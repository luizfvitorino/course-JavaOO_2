import java.util.Objects;

public class Autenticador
{
    private String login;
    private String senha;
    
    public void setCredenciais(String login, String senha) {
        
        if (login.length() >= 6 && login.length() <= 12) {
            this.login = login;
        } else System.out.println("O seu login precisa ter entre 6 e 12 caracteres.");
        
        if (senha.length() >= 6 && senha.length() <= 8) {
            this.senha = senha;
        } else System.out.println("A sua senha precisa ter entre 6 e 8 caracteres.");
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public boolean autenticar(String senha) {
        String caller = " @" + this.getLogin();
        
        if (Objects.equals(senha, this.senha)) {
            System.out.println("Autenticando: " + caller + " ...");
            return true;
        } else return false;
    }
}
