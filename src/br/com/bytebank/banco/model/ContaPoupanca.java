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
    
    /**
     * Constrói uma nova conta com agência e número de conta, usando o construtor da classe mãe e definindo o seu tipo,
     * além de definir o depósito inicial a ser feito na poupança.
     *
     * @param depositoInicial o saldo da instância é iniciado com esse valor, caso não hajam exceções
     */
    public ContaPoupanca(int agencia, int numero, double depositoInicial) {
        super(agencia, numero);
        try {
            this.depositar(depositoInicial);
        } catch (DepositarException ex) {
            System.out.println(ex.getMessage());
        }
        this.tipo = "Conta-poupança";
    }
}
