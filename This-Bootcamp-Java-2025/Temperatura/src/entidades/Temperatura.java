package entidades;

public class Temperatura {
    public double temperatura;



    public double converterF(){
        return temperatura * 1.8 + 32;
    }
    public double converterK(){
        return temperatura + 273.15;
    }
    public double converterRa(){
        return temperatura * 1.8 + 32 + 459.67;
    }
    public double converterRe(){
        return temperatura * 0.8;
    }

    public String toString() {
        return String.format(
                "Temperatura em Celsius: %.2f°C\n" +
                        "Fahrenheit: %.2f°F\n" +
                        "Kelvin: %.2fK\n" +
                        "Réaumur: %.2f°Re\n" +
                        "Rankine: %.2f°Ra",
                temperatura, converterF(), converterK(), converterRe(), converterRa());
    }
}
