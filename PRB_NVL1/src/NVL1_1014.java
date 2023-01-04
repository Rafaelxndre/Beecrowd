import java.util.Scanner;

public class NVL1_1014 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int X;
        double Y;

        X = entrada.nextInt();
        Y = entrada.nextDouble();

        double consumo = X/Y;

        System.out.printf("%.3f km/l\n",consumo);

    }
}
