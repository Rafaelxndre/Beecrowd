import java.util.Scanner;

public class NVL1_1017 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double tmpViagem, velocidadeMedia;

        tmpViagem = entrada.nextInt();
        velocidadeMedia = entrada.nextInt();

        double tmp = (12 / tmpViagem);
        double litros = velocidadeMedia / tmp;

        System.out.printf("%.3f\n",litros);

    }
}
