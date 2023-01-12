import java.util.Scanner;

public class NVL1_1043 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B, C;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        if (A < B+C && B < A+C && C < A+B){
            System.out.printf("Perimetro = %.1f\n",A+B+C);
        }else {
            System.out.printf("Area = %.1f\n",((A+B)*C)/2.0);
        }
    }
}
