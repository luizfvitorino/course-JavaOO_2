package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        
        ArrayList<Conta> contasList = new ArrayList<>();
        
        Conta cc01 = new ContaCorrente(1001, 1);
        Conta cc02 = new ContaCorrente(1001, 2);
        Conta cc03 = new ContaCorrente(1001, 3);
        Conta cp01 = new ContaPoupanca(1010, 1);
        
        contasList.add(cc01); contasList.add(cc02); contasList.add(cc03); contasList.add(cp01);
    
        System.out.println("Quantidade de contas na lista: " + contasList.size());
        
        contasList.forEach(System.out::println);
        
    }
}
