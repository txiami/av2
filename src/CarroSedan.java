public class CarroSedan extends Veiculo {
    public CarroSedan(String marca, String modelo, int ano, double diaria) {
        super(marca, modelo, ano, diaria);
        setDiaria(diaria);
    }

    @Override
    public void setDiaria(double valor) {
        super.setDiaria(valor * 1.10);
    }
}
