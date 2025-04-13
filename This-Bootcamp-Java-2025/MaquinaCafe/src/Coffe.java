public class Coffe {
    private int coffe;
    private int milk;
    private int water;
    private int capacity;
    private boolean clean;

    public Coffe(){
        this.coffe = 100;
        this.milk = 50;
        this.clean = true;
        this.capacity = this.coffe + this.milk;
    }
    public void fazerCafe(){
        if(coffe < 20 || milk < 10){
            System.out.println("Ingrediente insuficientes, abasteça a maquina!");
            return;
        }
        coffe -= 20;
        milk -= 10;
        System.out.println("Café com leite preparado");

    }

    public void abastecerCoffe(){
        if(coffe < 50){
            System.out.println("Café está abaixo de 50%!");
            return;
        }
        coffe += 10;
        if(coffe == 100){
            System.out.println("Café está 100%!");
            return;
        }
    }
    public void abastecerMilk(){
        if(milk < 25){
            System.out.println("Leite está abaixo de 50%!");
            return;
        }
        milk += 5;
        if(milk == 50){
            System.out.println("Leite está 100%");
            return;
        }
    }
    public int getCoffe(){
        return coffe;
    }
    public int getMilk(){
        return milk;
    }
    public int getCapacity(){
        return coffe + milk;
    }
}

