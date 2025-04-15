import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroLista;

    public CatalogoLivros(){ this.livroLista = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaAutor(String autor){
        List<Livro> pesquisa = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    pesquisa.add(l);
                }
            }
        }
        return pesquisa;
    }

    public List<Livro> pesquisarPorAno(int anoInicial, int anoFianl){
        List<Livro> pesquisaAno = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFianl){
                    pesquisaAno.add(l);
                }
            }
        }
        return pesquisaAno;
    }
    public Livro pesquisaPorTitulo(String titulo){
        Livro pesquisaTitulo = null;
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    pesquisaTitulo = l;
                    break;
                }
            }
        }
        return pesquisaTitulo;
    }


}
