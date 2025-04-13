public class IMC {
    private double altura;
    private double peso;

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    public double calcularImc(){
        double imc = peso / (altura * altura);
        return imc;
    }
}
