public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double diaria;

    public Veiculo(String marca, String modelo, int ano, double diaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double valor) {
        this.diaria = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", diaria=" + diaria +
                '}';
    }
}
