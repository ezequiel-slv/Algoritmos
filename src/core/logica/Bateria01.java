package core.logica;

public class Bateria01 {
    public static void main(String[] args) {
        exe01();
        exe02();
    }

    public static void exe01(){
        /*
        a) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F
        ← C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
        */

        double c = 30;

        double f = c * 9 / 5 + 32;

        System.out.printf("%.0f graus Celsius equivale a %.0f graus Fahrenheit", c, f);
    }

    public static void exe02(){
        /*
         b) Ler uma temperatura em graus Fahrenheit e apresentá-la
        convertida em graus Celsius. A fórmula de conversão é C ←
        ((F – 32) * 5) / 9, sendo F a temperatura em Fahrenheit e C
        */

        double f = 20;

        double c = ((f - 32) * 5) / 9;

        System.out.printf("\n%.0f graus Fahrenheit equivale a %.0f graus Celsius", f, c);
    }
}
