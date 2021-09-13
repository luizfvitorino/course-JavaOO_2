public class CriaFuncionario {
    public static void main(String[] args) {
        Gerente gerente001 = new Gerente("Carla Andrade", "333.222.333-22");
        gerente001.setSalario(4500.00);
        gerente001.setLogin("candrade");
        gerente001.setSenha("candrade");
        
        gerente001.autenticar("candrade", "candrade");
    }
}
