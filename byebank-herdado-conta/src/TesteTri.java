public class TesteTri {
    public static void main(String[] args) {
        Cliente falcao = new Cliente("Odimar Falcão","06057","Programador");
        ContaCorrente ccf = new ContaCorrente(100,24287,1234567,falcao);

        SegurodeVida seg = new SegurodeVida();


        CalculadordeImposto calc = new CalculadordeImposto();
        calc.registra(ccf);
        calc.registra(seg);
        System.out.println(calc.getTotalimposto());

    }
}
