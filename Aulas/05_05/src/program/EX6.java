package program;

import java.util.Locale;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos valores vai ter cada vetor?");
        N = sc.nextInt();

        int[][] V = new int[N][2];

        System.out.print("Digite os valores do vetor A:\n");
        for (int i = 0; i < N; i++) {
            V[i][0] = sc.nextInt();
        }

        System.out.print("Digite os valores do vetor B:\n");
        for (int i = 0; i < N; i++) {
            V[i][1] = sc.nextInt();
        }

        System.out.print("VETOR RESULTANTE:\n");

        for (int i = 0; i < N; i++) {
            System.out.println(V[i][0]+V[i][1]);
        }

        sc.close();
    }
}
