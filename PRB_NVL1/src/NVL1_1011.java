import java.util.Scanner;

public class NVL1_1011 {

    static final Double pi = 3.14159;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double raio;

        raio = entrada.nextDouble();

        Double volume = (4 * pi * Math.pow(raio, 3)) / 3;

        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
