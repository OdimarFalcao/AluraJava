public class Conta {
    double saldo;
    int agencia;
    int numnero;
    String titular;

    public void deposita(double valor){
        this.saldo += valor;
    }
    public  boolean saca(double valor){
        if(this.saldo == 0){
            System.out.println("Fail : conta está zerada");
            return false;
        }
        if (valor > this.saldo) {
            System.out.println("Fail : Valor à sacar maior do que o Saldo bancário ");
            return false;
        } else this.saldo -= valor;return true;


        }
    public boolean transfere(double valor,Conta contadestino) {
        if (this.saldo >= valor) {
            contadestino.deposita(valor);
            this.saldo -= valor;
            return true;
        }
        return false;
    }




    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numnero=" + numnero +
                ", titular='" + titular + '\'' +
                '}';
    }
}
