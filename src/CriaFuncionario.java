public class CriaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario001 = new Funcionario("Nico Steppat", "434.343.434-44");
        funcionario001.setSalario(2500.00);
    
        System.out.println(funcionario001.getNome());
        System.out.println(funcionario001.getSalario());
        System.out.println(funcionario001.getBonificacao());
    }
}
