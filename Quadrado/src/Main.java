import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaQuadrado area = new AreaQuadrado();

        System.out.println("Digite o valor que representa o lado de um Quadrado:");
        double lado = sc.nextDouble();
        area.setLado(lado);

        System.out.println("A área desse quadrado é igual a: " + area.calcularArea());
    }
}
