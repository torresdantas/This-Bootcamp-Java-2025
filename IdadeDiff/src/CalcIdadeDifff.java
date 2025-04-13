public class CalcIdadeDifff {
    private int idade1;
    private int idade2;

    public void setIdade1(int idade1){
        this.idade1 = idade1;
    }
    public int getIdade1(){
        return idade1;
    }

    public void setIdade2(int idade2){
        this.idade2 = idade2;
    }
    public int getIdade2(){
        return idade2;
    }

    public int calcularDiff(){
        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("A diferença é de: " + diferenca);

        return diferenca;
    }
}
