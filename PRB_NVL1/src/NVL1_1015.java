import java.util.Scanner;

public class NVL1_1015 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double x1, y1, x2, y2;

        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();

        Double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.printf("%.4f\n",distancia);
    }
}
