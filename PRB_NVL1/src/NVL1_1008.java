import java.util.Scanner;

public class NVL1_1008 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int number, horasTrabalhadas;
        double valorPorHoras;

        number = entrada.nextInt();
        horasTrabalhadas = entrada.nextInt();
        valorPorHoras = entrada.nextDouble();

        double salary = (horasTrabalhadas * valorPorHoras);

        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n",salary);

    }
}
