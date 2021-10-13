package br.com.bytebank.banco.model;

/**
 * Interface que define os métodos que um funcionário deve herdar para poder se autenticar num {@linkplain
 * SistemaInterno} do banco, através do seu {@linkplain Autenticador}.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public interface Autenticavel {
    
    /**
     * Define o login e a senha do usuário.
     *
     * @param login login informado
     * @param senha senha informada
     */
    void setCredenciais(String login, String senha);
    
    String getLogin();
    
    /**
     * Serve para autenticar o usuário usando o seu {@code autenticador} com a senha informada.
     * <p>Caso a senha informada (no caso, a do sistema interno, já que é ele que autentica) seja igual à senha
     * guardada,
     * retorna true, caso contrário, retorna false.
     *
     * @return true/false (autenticado/não autenticado)
     */
    boolean autenticar(String senha);
}
