import entidades.Funcionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Cadastro Funcionário: ");
        System.out.print("Nome: ");
        funcionario.nome = in.nextLine();

        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = in.nextDouble();

        System.out.print("Impostos: ");
        funcionario.taxa = in.nextDouble();


        System.out.println();
        System.out.println("Funcionario: " + funcionario.nome + ", " + "R$ " + funcionario.salarioLiquido());

        System.out.println("Qual porcentagem para aumento salarial? ");
        double porcentagem = in.nextDouble();
        funcionario.aumentoSalarial(porcentagem);

        System.out.println();
        System.out.println("Atualização: " + funcionario.toString());


    }
}
