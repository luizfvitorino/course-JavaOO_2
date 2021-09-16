public class CalculadorTributos
{
    private double totalTributos;
    
    public void registrar(Tributavel tributavel) {
        double valor = tributavel.getValorTributo();
        this.totalTributos += valor;
    }
    
    public double getTotalTributos() {
        return totalTributos;
    }
}
