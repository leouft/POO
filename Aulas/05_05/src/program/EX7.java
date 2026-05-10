package program;

import java.util.Locale;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        double[] V = new double[N];

        double average = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            V[i] = sc.nextDouble();
            average += V[i];
        }

        average = average/N;

        System.out.printf("\nMÉDIA DO VETOR = %.3f\n", average);

        System.out.print("ELEMENTOS ABAIXO DA MÉDIA:\n");
        for (int i = 0; i < N; i++) {
            if (V[i] < average)
                System.out.println(V[i]);
        }

        sc.close();
    }
}
