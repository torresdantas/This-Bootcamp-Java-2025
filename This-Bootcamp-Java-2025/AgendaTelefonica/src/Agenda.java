import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatoList;

    public Agenda() {
        this.contatoList = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone, String email){
        Contato contato = new Contato(nome, telefone, email);
        this.contatoList.add(contato);
    }
    public void removerContatos(String nome){
        List<Contato> contatosParaRemover = new ArrayList<>();
        if(!contatoList.isEmpty()){
            for(Contato c : contatoList){
                if(c.getNome().equalsIgnoreCase(nome)){
                    contatosParaRemover.add(c);
                }
            }
            if(contatosParaRemover != null){
                contatoList.removeAll(contatosParaRemover);
            }
        }
    }
    public List<Contato> buscarContatos(String nome){
        List<Contato> buscador = new ArrayList<>();
        if(!contatoList.isEmpty()){
            for(Contato contato : contatoList){
                if(contato.getNome().equalsIgnoreCase(nome)){
                    buscador.add(contato);
                }
            }
        }

        return buscador;
    }


    public void exibirContatos(){
        System.out.println(contatoList);
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato("Matheus", "123", "torres@gmail.com");
        agenda.adicionarContato("Daniela", "3", "danny@gmail.com");
        agenda.removerContatos("");


        System.out.println(agenda.buscarContatos("Daniela"));
    }
}
