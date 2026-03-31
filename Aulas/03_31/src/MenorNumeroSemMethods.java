import java.util.Scanner;

public class MenorNumeroSemMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];

        System.out.println("Insira 3 valores inteiros: ");
        for(int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }

        int menor = x[0];
        if (x[1] < menor)
            menor = x[1];
        else if(x[2] < menor)
            menor = x[2];

        System.out.println("\nMenor: " + menor);

        if (x[0] == x[1] || x[0] == x[2]) {
            System.out.println("\nNúmero repetido: " + x[0]);
        }
        else if (x[1] == x[2]) {
            System.out.println("\nNúmero repetido: " + x[1]);
        }
        else
            System.out.println("\nNenhum número se repete.");

        sc.close();
    }
}
