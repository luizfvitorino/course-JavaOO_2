package br.com.bytebank.banco.model;

/**
 * Extende a classe {@link Conta}, sendo um modelo instanciável de conta no Bytebank.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class ContaCorrente extends Conta {
    
    /**
     * Constrói uma nova conta com agência e número de conta, usando o construtor da classe mãe. Além disso, define o
     * seu {@linkplain Conta#tipo} para "Conta-corrente".
     */
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        this.tipo = "Conta-corrente";
    }
    
    /**
     * Sobrepõe o {@linkplain Conta#sacar(double)}. Realiza um saque adicionando $2 de taxa fixa ao valor informado e
     * repassando o valor total ao método herdado da classe mãe.
     */
    @Override
    public void sacar(double valor) throws SacarException {
        valor += 2;
        super.sacar(valor);
    }
}
