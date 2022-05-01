public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(double saldo, int agencia,int numero, Cliente cliente){
        Conta.total++;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = cliente;
    }

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

    public void extrato(){
        System.out.println("O saldo de "+this.titular.getNome()+" é de "+getSaldo());
    }
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public String toString() {
        return "Conta{" +
                "saldo=" + getSaldo() +
                ", agencia=" + getAgencia() +
                ", numnero=" + getNumero() +
                ", titular='" + getTitular() + '\'' +
                '}';
    }
}
