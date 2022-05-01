public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(double saldo, int agencia, int numero, Cliente cliente) {
        super(saldo, agencia, numero, cliente);
    }

    @Override
    public void deposita(double valor) {

    }

    @Override
    public boolean saca(double valor) {
        double valorSaca = valor + 0.20;
        return super.saca(valorSaca);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo()*0.01;
    }
}
