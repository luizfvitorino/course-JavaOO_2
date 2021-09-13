public class CriaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario001 = new Funcionario("Nico Steppat", "434.343.434-44");
        funcionario001.setSalario(2500.00);
        
        Gerente gerente001 = new Gerente("Carla Andrade", "333.222.333-22");
        gerente001.setSalario(4500.00);
        gerente001.setSenha("222a");
        
        System.out.println(funcionario001.getNome());
        System.out.println(funcionario001.getSalario());
        System.out.println(funcionario001.getBonificacao());
        System.out.println();
        System.out.println(gerente001.getNome());
        System.out.println(gerente001.getSalario());
        System.out.println(gerente001.getBonificacao());
        System.out.println();
        
        boolean gerenteAutenticado = gerente001.autenticar("222a");
        System.out.println(gerenteAutenticado);
    }
}
