import java.util.Scanner;

public class NVL1_1002 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double area, raio;
        Double n = 3.14159;

        raio = entrada.nextDouble();

        area = n * (raio * raio);

        System.out.printf("A=%.4f\n",area);
    }
}
