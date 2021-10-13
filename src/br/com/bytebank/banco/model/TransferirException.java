package br.com.bytebank.banco.model;

/**
 * Uma <em>checked exception</em> que, quando lançada, informa sobre problemas que impeçam o método {@link
 * Conta#transferir(double, Conta)} de ser realizado.
 *
 * @author Luiz Moreira
 * @since 1.0
 */
public class TransferirException extends Exception {
    
    public TransferirException() {
        super();
    }
    
    public TransferirException(String msg) {
        super(msg);
    }
}
