package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        
        List<Conta> contasList = new ArrayList<>();
        
        Conta cc01 = new ContaCorrente(1001, 132);
        Conta cc02 = new ContaCorrente(1001, 251);
        Conta cc03 = new ContaCorrente(1001, 35);
        Conta cp01 = new ContaPoupanca(1001, 132);
        
        contasList.add(cc01); contasList.add(cc02); contasList.add(cc03); contasList.add(cp01);
        
        System.out.println(cc01.equals(cp01));
    
        System.out.println("Quantidade de contas na lista: " + contasList.size());
        contasList.forEach(System.out::println);
    
        System.out.println("----------");
    
        Comparator<Conta> comparator = new numberComparator();
        contasList.sort(comparator);
        
        contasList.forEach(System.out::println);
        
    }
}

class numberComparator implements Comparator<Conta> {
    
    @Override
    public int compare(Conta c01, Conta c02) {
        return Integer.compare(c01.getNumero(), c02.getNumero());
    }
}
