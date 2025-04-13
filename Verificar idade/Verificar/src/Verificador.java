import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Verificador de idade----");
        System.out.println("Primeiro digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome);

        System.out.println("Agora digite sua idade, irei verificar...");
        int idade = sc.nextInt();

        if(idade > 18){
            System.out.println("Parabens");
        }else{
            System.out.println("Não permitido");
        }
        sc.close();
    }
}
