public class Intervalo {
    private int numero1;
    private int numero2;
    private String escolha;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public void exibir(){
        System.out.println("Números " + escolha + " no intervalo de " +  numero1 +  " a " + numero2 + " em ordem decrescente:");
        for(int i = numero2; i >= numero1; i--){
            if("par".equalsIgnoreCase(escolha) && i % 2 == 0){
                System.out.println(i);
            }else if("impar".equalsIgnoreCase(escolha) && i % 2  != 0){
                System.out.println(i);
            }
        }
    }
}
