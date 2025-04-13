import util.Dolar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Qual é o preço atual do Dolar? ");
        Dolar.cotacaoDolar = in.nextDouble();

        System.out.print("Quantos dolares deseja comprar? ");
        Dolar.quantidadeDolar = in.nextDouble();

        System.out.println("Quantidade a ser paga em Reais: " + Dolar.converterDolar());
    }
}
