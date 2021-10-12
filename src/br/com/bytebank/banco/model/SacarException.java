package br.com.bytebank.banco.model;

/**
 * A classe {@code SacarException} é uma <em>checked exception</em> e informa sempre que há algum problema
 * que impeça o método {@link Conta#sacar(double)} de ser realizado.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public class SacarException
        extends Exception {
    public SacarException() {
        super();
    }
    
    public SacarException(String msg) {
        super(msg);
    }
}
