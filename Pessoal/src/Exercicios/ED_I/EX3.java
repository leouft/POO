package Exercicios.ED_I;

import java.util.Scanner;

class EX3 {

    static final int MAX = 10;

    static Scanner scanner = new Scanner(System.in);

    static void main(){

        int[] V = new int[MAX];

        for (int i = 0; i < MAX; i++){
            int temp;
            temp = scanner.nextInt();
            vefNum(temp, V, i);
        }

        printV(V);

    }

    static void vefNum(int temp, int[] V, int i){
        for (int j = 0; j <= i; j++){
            if (temp == V[j]){
                System.out.print("Número já existente, insira outro: ");
                temp = scanner.nextInt();
                vefNum(temp, V, i);
                return;
            }
        }
        V[i] = temp;
    }

    static void printV(int[] V){
        for (int i = 0; i < MAX; i++){
            System.out.print(V[i] + " ");
        }
    }
}
