import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é tipo de carro ?");
        System.out.println("1- SEDAN");
        System.out.println("2- SUV");
        System.out.println("3- Sair");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        int condiçãoWhile = 1;

        while(condiçãoWhile == 1) {
        if(escolha == 1 ) {

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

            System.out.println("Quantos dias você deseja alugar o veículo?");
            int dias = scanner.nextInt();

            Locacao locacaoSedan = new Locacao(sedan, dias);

            System.out.println(sedan.toString());
            System.out.printf("\nValor da locação do Sedan: R$" + df.format(locacaoSedan.calcularValorLocacao()));
            condiçãoWhile = 0;
        }


        else if(escolha == 2 ) {
        System.out.println("Digite os detalhes do Carro SUV:");
        System.out.println("Marca:");
        String marca = scanner.nextLine();
        System.out.println("Modelo:");
        String modelo = scanner.nextLine();
        System.out.println("Ano:");
        int ano = scanner.nextInt();
        System.out.println("Diária:");
        Double diaria = scanner.nextDouble();
        scanner.nextLine();

        CarroSUV suv = new CarroSUV(marca, modelo, ano, diaria);

        System.out.println("Quantos dias você deseja alugar o veículo?");
        int dias = scanner.nextInt();

        Locacao locacaoSUV = new Locacao(suv, dias);

        System.out.println(suv.toString());
            System.out.printf("\nValor da locação do Sedan: R$" + df.format(locacaoSUV.calcularValorLocacao()));
        condiçãoWhile = 0;
        }


        else{
            condiçãoWhile = 0;
        }
        scanner.close();


        }

    }

}