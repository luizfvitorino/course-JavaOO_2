package br.com.bytebank.banco.model;

/**
 * Modelo para os autenticadores de usuários autenticáveis. O {@code autenticador} guarda as credenciais dos usuários e
 * é usado para <em>realizar a autenticação</em>, isto é, comparar a senha guardada com a senha informada. O seu {@code
 * construtor} é padrão.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
class Autenticador {
    
    private String login;
    private String senha;
    
    /**
     * Define o {@link #login} do usuário, caso este tenha entre 6 e 12 caracteres, e a {@link #senha} do usuário, caso
     * esta tenha entre 6 e 8 caracteres. Casos contrários, imprime as mensagens de erro.
     *
     * @param login login informado
     * @param senha senha informada
     */
    public void setCredenciais(String login, String senha) {
        if (login.length() >= 6 && login.length() <= 12) this.login = login;
        else System.out.println("O seu login precisa ter entre 6 e 12 caracteres.");
        
        if (senha.length() >= 6 && senha.length() <= 8) this.senha = senha;
        else System.out.println("A sua senha precisa ter entre 6 e 8 caracteres.");
    }
    
    public String getLogin() {
        return this.login;
    }
    
    /**
     * Compara a {@link #senha} guardada com a senha informada e, caso sejam iguais, retorna true e imprime uma mensagem
     * de sucesso; caso contrário, retorna false.
     *
     * @param senha senha informada
     * @return true/false (autenticado/não autenticado)
     */
    public boolean autenticar(String senha) {
        String caller = "@" + this.getLogin();
        System.out.println("Autenticando " + caller + "...");
        
        return this.senha.equals(senha);
    }
}
