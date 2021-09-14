public class Bytebank {
    public static void main(String[] args) {
        Gerente ger001 = new Gerente("Carla Andrade", "333.222.333-22", 4500.00);
        ger001.setLogin("candrade");
        ger001.setSenha("candrade");
        
        ger001.autenticar("candrade", "candrade");
        
        Estagiario est001 = new Estagiario("Joaquim Cesar", "343.004.443-55", 1600);
        
        ControleBonificacao controleBoni = new ControleBonificacao();
        controleBoni.registrarBoni(ger001);
        controleBoni.registrarBoni(est001);
        
        ContaCorrente cc01 = new ContaCorrente(1001, 1);
        cc01.setTitular(new Cliente("Paulo Silveira", "111.111.111-12"));
        cc01.depositar(100);
    
        System.out.println("Total de bonificações distribuídas na empresa: "
                + controleBoni.getTotalBonificacoes());
    }
}
