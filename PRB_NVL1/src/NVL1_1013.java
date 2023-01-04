import java.util.Scanner;

public class NVL1_1013 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A, B, C;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();

        if (A > B && A > C )
            System.out.printf("%d eh o maior\n",A);
        else if (B > C)
            System.out.printf("%d eh o maior\n",B);
        else
            System.out.printf("%d eh o maior\n",C);

    }
}
