import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, Digite seu nome, e logo após digite sua idade :)");
        String nomePessoa = sc.nextLine();
        pessoa.setNome(nomePessoa);

        int idadePessoa = sc.nextInt();
        pessoa.setIdade(idadePessoa);

        System.out.println("Olá, " + pessoa.getNome() + "!");
        System.out.println("Nossa, você não parece ter " + pessoa.getIdade() + " Anos");
    }
}
