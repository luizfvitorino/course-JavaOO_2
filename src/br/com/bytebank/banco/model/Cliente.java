package br.com.bytebank.banco.model;

/**
 * A classe {@code Cliente} é o modelo de todos os clientes do Bytebank.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public class Cliente {
    private final String nome;
    private final long cpf;
    
    /**
     * Constrói um novo cliente a partir do seu nome e CPF. Se o CPF informado não tiver exatamente 11 números,
     * uma {@linkplain IllegalArgumentException} é lançada e a instância não é criada.
     *
     * @param nome String que define o nome do cliente
     * @param cpf Número inteiro de 11 dígitos que define o CPF do cliente
     */
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        
        String cpfAsString = String.valueOf(cpf);
        if (cpfAsString.length() != 11) {
            throw new IllegalArgumentException("CPF inválido: O CPF deve ter 11 números seguidos de um 'L'.");
        } else this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public long getCpf() {
        return cpf;
    }
}
