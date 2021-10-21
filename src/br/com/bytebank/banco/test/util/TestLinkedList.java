package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        
        List<Conta> contasList = new LinkedList<>();
        
        Conta cc01 = new ContaCorrente(1001, 1);
        Conta cc02 = new ContaCorrente(1001, 2);
        Conta cc03 = new ContaCorrente(1001, 3);
        Conta cc04 = new ContaCorrente(1001, 3);
        Conta cp01 = new ContaPoupanca(1001, 1);
        
        contasList.add(cc01); contasList.add(cc02); contasList.add(cc03); contasList.add(cp01);
    
        System.out.println(contasList.contains(cc04));
        System.out.println(cc01.equals(cp01));
        
        System.out.println("Quantidade de contas na lista: " + contasList.size());
        contasList.forEach(System.out::println);
        
    }
}
