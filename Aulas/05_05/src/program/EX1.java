package program;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();

        int[] V = new int[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Digite o número: ");
            V[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for(int i = 0; i < N; i++) {
            if (V[i] < 0)
                System.out.println(V[i]);
        }

        sc.close();
    }
}
