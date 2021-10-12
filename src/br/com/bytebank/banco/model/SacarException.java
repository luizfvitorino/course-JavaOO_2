package br.com.bytebank.banco.model;

public class SacarException
        extends Exception {
    public SacarException() {
        super();
    }
    
    public SacarException(String msg) {
        super(msg);
    }
}
