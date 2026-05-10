package program;

import java.util.Scanner;
import java.util.Locale;

public class EX2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();

        double[] V = new double[N];

        double soma = 0;

        for(int i = 0; i < N; i++) {
            System.out.print("Digite o número: ");
            V[i] = sc.nextDouble();
            soma += V[i];
        }

        System.out.print("\nVALORES = ");
        for(int i = 0; i < N; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + soma/N);

        sc.close();
    }
}
