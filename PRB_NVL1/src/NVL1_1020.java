import java.util.Scanner;

public class NVL1_1020 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idadeEmDias;

        idadeEmDias = entrada.nextInt();

        int dias = idadeEmDias;

        int ano = idadeEmDias / 365;
        int resto =  dias - (ano * 365);

        int mes = resto / 30;
        resto =  resto - (mes * 30);

        System.out.printf("%d ano(s)\n",ano);
        System.out.printf("%d mes(es)\n",mes);
        System.out.printf("%d dia(s)\n",resto);
    }
}
