package br.com.bytebank.banco.model;

/**
 * Uma <em>checked exception</em> que, quando lançada, informa sobre problemas que impeçam o método {@linkplain
 * Conta#depositar(double)} de ser realizado.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class DepositarException extends Exception {
    
    public DepositarException() {
        super();
    }
    
    public DepositarException(String msg) {
        super(msg);
    }
}
