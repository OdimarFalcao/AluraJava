public class Criaconta {
    public static void main(String args[]){
        Conta primeiraconta = new Conta();
         primeiraconta.saldo = 200;
         primeiraconta.agencia = 24287;
         primeiraconta.numnero = 060572;
         primeiraconta.titular = "Iranildafalcao";
         System.out.println(primeiraconta);

        Conta segundaconta = new Conta();
         segundaconta.saldo = 100;
         segundaconta.agencia = 24287;
         segundaconta.numnero = 060571;
         segundaconta.titular = "Odimarfalcao";
         System.out.println(segundaconta);

    }
}
