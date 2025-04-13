public class ListaAluno {
    public static void main(String[] args) {
        String alunos[] = {"", "Matheus", "João", "Roberto"};

        for(int x = 1; x < alunos.length; x++){
            System.out.println("O aluno do indice " + x + " é: " + alunos[x]);
        }
    }
}
