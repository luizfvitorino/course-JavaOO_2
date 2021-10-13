package br.com.bytebank.banco.model;

/**
 * Extende a classe {@link Funcionario}, sendo um modelo instanciável de funcionário. Esta classe representa o cargo de
 * Estagiário dentro do Bytebank.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class Estagiario
        extends Funcionario {
    
    /**
     * Constrói um novo {@code Estagiario} usando o construtor da classe mãe. Também define o valor do cargo da
     * instância para "Estagiário".
     */
    public Estagiario(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
        this.cargo = "Estagiário";
    }
    
    /**
     * Retorna a bonificação do cargo, sendo neste caso o valor padrão.
     *
     * @return 10% do salário
     */
    public double getBonificacao() {
        return super.getBonificacao(1);
    }
}
