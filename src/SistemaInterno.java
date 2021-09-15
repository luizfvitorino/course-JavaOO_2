public class SistemaInterno {
    private String senha = "cardan22";
    
    public void autenticar(Autenticavel auth) {
        boolean autenticado = auth.autenticar(this.senha);
        
        if (autenticado) {
            System.out.println("Login autorizado: Seja bem-vinde ao sistema interno.");
        } else System.out.println("Login rejeitado: Não foi possível entrar no sistema.");
    }
}
