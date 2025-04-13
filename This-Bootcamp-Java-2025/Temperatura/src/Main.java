import entidades.Temperatura;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Temperatura temp = new Temperatura();

        System.out.println("Qual a temperatura em Celsius? ");
        temp.temperatura = in.nextDouble();

        System.out.println(temp);
    }
}
