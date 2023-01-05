import java.util.Scanner;

public class NVL1_1016 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int km;

        km = entrada.nextInt();

        int minutos = (60 * km) / 30;

        System.out.println(minutos + " minutos");
    }
}
