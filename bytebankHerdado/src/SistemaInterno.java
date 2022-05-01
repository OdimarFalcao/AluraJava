public class SistemaInterno  {
    public int senha = 12345678;

    public void autentica(Autenticavel autenticavel){
        boolean autenticou = autenticavel.autentica(this.senha);
        if(autenticou){
            System.out.println("Pode entrar no sistema");
        }else System.out.println("Senha errada");
    }
}
