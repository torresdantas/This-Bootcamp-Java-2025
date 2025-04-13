public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setIdade(20);
        pessoa1.setNome("Matheus");

        System.out.println("Olá " + pessoa1.getNome());
        System.out.println("Sua idade é: " + pessoa1.getIdade());
    }
}
