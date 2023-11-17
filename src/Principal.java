import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os detalhes do Carro Sedan:");
        System.out.println("Marca:");
        String marca = scanner.nextLine();
        System.out.println("Modelo:");
        String modelo = scanner.nextLine();
        System.out.println("Ano:");
        int ano = scanner.nextInt();
        System.out.println("Diária:");
        double diaria = scanner.nextDouble();
        scanner.nextLine();

        CarroSedan sedan = new CarroSedan(marca, modelo, ano, diaria);

        System.out.println("Digite os detalhes do Carro SUV:");
        System.out.println("Marca:");
        marca = scanner.nextLine();
        System.out.println("Modelo:");
        modelo = scanner.nextLine();
        System.out.println("Ano:");
        ano = scanner.nextInt();
        System.out.println("Diária:");
        diaria = scanner.nextDouble();
        scanner.nextLine();

        CarroSUV suv = new CarroSUV(marca, modelo, ano, diaria);

        System.out.println("Quantos dias você deseja alugar o veículo?");
        int dias = scanner.nextInt();

        Locacao locacaoSedan = new Locacao(sedan, dias);
        Locacao locacaoSUV = new Locacao(suv, dias);

        System.out.println("O valor da locação para o Carro Sedan é: " + locacaoSedan.calcularValorLocacao());
        System.out.println("O valor da locação para o Carro SUV é: " + locacaoSUV.calcularValorLocacao());

        scanner.close();
    }
}