public class Gerente extends Funcionario implements Autenticavel {

    private Autenticador autenticador ;

    public Gerente(){
        this.autenticador = new Autenticador();
    }

    public double getBonificacao(){
        return super.getSalario()*2;
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setsenha(int senha) {
        this.autenticador.setsenha(senha);
    }

    @Override
    public int getSenha() {
        return autenticador.getSenha();
    }
}
