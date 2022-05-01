public class CalculadordeImposto {

    private double totalimposto;

    public void registra(Tributavel tributavel){
        double valor = tributavel.getValorImposto();
        this.totalimposto +=valor;
    }

    public double getTotalimposto() {
        return totalimposto;
    }
}
