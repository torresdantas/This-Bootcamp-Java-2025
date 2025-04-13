import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Alunos> cadastro;

    public Cadastro(){
        this.cadastro = new ArrayList<>();
    }

    public void adicionarAluno(String nome){
        cadastro.add(new Alunos(nome));
    }
    public void exibirLista(){
       System.out.println(cadastro);
    }

    public static void main(String[] args) {
        Cadastro cad = new Cadastro();
        cad.exibirLista();
        cad.adicionarAluno("Matheus Torres");

        cad.adicionarAluno("Daniela Gonçalves");
        cad.exibirLista();
    }
}
