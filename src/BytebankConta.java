public class BytebankConta {
    public static void main(String[] args) {
    
        ContaCorrente cc01 = new ContaCorrente(1001, 1);
        cc01.setTitular(new Cliente("Paulo Silveira", "111.111.111-12"));
        cc01.depositar(100);
    
        System.out.println();
        System.out.println(cc01.getTitular() + " de nome " + cc01.getTitular().getNome()
                + " e CPF " + cc01.getTitular().getCpf());
        System.out.println("> Agência: " + cc01.getAgencia() + " | Conta: 0" + cc01.getNumero());
        System.out.println("> Saldo disponível: R$" + cc01.getSaldo());
        System.out.println();
    
        System.out.print("Total de contas existentes: " + Conta.getTotal());
        
    }
}
