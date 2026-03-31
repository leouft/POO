import java.util.Scanner;

public class MenorNumeroMethods {

    static int repetido = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];

        System.out.println("Insira 3 valores inteiros: ");
        for(int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("\nMenor: " + menor(x));

        if (igual(x))
            System.out.println("\nNúmero repetido: " + repetido);
        else
            System.out.println("\nNenhum número se repete.");

        sc.close();
    }

    public static int menor(int[] x) {
        int menor = x[0];
        if (x[1] < menor)
            menor = x[1];
        else if(x[2] < menor)
            menor = x[2];
        return menor;
    }

    public static boolean igual(int[] x) {
        if (x[0] == x[1] || x[0] == x[2]) {
            repetido = x[0];
            return true;
        }
        else if (x[1] == x[2]) {
            repetido = x[1];
            return true;
        }
        return false;
    }

}
