public class TesteConta {
    public static void main(String[] args) {
        Cliente falcao = new Cliente("Odimar Falcão","06057","Programador");
        Cliente junior = new Cliente("Ewaldo Junior","07283","Programador");
        ContaCorrente ccf = new ContaCorrente(100,24287,1234567,falcao);
        ContaPoupança cpj = new ContaPoupança(100,24287,7654321,junior);
            ccf.deposita(200);
            ccf.extrato();
            ccf.transfere(150,cpj);
            ccf.saca(10);
            ccf.extrato();


    }
}
