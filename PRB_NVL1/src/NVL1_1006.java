import java.util.Scanner;

public class NVL1_1006 {

    static final int peso_A = 2;
    static final int peso_B = 3;
    static final int peso_C = 5;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double A, B, C;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        double Media = ((A * peso_A)+ (B * peso_B) + (C * peso_C))/10;

        System.out.printf("MEDIA = %.1f\n",Media);
    }
}
