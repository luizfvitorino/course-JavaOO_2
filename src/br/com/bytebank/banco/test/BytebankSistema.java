package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.*;

/**
 * Esta {@code main class} testa as classes relacionadas ao sistema interno do Bytebank.
 *
 * @author Luiz Moreira
 * @version 1.0
 */
public class BytebankSistema {
    public static void main(String[] args) {
        Gerente ger001 = new Gerente("Carlos", 45545545555L, 4450.0);
        ger001.setCredenciais("carl22", "cardan22");
        
        SistemaInterno SI = new SistemaInterno("cardan22");
        SI.autenticar(ger001);
    }
}
