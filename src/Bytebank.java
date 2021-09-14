public class Bytebank {
    public static void main(String[] args) {
        
        Gerente ger001 = new Gerente("Carla Andrade", "333.222.333-22", 4500.00);
        ger001.setLogin("candrade");
        ger001.setSenha("candrade");
        
        ger001.autenticar("candrade", "candrade");
        
        ContaCorrente cc01 = new ContaCorrente(1001, 1);
        cc01.setTitular(new Cliente("Paulo Silveira", "111.111.111-12"));
        cc01.depositar(100);
        
    }
}
