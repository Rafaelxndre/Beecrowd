import java.util.Scanner;

public class NVL1_1007 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A, B, C, D;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        int DIFERENCA = ((A * B) - (C * D));

        System.out.println("DIFERENCA = "+DIFERENCA);
    }
}
