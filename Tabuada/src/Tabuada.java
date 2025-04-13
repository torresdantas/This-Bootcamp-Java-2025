public class Tabuada {
    private int numero;

    public void setNumero(int numero){
        if(numero < 0 || numero > 9){
            throw new IllegalArgumentException("Digite um numero entre 0 e 9");
        }
        this.numero = numero;
    }

    public void exibir(){
        int somador = 1;
        for(int i = 1; i <= 10; i++){
            int resultado = numero + somador;

            System.out.println(numero + " + " + somador + " = " + resultado);
            somador ++;
        }
    }

}
