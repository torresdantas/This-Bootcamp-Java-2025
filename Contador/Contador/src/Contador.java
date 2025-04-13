import entidade.Contar;

public class Contador {
    public static void main(String[] args) {
        int numerox1 = 7;
        int numerox2 = 1;

        try {
            Contar conta = new Contar(numerox1, numerox2);

            for(int i = numerox1; i <= numerox2; i++) {
                System.out.println("Imprimindo o número: " + i);
            }

        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
