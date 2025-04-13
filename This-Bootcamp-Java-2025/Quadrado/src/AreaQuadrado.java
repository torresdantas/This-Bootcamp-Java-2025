public class AreaQuadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }
}

