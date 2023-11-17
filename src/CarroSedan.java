public class CarroSedan extends Veiculo {
    public CarroSedan(String marca, String modelo, int ano, double diaria) {
        super(marca, modelo, ano, diaria);
        System.out.println(diaria);
        setDiaria(diaria);
        System.out.println(diaria);
    }

    @Override
    public void setDiaria(double valor) {
        super.setDiaria(valor * 1.10);
    }
}
