import java.awt.*;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
            primeiraconta.saldo = 300;
            System.out.println("Saldo primeira conta é "+ primeiraconta.saldo);

        Conta segundaconta = primeiraconta;
        System.out.println("Saldo segunda conta é "+ segundaconta.saldo);
        segundaconta.saldo += 100;
        System.out.println("Saldo segunda conta é "+ segundaconta.saldo);
        System.out.println("Saldo primeira conta é "+ primeiraconta.saldo);




    }
}
