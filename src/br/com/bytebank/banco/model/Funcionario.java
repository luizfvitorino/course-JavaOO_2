package br.com.bytebank.banco.model;

/**
 * Base de todos os funcionários registrados no Bytebank. A classe é abstrata, logo somente as suas classes filhas podem
 * ser instanciadas.
 * <p>As instâncias guardam nome, CPF, salário, bonificação e cargo dos funcionários. Quando a
 * instância é {@linkplain Autenticavel}, guarda também um objeto {@code Autenticador}.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public abstract class Funcionario {
    
    private final String nome;
    private final long cpf;
    private double salario;
    protected String cargo;
    
    /**
     * Constrói um novo funcionário com nome, CPF e salário.
     * <p>Se o CPF informado não tiver <b>exatamente 11 números</b> ou for negativo, ou se o salário
     * informado for negativo, uma {@linkplain IllegalArgumentException} é lançada e a instância não é criada.
     *
     * @param nome    define o nome
     * @param cpf     inteiro de 11 dígitos que define o CPF
     * @param salario não inteiro que define o salário
     */
    public Funcionario(String nome, long cpf, double salario) {
        String cpfAsString = String.valueOf(cpf);
        
        if (cpfAsString.length() != 11 || cpf <= 0)
            throw new IllegalArgumentException("CPF inválido: insira um número positivo de 11 dígitos.");
        this.cpf = cpf;
        
        if (salario < 0)
            throw new IllegalArgumentException("Salário inválido: O salário deve ter um valor positivo.");
        this.salario = salario;
        
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public long getCpf() {
        return cpf;
    }
    
    public double getSalario() {
        return salario;
    }
    
    /**
     * Define um novo valor para o {@link #salario} da instância, se o número informado for positivo.
     *
     * @param salario não inteiro que define o novo salário
     */
    public void setSalario(double salario) {
        if (salario <= 0) System.out.println("setSalario inválido: valor inválido.");
        else this.salario = salario;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    /**
     * A bonificação de um funcionário é um <b>valor que ele recebe a mais no salário</b>. Ela varia conforme o cargo do
     * funcionário. O valor padrão é 10% do salário.
     * <p>O multiplicador desse método é informado na sua sobreposição nas classes filhas desta. Logo,
     * o método não tem parâmetros nas classes filhas, servindo somente para <em>retornar o valor da bonificação</em>.
     *
     * @param multiplier multiplicador
     * @return salário multiplicado pela porcentagem * multiplicador
     */
    public double getBonificacao(int multiplier) {
        return this.salario * (0.1 * multiplier);
    }
}
