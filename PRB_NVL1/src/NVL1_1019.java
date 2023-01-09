import java.util.Scanner;

public class NVL1_1019 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;

        N = entrada.nextInt();

        int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = (N % 3600) % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
