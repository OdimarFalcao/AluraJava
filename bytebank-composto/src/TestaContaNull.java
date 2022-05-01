public class TestaContaNull {
    public static void main(String[] args) {
        Conta contaMarcela = new Conta();
        contaMarcela.deposita(300);

        contaMarcela.titular = new Cliente();
        contaMarcela.titular.nome = "Marcela Lopes";
        System.out.println(contaMarcela.titular.nome);
    }
}
