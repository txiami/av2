public class CarroSUV extends Veiculo {
    public CarroSUV(String marca, String modelo, int ano, double diaria) {
        super(marca, modelo, ano, diaria);
    }

    @Override
    public void setDiaria(double valor) {
        super.setDiaria(valor * 1.50);
    }
}