package core.logica;

public class Bateria01 {
    public static void main(String[] args) {
        exe01();
        exe02();
        exe03();
    }

    public static void exe01(){
        /*
        a) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F
        ← C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
        */

        double c = 30;

        double f = c * 9 / 5 + 32;

        System.out.printf("%.0f graus Celsius equivale a %.0f graus Fahrenheit %n", c, f);
    }

    public static void exe02(){
        /*
         b) Ler uma temperatura em graus Fahrenheit e apresentá-la
        convertida em graus Celsius. A fórmula de conversão é C ←
        ((F – 32) * 5) / 9, sendo F a temperatura em Fahrenheit e C
        */

        double f = 20;

        double c = ((f - 32) * 5) / 9;

        System.out.printf("%.0f graus Fahrenheit equivale a %.0f graus Celsius %n", f, c);
    }

    public static void exe03(){
        /*
        c) Calcular e apresentar o valor do volume de uma lata de
        óleo, utilizando a fórmula VOLUME ← 3.14159 * R ↑ 2 *
        ALTURA.
        */

        double r = 3;

        double a = 1.80;

        double v = 3.14159 * (r * r) * a;

        System.out.printf("Volume da lata: %.2f %n", v);
    }
}
