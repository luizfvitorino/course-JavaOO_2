package br.com.bytebank.banco.model;

/**
 * A classe {@code ContaCorrente} extende a classe {@link Conta}, sendo um modelo de conta instanciável.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public class ContaCorrente extends Conta {
    
    /**
     * Constrói uma nova conta com o número da agência e o número da conta, usando o construtor
     * da sua classe mãe, {@link Conta}. Além disso, define o seu {@linkplain Conta#tipo} para
     * "Conta Corrente".
     *
     * @param agencia Número inteiro, maior que 1000, que define a agência.
     * @param numero Número inteiro positivo que define o número da conta.
     */
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        this.tipo = "Conta Corrente";
        
        System.out.println("Criando a " + tipo + " 0" + numero + " na agência " + agencia + "...");
    }
    
    /**
     * Método que realiza um saque na conta-corrente, adicionando R$2 de taxa fixa ao valor informado
     * e repassando o valor total ao método herdado/sobreposto da classe mãe ( {@linkplain Conta#sacar(double)} ).
     *
     * @param valor Número não inteiro a ser sacado do saldo
     */
    @Override
    public void sacar(double valor) throws SacarException {
        valor += 2;
        super.sacar(valor);
    }
}
