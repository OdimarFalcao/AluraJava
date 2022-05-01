public class Autenticador {
    public int senha;

    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }else return false;
    }

    public void setsenha(int senha) {
        this.senha=senha;
    }

    public int getSenha() {
        return  this.senha;
    }
}
