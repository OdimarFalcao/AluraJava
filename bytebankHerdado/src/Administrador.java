public class Administrador extends Funcionario implements Autenticavel{

    private Autenticador autenticador;

    public Administrador(){
        this.autenticador = new Autenticador();
    }
    @Override
    public double getBonificacao() {
        return super.getSalario()+3000;
    }


    public int getSenha() {
        return this.autenticador.getSenha();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setsenha(int senha) {
        this.autenticador.setsenha(senha);
    }
}
