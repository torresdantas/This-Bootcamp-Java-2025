import java.util.Random;
import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        int secret = ra.nextInt(9) + 1;
        int chute;
        int fichas = 3;

        System.out.println(secret);
        System.out.println("Você tem " + fichas + " Fichas");

        while(fichas > 0){
            System.out.println(" ");
            chute = sc.nextInt();

            if(chute > secret){
                fichas--;
                System.out.println("Quase, menor :)");
                System.out.println("Fichas: " + fichas);
            }else if(chute < secret){
                fichas--;
                System.out.println("Quase, maior :) ");
                System.out.println("Fichas: " + fichas);
            }else{
                System.out.println("Parabens!!!!!!!!!!!!");
                break;
            }
            if(fichas == 0){
                System.out.println("Acabou as fichas :( ");
            }
        }


    }
}
