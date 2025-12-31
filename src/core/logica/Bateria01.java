package core.logica;

public class Bateria01 {
    public static void main(String[] args) {
        exe01();
        exe02();
        exe03();
        exe04();
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

    public static void exe04(){
        /*
        d) Efetuar o cálculo da quantidade de litros de combustível
        gasta em uma viagem, utilizando um automóvel que faz 12
        quilômetros por litro. Para obter o cálculo, o usuário deve
        fornecer o tempo gasto (variável TEMPO) e a velocidade
        média (variável VELOCIDADE) durante a viagem. Dessa
        forma, será possível obter a distância percorrida com a
        fórmula DISTÂNCIA ← TEMPO * VELOCIDADE. A partir do
        valor da distância, basta calcular a quantidade de litros de
        combustível utilizada na viagem com a fórmula
        LITROS_USADOS ← DISTÂNCIA / 12. O programa deve
        apresentar os valores da velocidade média, tempo gasto na
        viagem, a distância percorrida e a quantidade de litros
        utilizada na viagem.
        */

        double tempo = 4;

        double velocidade = 80;

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;


        System.out.printf("O tempo de viajem foi de %.0f horas, velocidade média de %.0f km/h, distância percorrida de %.0f km e foram usados %.0f litros de combustível %n", tempo, velocidade, distancia, litrosUsados);
    }
}
