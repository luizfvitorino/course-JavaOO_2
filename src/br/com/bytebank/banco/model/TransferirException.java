package br.com.bytebank.banco.model;

public class TransferirException
        extends Exception {
    public TransferirException() {
        super();
    }
    
    public TransferirException(String msg) {
        super(msg);
    }
}
