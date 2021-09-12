public class Funcionario {
    private String nome;
    private String cpf;
    private int cargo = 0; // 0 = comum, 1 = gerente, 2 = diretor
    private double salario;
    
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getCargo() {
        if (this.cargo == 1) return "Gerente (1)";
        else if (this.cargo == 2) return "Diretor (2)";
        return "Comum (0)";
    }
    
    public void setCargo(int cargo) {
        if (cargo >= 0 && cargo <= 2) {
            this.cargo = cargo;
        } else this.cargo = 0;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificacao() {
        if (this.cargo == 0) {
            return this.salario * 0.1;
        } else if (this.cargo == 1) {
            return this.salario;
        } else if (this.cargo == 2) {
            return this.salario + 1000.0;
        } else return 0;
    }
}
