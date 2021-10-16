package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.ContaCorrente;

public class TesteArrays {
    public static void main(String[] args) {
        
        ContaCorrente cc01 = new ContaCorrente(1009, 1);
        ContaCorrente cc02 = new ContaCorrente(1009, 2);
        ContaCorrente cc03 = new ContaCorrente(1009, 3);
        ContaCorrente cc04 = new ContaCorrente(1009, 4);
        
        ContaCorrente[] contas = {cc01, cc02, cc03, cc04};
    
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i]);
        }
    
    }
}
