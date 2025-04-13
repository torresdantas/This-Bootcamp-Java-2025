public class Emprego {
    public static void main(String[] args) {
        selecionar(5000.0);
        selecionar(3000.0);
        selecionar(2000.0);
    }

    static void selecionar(double queroSalario){
        double salarioBase = 3000.0;

        if(salarioBase > queroSalario){
            System.out.println("Ligar para candidato");
        }else if(salarioBase == queroSalario){
            System.out.println("Aguardar resultado final");
        }else{
            System.out.println("Ligar com contra proposta");
        }
    }
}
