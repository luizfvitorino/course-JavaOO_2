public class ControleBonificacao {
    
    private double totalBoni;
    
    public void registrarBoni(Funcionario func) {
        double boni = func.getBonificacao();
        totalBoni += boni;
    }
    
    public double getTotalBonificacoes() {
        return totalBoni;
    }
}
