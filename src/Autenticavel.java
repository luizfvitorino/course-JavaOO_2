public interface Autenticavel {
    
    void setCredenciais (String login, String senha);
    
    String getLogin ();
    
    boolean autenticar(String senha);
    
}
