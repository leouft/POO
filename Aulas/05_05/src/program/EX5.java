package program;

import java.util.Locale;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();

        double[] V = new double[N];

        int pos = 0;

        for(int i = 0; i < N; i++) {
            System.out.print("Digita um número: ");
            V[i] = sc.nextDouble();
            if (V[i] > V[pos]) {
                pos = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", V[pos]);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", pos);

        sc.close();
    }
}
