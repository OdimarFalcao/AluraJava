public class testemetodo {
    public static void main(String[] args) {
        Conta contaPaulo = new Conta();
             contaPaulo.deposita(50);
             System.out.println(contaPaulo.saldo);
             contaPaulo.saca(50);
             System.out.println(contaPaulo.saldo);
             contaPaulo.saca(50);
             contaPaulo.deposita(30);
             contaPaulo.saca(40);
             contaPaulo.saca(30);
             contaPaulo.deposita(50);
        System.out.println("Saldo da conta do Paulo é : "+contaPaulo.saldo);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);
        System.out.println("Saldo da conta da Marcela é : "+contaMarcela.saldo);
        if(contaMarcela.transfere(300,contaPaulo)){
           System.out.println("Transferẽncia feita com sucesso");
        }else System.out.println("Transferência falhou");
        System.out.println("Saldo da conta da Marcela é : "+contaMarcela.saldo);
        System.out.println("Saldo da conta do Paulo é : "+contaPaulo.saldo);







    }
}
