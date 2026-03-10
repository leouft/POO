package Exercicios.LP;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class Raizes {

    static Scanner sc = new Scanner(System.in);

    static void main(){

        float a, b, c;

        double[] raiz = new double[2];

        System.out.print("Insira o valor de a: ");
        a = sc.nextFloat();
        a = vef(a);
        System.out.print("Insira o valor de b: ");
        b = sc.nextFloat();
        System.out.print("Insira o valor de c: ");
        c = sc.nextFloat();

        double delta = ((b*b) - (4*a*c));

        if (delta < 0){
            System.out.println("A equação não possui raízes reais.");
        }
        else {
            raiz[0] = ((-b + sqrt(delta)) / (2 * a));
            if (delta == 0) {
                System.out.printf("A equação possui uma raiz real: %.2f", raiz[0]);
            }else {
                raiz[1] = ((-b - sqrt(delta)) / (2 * a));
                System.out.printf("A equação possui duas raízes reais: %.2f e %.2f", raiz[0], raiz[1]);
            }
        }
    }

    static float vef(float a){
        if (a == 0){
            System.out.print("Valor de a não pode ser zero. Insira um valor diferente: ");
            a = sc.nextFloat();
            a = vef(a);
        }
        return a;
    }
}


