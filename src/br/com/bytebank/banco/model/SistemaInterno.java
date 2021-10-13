package br.com.bytebank.banco.model;

/**
 * Modelo para novos sistemas internos do Bytebank. Há sempre uma senha de acesso. As suas instâncias podem ser usadas
 * para tentar autenticar um usuário ao sistema.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class SistemaInterno {
    private final String senha;
    
    /**
     * Constrói um novo sistema interno com uma nova {@link #senha} de acesso.
     *
     * @param senha String que define a senha de acesso da instância.
     */
    public SistemaInterno(String senha) {
        this.senha = senha;
    }
    
    /**
     * Tenta autenticar um usuário à instância, retornando um login autorizado ou rejeitado.
     * <p>Isto depende do retorno do método {@linkplain Autenticavel#autenticar(String)}, que pode ser
     * true, caso a senha dessa instância seja igual à senha definida para o autenticador do usuário, ou false, caso as
     * senhas não sejam iguais.</p>
     *
     * @param auth Usuário {@linkplain Autenticavel}.
     */
    public void autenticar(Autenticavel auth) {
        boolean autenticado = auth.autenticar(this.senha);
        
        if (autenticado) System.out.println("Login autorizado: Seja bem-vinde ao sistema interno.");
        else System.out.println("Login rejeitado: Não foi possível entrar no sistema.");
    }
}
