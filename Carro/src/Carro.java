public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro(){
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar(){
        if(!this.ligado){
            ligado = true;
            System.out.println("O carro foi ligado!");
        }else {
            System.out.println("Carro desligado!");
        }
    }
    public void desligar(){
        if(ligado && marcha == 0 && velocidade == 0){
            ligado = false;
            System.out.println("O carro foi desligado");
        }else{
            System.out.println("Não foi possivel desligar o carro, verifique a marcha e a velocidade atual!");
        }
    }

    public void acelerar(){
        if(!ligado){
            System.out.println("O carro ainda está desligado!");
            return;
        }
        if(marcha == 0){
            System.out.println("O carro está em neutro!");
            return;
        }
        if(velocidade < 120){
            velocidade++;
            verificarMarcha();
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        }else{
            System.out.println("Velocidade maxima atingida");
        }
    }
    public void diminuirVelociade(){
        if(!ligado){
            System.out.println("Carro desligado");
            return;
        }
        if(velocidade > 0) {
            velocidade--;
            verificarMarcha();
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        }else{
            System.out.println("O carro está parado!");
        }
    }


    private void verificarMarcha() {
    if (velocidade == 0) marcha = 0;
    else if (velocidade <= 20) marcha = 1;
    else if (velocidade <= 40) marcha = 2;
    else if (velocidade <= 60) marcha = 3;
    else if (velocidade <= 80) marcha = 4;
    else if (velocidade <= 100) marcha = 5;
    else marcha = 6;
    }
}
