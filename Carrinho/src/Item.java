public class Item{
    private String nome;
    private int quantidade;
    private double valor;

    public Item(String nome, int quantidade, double valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getValor(){
        return valor;
    }
}