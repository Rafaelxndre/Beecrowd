import java.util.Scanner;

public class NVL1_1044 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A, B;

        A = entrada.nextInt();
        B = entrada.nextInt();

        if ((A % B == 0) || (B % A == 0)) {
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }
    }

}
