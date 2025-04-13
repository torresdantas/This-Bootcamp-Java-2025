import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalcIdadeDifff calc = new CalcIdadeDifff();


        System.out.println("Digite a primeira idade: ");
        int idade1 = sc.nextInt();
        calc.setIdade1(idade1);
        System.out.println("Digite a segunda idade: ");
        int idade2 = sc.nextInt();
        calc.setIdade2(idade2);

        System.out.println("A diferença entre as idade é igual a: ");

        if(idade1 - idade2 == 0){
            System.out.println("Não exite diferença...");
        }else{
            calc.calcularDiff();
        }
    }
}
