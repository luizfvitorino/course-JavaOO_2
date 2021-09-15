public class BytebankSistema {
    public static void main(String[] args) {
        Gerente ger001 = new Gerente("Carlos", "455.455.455-55", 4450.0);
        ger001.setCredenciais("carl22", "cardan22");
    
        SistemaInterno SI = new SistemaInterno();
        SI.autenticar(ger001);
    }
}
