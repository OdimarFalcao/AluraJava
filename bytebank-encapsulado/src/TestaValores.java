public class TestaValores {
    public static void main(String[] args) {
        Conta contapaulo = new Conta(100,24287,29292992,new Cliente("Paulo Galvão","40028922","Programador"));
        System.out.println(contapaulo.toString());
        Conta contaMarcela = new Conta(200,24287,32711212,new Cliente("Marcela Lopes","88194614","Programador"));
        System.out.println(contapaulo.toString());
        System.out.println("O total de contas é : "+Conta.getTotal());

        contapaulo.deposita(200);
        contapaulo.transfere(50,contaMarcela);
        contaMarcela.extrato();
        contaMarcela.saca(100);
        contaMarcela.extrato();

    }
}
