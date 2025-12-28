package core.logica;

public class Bateria01 {
    public static void main(String[] args) {
        exe01();
    }

    public static void exe01(){
        /*
        a) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F
        ← C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
        */

        double c = 30;

        double f = c * 9 / 5 + 32;

        System.out.println(c + " graus Celsius equivale a " + f + " graus Fahrenheit");
    }
}
