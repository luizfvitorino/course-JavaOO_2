package br.com.bytebank.banco.model;

/**
 * A classe {@code ContaPoupanca} extende a classe {@link Conta}, sendo um modelo de conta instanciável.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public class ContaPoupanca extends Conta {
    
    /**
     * Constrói uma nova conta com o número da agência e o número da conta, usando o construtor
     * da sua classe mãe, {@link Conta}. Além disso, define o seu {@linkplain Conta#tipo} para
     * "Conta Poupança".
     *
     * @param agencia Número inteiro, maior que 1000, que define a agência.
     * @param numero Número inteiro positivo que define o número da conta.
     */
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
        this.tipo = "Conta Poupança";
    
        System.out.println("Criando a " + tipo + " 0" + numero + " na agência " + agencia + "...");
    }
}
