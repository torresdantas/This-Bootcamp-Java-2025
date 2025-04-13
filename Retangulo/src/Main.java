import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a Altura do Retangulo: ");
        double altura = sc.nextDouble();
        retangulo.setAltura(altura);

        System.out.println("Digite a Base do Retangulo: ");
        double base = sc.nextDouble();
        retangulo.setBase(base);

        System.out.println("A área desse retangulo é igual a: " + retangulo.CalcularArea());
    }
}
