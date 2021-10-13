package br.com.bytebank.banco.model;

/**
 * Extende a classe {@link Funcionario} e implementa a interface {@link Autenticavel}, sendo um modelo instanciável de
 * funcionário autenticável. Esta classe representa o cargo de Administrador dentro do Bytebank.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class Administrador
        extends Funcionario
        implements Autenticavel {
    
    private final Autenticador autenticador;
    
    /**
     * Constrói um novo {@code Administrador} usando o construtor da classe mãe. Também define o valor do cargo da
     * instância para "Administrador" e cria um {@code Autenticador} que fica atrelado a essa instância.
     */
    public Administrador(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
        this.cargo = "Administrador";
        this.autenticador = new Autenticador();
    }
    
    @Override
    public String getLogin() {
        return this.autenticador.getLogin();
    }
    
    /**
     * Retorna a bonificação do cargo, sendo neste caso o valor padrão adicionado de 2000.
     *
     * @return 10% do salário mais 2000
     */
    public double getBonificacao() {
        return super.getBonificacao(1) + 2000.0;
    }
    
    /**
     * Método herdado da interface {@linkplain Autenticavel} que define o login e a senha do usuário através de seu
     * {@link #autenticador}.
     */
    @Override
    public void setCredenciais(String login, String senha) {
        this.autenticador.setCredenciais(login, senha);
    }
    
    /**
     * Método herdado da interface {@linkplain Autenticavel} que tenta autenticar o usuário através do seu {@link
     * #autenticador}, usando a senha informada. Retorna o sucesso ou fracasso na autenticação.
     * <p>Esse método pode ser usado por um {@linkplain SistemaInterno} para autenticar a instância ao sistema.
     */
    @Override
    public boolean autenticar(String senha) {
        return this.autenticador.autenticar(senha);
    }
}
