import entidades.Produtos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Produtos produtos = new Produtos();

        System.out.println(" ");
        System.out.println("Informe as informações do produto: ");

        System.out.print("Nome: ");
        produtos.nome = in.nextLine();

        System.out.print("Preço: ");
        produtos.preco = in.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        produtos.quantidade = in.nextInt();

        System.out.println("Informações: " + produtos);
        System.out.println(" ");

        System.out.println("Quantidade a ser adicionada: ");

        int quantidades = in.nextInt();
        produtos.adicionarProduto(quantidades);

        System.out.println();
        System.out.println("Atualizado para: " + produtos);

        System.out.println("Quantidade a ser removida: ");

        quantidades = in.nextInt();
        produtos.removerProduto(quantidades);

        System.out.println();
        System.out.println("Atualizado para: " + produtos);



    }
}
