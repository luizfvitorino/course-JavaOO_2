package br.com.bytebank.banco.model;

/**
 * Extende a classe {@link Conta}, sendo um modelo instanciável de conta no Bytebank.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class ContaPoupanca extends Conta {
    
    /**
     * Constrói uma nova conta com agência e número de conta, usando o construtor da classe mãe. Além disso, define o
     * seu {@linkplain Conta#tipo} para "Conta-poupança".
     */
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
        this.tipo = "Conta-poupança";
    }
}
