public class Cliente implements Autenticavel {
    private Autenticador autenticador;

    public Cliente(){
        this.autenticador = new Autenticador();
    }

    public void setsenha(int senha){
        this.autenticador.setsenha(senha);
    }

    @Override
    public int getSenha() {
        return this.autenticador.getSenha();
    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }


}
