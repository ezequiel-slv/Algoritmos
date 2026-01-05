package core.logica;

public class Bateria01 {
    public static void main(String[] args) {
//        exe01();
//        exe02();
//        exe03();
//        exe04();
//        exe05();
//        exe06();
        exe07();
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

        double tempo = 4.30;

        double velocidade = 80;

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;


        System.out.printf("Tempo de viajem: %.2f horas %n", tempo);
        System.out.printf("Velocidade média: %.0f km/h %n", velocidade);
        System.out.printf("Distância percorrida: %.0f km %n", distancia);
        System.out.printf("Litros usados: %.0f L %n", litrosUsados);
    }

    public static void exe05(){
        /*
        e) Efetuar o cálculo e apresentar o valor de uma prestação de
        um bem em atraso, utilizando a fórmula PRESTAÇÃO ←
        VALOR + (VALOR * (TAXA / 100) * TEMPO).
        */

        double valor = 385;
        double taxa = 20;
        double tempoMes = 3;

        double prestacao = valor + (valor + (taxa / 100) * tempoMes);

        System.out.println("Prestaçãp a ser pega com acressímos: " + prestacao);
    }

    public static void exe06(){
        /*
        f) Ler dois valores para as variáveis A e B e efetuar a troca dos
        valores de forma que a variável A passe a possuir o valor da
        variável B e a variável B passe a possuir o valor da variável
        A. Apresentar os valores após a efetivação do
        processamento da troca.
        */

        int a = 2;

        int b = 4;

        int temp = a;

        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }


    public static void exe07(){
        /*
        g) Ler quatro valores numéricos inteiros e apresentar os
        resultados armazenados em memória das adições e
        multiplicações utilizando o mesmo raciocínio aplicado
        quando do uso de propriedades distributivas para a máxima
        combinação possível entre as quatro variáveis. Não é para
        calcular a propriedade distributiva, deve-se apenas usar a
        sua forma de combinação. Considerando a leitura de valores
        para as variáveis A, B, C e D, devem ser feitas seis adições
        e seis multiplicações, ou seja, deve ser combinada a
        variável A com a variável B, a variável A com a variável C, a
        variável A com a variável D. Depois, é necessário combinar
        a variável B com a variável C e a variável B com a variável D
        e, por fim, a variável C será combinada com a variável D.
        */

        int a = 10;
        int b = 20;
        int c = 40;
        int d = 80;

        System.out.println("Adição: " + (a + b));
        System.out.println("Adição: " + (a + c));
        System.out.println("Adição: " + (a + d));
        System.out.println("Adição: " + (b + c));
        System.out.println("Adição: " + (b + d));
        System.out.println("Adição: " + (c + d));

        System.out.println("-----");

        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Multiplicação: " + (a * c));
        System.out.println("Multiplicação: " + (a * d));
        System.out.println("Multiplicação: " + (b * c));
        System.out.println("Multiplicação: " + (b * d));
        System.out.println("Multiplicação: " + (c * d));
    }
}
