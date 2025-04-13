import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Intervalo intervalo = new Intervalo();

        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        intervalo.setNumero1(numero1);

        System.out.println("DIgite o segundo numero: ");
        int numero2 = sc.nextInt();
        intervalo.setNumero2(numero2);

        System.out.println("Escolha entre impar ou par: ");
        String escolha = sc.next();
        intervalo.setEscolha(escolha);

        intervalo.exibir();

    }
}
