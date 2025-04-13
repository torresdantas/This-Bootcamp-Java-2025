import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IMC imc = new IMC();

        System.out.println("== Calculadora de IMC ==");

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        imc.setAltura(altura);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        imc.setPeso(peso);

        double imcFinal = imc.calcularImc();
        System.out.printf("Seu IMC é: %.2f\n", imcFinal);

        if(imcFinal <= 18.5){
            System.out.println("");

        }
    }
}
