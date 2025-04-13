package entidades;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + " ,R$ " + "Valor unitário: " + preco + ", " + quantidade + " unidades, Total: " + valorEmEstoque();
    }
}
