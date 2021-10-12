package br.com.bytebank.banco.test;


import br.com.bytebank.banco.model.*;

public class BytebankConta {
    public static void main(String[] args) {
        
        ContaCorrente cc01 = new ContaCorrente(1001, 1);
        cc01.setTitular(new Cliente("Paulo Silveira", "111.111.111-12"));
        cc01.depositar(100);
        
        ContaCorrente cc02 = new ContaCorrente(1001, 2);
        
        System.out.println("Total de contas existentes: " + Conta.getTotal());
        
        System.out.println();
        System.out.println(cc01.getTitular() + " de nome " + cc01.getTitular().getNome()
                + " e CPF " + cc01.getTitular().getCpf());
        System.out.println("> Agência: " + cc01.getAgencia() + " | Conta: 0" + cc01.getNumero());
        System.out.println("> Saldo disponível: R$" + cc01.getSaldo());
        System.out.println();
        
        try {
            cc01.sacar(101.0);
        } catch (SacarException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            cc01.transferir(101.0, cc02);
        } catch (TransferirException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println();
        System.out.println("Fim do código");
    }
}
