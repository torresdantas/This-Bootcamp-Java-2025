package entidades;

public class Media{
    public String nome;
    public double a, b, c;
    public boolean resultado;

    public double notasVerificar(){
        return (a + b + c);
    }

    public String checkNotas(){
        return notasVerificar() >= 60 ? "Aprovado" : "Reprovado";
    }
    public double faltandoPontos(){
        return 60 - (a + b + c);
    }

    public String toString(){
        return "Nome: " + nome + "\n" +
                "Media Final: " + notasVerificar()+ "\n" +
                "Resultado: " + checkNotas() + "\n" +
                "Faltando " + faltandoPontos() + " Pontos!";
    }
}