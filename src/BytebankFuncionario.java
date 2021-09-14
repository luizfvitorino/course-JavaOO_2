public class BytebankFuncionario {
    public static void main(String[] args) {
        
        Gerente ger001 = new Gerente("Carla Andrade", "333.222.333-22", 4500.00);
        ger001.setLogin("candrade");
        ger001.setSenha("candrade");
        
        ger001.autenticar("candrade", "candrade");
        
    }
}
