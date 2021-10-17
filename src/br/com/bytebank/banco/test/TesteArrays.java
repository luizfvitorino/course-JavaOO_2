package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrays {
    public static void main(String[] args) {
        
        ContaCorrente cc01 = new ContaCorrente(1009, 1);
        ContaCorrente cc02 = new ContaCorrente(1009, 2);
        ContaCorrente cc03 = new ContaCorrente(1009, 3);
        ContaPoupanca cp01 = new ContaPoupanca(1009, 1, 100);
        
        Conta[] contas = {cc01, cc02, cc03, cp01};
        
        ContaCorrente refCc01 = (ContaCorrente) contas[0];
        System.out.println("CC01: " + refCc01);
        
        for (Conta conta : contas) {
            System.out.println(conta);
        }
        
        System.out.println("Saldo da " + cp01 + " => " + cp01.getSaldo());
        
    }
}
