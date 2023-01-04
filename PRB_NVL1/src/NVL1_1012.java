import java.util.Scanner;

public class NVL1_1012 {

    static final Double pi = 3.14159;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double A,B,C;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n",((A*C)/2));
        System.out.printf("CIRCULO: %.3f\n",(pi * C*C));
        System.out.printf("TRAPEZIO: %.3f\n",((A+B)*C)/2);
        System.out.printf("QUADRADO: %.3f\n",B*B);
        System.out.printf("RETANGULO: %.3f\n",A*B);

    }
}
