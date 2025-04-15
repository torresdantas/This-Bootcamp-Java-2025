import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Filme> filmeList;

    public Locadora() {
        this.filmeList = new ArrayList<>();
    }
    public void adicionarFilme(String titulo, String genero){
        Filme filme = new Filme(titulo, genero);
        this.filmeList.add(filme);
    }
    public void removerFilme(String titulo){
        List<Filme> filmesParaRemover = new ArrayList<>();
        if(!filmeList.isEmpty()){
            for(Filme filme : filmeList){
                if(filme.getTitulo().equalsIgnoreCase(titulo)){
                    filmesParaRemover.add(filme);
                }
            }
            if(!filmesParaRemover.isEmpty()){
                filmeList.removeAll(filmesParaRemover);
            }
        }
    }
    public List<Filme> buscarPorGenero(String genero){
        List<Filme> buscador = new ArrayList<>();
        if(!filmeList.isEmpty()){
            for(Filme filme : filmeList){
                if(filme.getGenero().equalsIgnoreCase(genero)){
                    buscador.add(filme);
                }
            }
        }
        return buscador;
    }

    public void listarFilmes(){
        System.out.println(filmeList);
    }
}
