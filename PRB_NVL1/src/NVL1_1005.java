import java.util.Scanner;

public class NVL1_1005 {

    static final double peso_A = 3.5;
    static final double peso_B = 7.5;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B;

        A = entrada.nextDouble();
        B = entrada.nextDouble();

        double Media = ((A * peso_A)+ (B * peso_B))/11;

        System.out.printf("MEDIA = %.5f",Media);

    }
}
