import java.util.Scanner;

public class NVL1_1037 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double A;

        A = entrada.nextDouble();

        if(A >= 0 && A <= 25)
            System.out.printf("Intervalo [0,25]\n");
        else if (A > 25 && A <= 50)
            System.out.printf("Intervalo (25,50]\n");
        else if (A >= 75 && A <= 100)
            System.out.printf("Intervalo (75,100]\n");
        else
            System.out.printf("Fora de intervalo\n");
    }
}
