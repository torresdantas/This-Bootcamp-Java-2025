public class Alunos {
    private String nome;

    public Alunos(String nome){
        this.nome = nome;
    }


    public String getNome(String nome){
        return nome;
    }
    public String toString(){
        return "Nome:" + nome;
    }

}
