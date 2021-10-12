package br.com.bytebank.banco.model;

/**
 * A classe {@code TransferirException} é uma <em>checked exception</em> e informa sempre que há
 * algum problema que impeça o método {@link Conta#transferir(double, Conta)} de ser realizado.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public class TransferirException
        extends Exception {
    public TransferirException() {
        super();
    }
    
    public TransferirException(String msg) {
        super(msg);
    }
}
