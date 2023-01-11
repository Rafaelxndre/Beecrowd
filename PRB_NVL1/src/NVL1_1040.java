import java.util.Scanner;

public class NVL1_1040 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double N1, N2, N3, N4;

        N1 = entrada.nextDouble();
        N2 = entrada.nextDouble();
        N3 = entrada.nextDouble();
        N4 = entrada.nextDouble();

        double media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;

        System.out.printf("Media: %.1f\n",media);

        if(media >= 7.0)
            System.out.printf("Aluno aprovado.\n");
        else if (media >= 5.0 && media < 7.0) {
            System.out.printf("Aluno em exame.\n");
            double notaExame = entrada.nextDouble();

            System.out.printf("Nota do exame: %.1f\n",notaExame);

            double mediaExame = (media + notaExame) /2;

            if (media >= 5.0) {
                System.out.printf("Aluno aprovado.\n");

            }else {
                System.out.printf("Aluno reprovado.\n");
            }

            System.out.printf("Media final: %.1f\n",mediaExame);

        }else
            System.out.printf("Aluno reprovado.\n");
    }
}
