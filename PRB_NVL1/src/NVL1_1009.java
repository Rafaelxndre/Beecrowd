import java.util.Scanner;

public class NVL1_1009 {

    static final double comissao = 0.15;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        double salary, vendasPorMes;

        nome = entrada.next();
        salary = entrada.nextDouble();
        vendasPorMes = entrada.nextDouble();

        vendasPorMes = vendasPorMes * comissao;
        salary = salary + vendasPorMes;

        System.out.printf("TOTAL = R$ %.2f\n",salary);

    }
}
