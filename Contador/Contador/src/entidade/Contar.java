package entidade;

public class Contar {
    private int numeroUm;
    private int numeroDois;

    public Contar(int numeroUm, int numeroDois){
        if(numeroUm > numeroDois){
            throw new RuntimeException("O número 1 deve ser menor que o número 2");
        }

        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public int getNumeroUm() {
        return numeroUm;
    }

    public int getNumeroDois() {
        return numeroDois;
    }
}
