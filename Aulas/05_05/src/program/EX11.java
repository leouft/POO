package program;

import entities.PessoaEX11;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantas pessoas serão digitadas? ");
        N = sc.nextInt();

        double height;
        char gender;

        PessoaEX11[] pessoa = new PessoaEX11[N];

        double tall = 0;
        double small = 0;
        double average = 0;
        int cont = 0;

        for(int i = 0; i < N; i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            height = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i+1);
            gender = sc.next().charAt(0);

            if (height > tall)
                tall = height;

            if (small == 0 || height < small)
                small = height;

            if (gender == 'F' || gender == 'f')
                average += height;
            else
                cont++;
        }

        average = average/(N-cont);

        System.out.printf("Menor altura = %.2f\n", small);
        System.out.printf("Maior altura = %.2f\n", tall);
        System.out.printf("Média das alturas das mulheres = %.2f\n", average);
        System.out.printf("Número de homens = %d\n", cont);

        sc.close();
    }
}
