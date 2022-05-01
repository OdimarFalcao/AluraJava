public class testaBanco {
    public static void main(String[] args) {
        Cliente Paulo = new Cliente();
        Paulo.cpf = "3271-12";
        Paulo.nome = "Paulo Galvão";
        Paulo.profissao = "Cachaceiro";

        Conta contadoPaulo = new Conta();
        contadoPaulo.deposita(400);
        contadoPaulo.numero = 24287;
        contadoPaulo.titular = Paulo;
        contadoPaulo.agencia = 060571;

        System.out.println(contadoPaulo.titular.nome);
    }
}