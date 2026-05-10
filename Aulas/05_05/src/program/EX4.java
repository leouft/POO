package program;

import java.util.Locale;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();

        int[] V = new int[N];
        int cont = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            V[i] = sc.nextInt();
        }

        System.out.println("\nNÚMEROS PARES:");

        for (int i = 0; i < N; i++) {
            if (V[i] % 2 == 0) {
                System.out.printf("%d ", V[i]);
                cont++;
            }
        }
        System.out.println();

        System.out.println("\nQUANTIDADE DE PARES = " + cont);

        sc.close();
    }
}
