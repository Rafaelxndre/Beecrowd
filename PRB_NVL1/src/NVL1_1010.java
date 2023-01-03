import java.util.Scanner;

public class NVL1_1010 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigoP1, quantidadePecasP1;
        double valorPecaP1;

        int codigoP2, quantidadePecasP2;
        double valorPecaP2;

        codigoP1 = entrada.nextInt();
        quantidadePecasP1 = entrada.nextInt();
        valorPecaP1 = entrada.nextDouble();

        codigoP2 = entrada.nextInt();
        quantidadePecasP2 = entrada.nextInt();
        valorPecaP2 = entrada.nextDouble();

        double valorUnitarioP1 = quantidadePecasP1 * valorPecaP1;
        double valorUnitarioP2 = quantidadePecasP2 * valorPecaP2;

        double total = valorUnitarioP1 + valorUnitarioP2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

    }

}
