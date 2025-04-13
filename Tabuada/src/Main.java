import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabuada tabuada = new Tabuada();


        System.out.println("Digite um número entre 1 e 9: ");
        int numero = sc.nextInt();
        tabuada.setNumero(numero);

        System.out.println("Tabuada do " + numero + ": ");
        tabuada.exibir();
    }
}
