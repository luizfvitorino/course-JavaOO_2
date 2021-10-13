package br.com.bytebank.banco.model;

/**
 * Uma <em>checked exception</em> que, quando lançada, informa sobre problemas que impeçam o método {@link
 * Conta#sacar(double)} de ser realizado.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class SacarException extends Exception {
    
    public SacarException() {
        super();
    }
    
    public SacarException(String msg) {
        super(msg);
    }
}
