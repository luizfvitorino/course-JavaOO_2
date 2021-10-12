package br.com.bytebank.banco.model;

public class Gerente
        extends Funcionario
        implements Autenticavel
{
    private final Autenticador autenticador;
    
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.cargo = "Gerente";
        this.autenticador = new Autenticador();
    }
    
    public double getBonificacao() {
        return super.getBonificacao(1) + this.getSalario();
    }
    
    @Override
    public void setCredenciais(String login, String senha) {
        this.autenticador.setCredenciais(login, senha);
    }
    
    @Override
    public String getLogin() {
        return this.autenticador.getLogin();
    }
    
    @Override
    public boolean autenticar(String senha) {
        return this.autenticador.autenticar(senha);
    }
    
}
