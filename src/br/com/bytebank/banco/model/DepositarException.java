package br.com.bytebank.banco.model;

/**
 * A classe {@code DepositarException} é uma <em>checked exception</em> e informa sempre que há algum problema
 * que impeça o método {@link Conta#depositar(double)} de ser realizado.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public class DepositarException extends Exception {
    
    public DepositarException() {
        super();
    }
    
    public DepositarException(String msg) {
        super(msg);
    }
}
