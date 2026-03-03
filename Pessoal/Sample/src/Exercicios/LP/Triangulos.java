package Exercicios.LP;

import java.util.Scanner;

class Triangulos {

    static Scanner sc = new Scanner(System.in);

    static void main(){
        float[] l = new float[3];

        ler(l);
        vefPos(l);

        switch (tipo(l)){
            case 0:
                System.out.println("O triângulo é equilátero.");
                break;
            case 1:
                System.out.println("O triângulo é isósceles.");
                break;
            case 2:
                System.out.println("O triângulo é escaleno.");
                break;
        }

    }

    static void ler(float[] l){
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o valor do lado %d: ", i+1);
            l[i] = sc.nextFloat();
            vef(l, i);
        }
    }

    static void vef(float[] l, int i){
        if (l[i] <= 0){
            System.out.println("Valor inválido, insira um valor positivo.");
            System.out.printf("Insira o valor do lado %d: ", i+1);
            l[i] = sc.nextFloat();
            vef(l, i);
        }
    }

    static void vefPos(float[] l){
        if (l[0] + l[1] <= l[2] || l[0] + l[2] <= l[1] || l[1] + l[2] <= l[0])
        {
            System.out.println("Não é possível formar um triângulo com os lados informados.\nInforme os lados novamente.");
            ler(l);
        }
    }

    static int tipo(float[] l){
        if (l[0] == l[1] && l[1] == l[2]){
            return 0;
        } else if (l[0] == l[1] || l[0] == l[2] || l[1] == l[2]){
            return 1;
        } else {
            return 2;
        }
    }

}
