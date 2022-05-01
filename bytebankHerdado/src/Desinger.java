public class Desinger extends Funcionario {
    @Override
    public double getBonificacao() {
        return super.getSalario()+250;
    }

}
