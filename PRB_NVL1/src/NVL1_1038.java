import java.util.Scanner;

public class NVL1_1038 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cod, quantidade;

        cod = entrada.nextInt();
        quantidade = entrada.nextInt();

        if(cod == 1)
            System.out.printf("Total: R$ %.2f\n",(4.00*quantidade));
        else if (cod == 2)
            System.out.printf("Total: R$ %.2f\n",(4.50*quantidade));
        else if (cod == 3)
            System.out.printf("Total: R$ %.2f\n",(5.00*quantidade));
        else if (cod == 4)
            System.out.printf("Total: R$ %.2f\n",(2.00*quantidade));
        else
            System.out.printf("Total: R$ %.2f\n",(1.50*quantidade));

    }
}
