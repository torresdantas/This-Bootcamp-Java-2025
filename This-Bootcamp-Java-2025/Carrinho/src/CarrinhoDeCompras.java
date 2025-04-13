import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> estoque;

    public CarrinhoDeCompras(){
        this.estoque = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double valor){
        estoque.add(new Item(nome, quantidade, valor));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item t : estoque) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(t);
            }
        }
        estoque.removeAll(itensParaRemover);
    }
    public void valorTotal(int quantidade, double valor){
        double totalEstoque = quantidade * valor;
        System.out.println("Valor em Estoque: " + totalEstoque);
    }
    public void exibirItens(){
        if(estoque.isEmpty()){
            System.out.println("Estoque Vazio!");
        }else{
            System.out.println("Itens no Estoque: ");
            for(Item item : estoque){
                System.out.println("Nome:" + item.getNome());
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras estoque1 = new CarrinhoDeCompras();

        estoque1.exibirItens();
    }
}