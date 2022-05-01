public class TesteSistema {
    public static void main(String[] args) {
        Gerente falcao = new Gerente();
        Autenticavel ewaldo = new Administrador();
        Cliente simone = new Cliente();

        falcao.setsenha(12345678);
        ewaldo.setsenha(12345678);
        SistemaInterno si = new SistemaInterno();
        si.autentica(falcao);
        si.autentica(ewaldo);

    }
}
