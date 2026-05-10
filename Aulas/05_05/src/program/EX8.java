package program;

import java.util.Locale;
import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        int[] V = new int[N];

        double average = 0;
        int even = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            V[i] = sc.nextInt();
            if (V[i] % 2 == 0) {
                average += V[i];
                even++;
            }
        }

        if (average != 0) {
            average = average/even;
            System.out.printf("MÉDIA DOS PARES = %.1f\n", average);
        }
        else {
            System.out.print("NENHUM NÚMERO PAR\n");
        }

        sc.close();
    }
}
