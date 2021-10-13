package br.com.bytebank.banco.model;

/**
 * Modelo de todos os clientes do Bytebank. As suas instâncias guardam nome e CPF dos clientes.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class Cliente {
    
    private final String nome;
    private final long cpf;
    
    /**
     * Constrói um novo {@code cliente} com nome e CPF.
     * <p>Se o CPF informado não tiver <b>exatamente 11 números</b> ou for negativo, uma
     * {@linkplain IllegalArgumentException} é lançada e a instância não é criada.
     *
     * @param nome define o nome
     * @param cpf  inteiro de 11 dígitos que define o CPF
     */
    public Cliente(String nome, long cpf) {
        String cpfAsString = String.valueOf(cpf);
        
        if (cpfAsString.length() != 11 || cpf <= 0)
            throw new IllegalArgumentException("CPF inválido: insira um número positivo de 11 dígitos.");
        this.cpf = cpf;
        
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public long getCpf() {
        return cpf;
    }
}
