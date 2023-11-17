public class Locacao {
    private Veiculo objAluguel;
    private int dias;

    public Locacao(Veiculo objAluguel, int dias) {
        this.objAluguel = objAluguel;
        this.dias = dias;
    }

    public double calcularValorLocacao() {
        return objAluguel.getDiaria() * dias;
    }
}