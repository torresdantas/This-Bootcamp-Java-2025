import entidades.Media;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Media calculadora = new Media();

        System.out.println("Media Calculadora: ");
        System.out.print("Digite seu nome: ");
        calculadora.nome = in.nextLine();

        System.out.println("Digite suas 3 notas: ");
        calculadora.a = in.nextDouble();
        calculadora.b = in.nextDouble();
        calculadora.c = in.nextDouble();

        System.out.println(calculadora);

    }
}