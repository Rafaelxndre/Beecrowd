import java.util.Scanner;

public class NVL1_1042 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();

        if (A < B && A < C) {
            System.out.println(A);
            if (B < C) {
                System.out.println(B);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(B);
            }
        } else if (B < C) {
            System.out.println(B);
            if (A < C) {
                System.out.println(A);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(A);
            }
        } else {
            System.out.println(C);
            if (A < B) {
                System.out.println(A);
                System.out.println(B);
            } else {
                System.out.println(B);
                System.out.println(A);
            }
        }
        System.out.printf("%n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
