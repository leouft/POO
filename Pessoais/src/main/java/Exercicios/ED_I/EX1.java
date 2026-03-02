package Exercicios.ED_I;

import java.util.Scanner;

class EX1 {

    static final int MAX = 10;

    static Scanner scanner = new Scanner(System.in);

    static void main() {

        int[] V = new int[MAX];
        int x;
        for (int i = 0; i < MAX; i++) {
            V[i] = scanner.nextInt();
        }

        x = scanner.nextInt();

        for (int i = 0; i < MAX; i++) {
            if (V[i] % x == 0) {
                System.out.print(V[i] + " ");
            }
        }
    }
}




