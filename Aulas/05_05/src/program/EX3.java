package program;

import entities.PessoaEX3;

import java.util.Locale;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantas pessoas serão digitadas? ");
        N = sc.nextInt();
        sc.nextLine();

        PessoaEX3[] pessoa = new PessoaEX3[N];

        String name;
        int idade;
        double height;

        double sum = 0;
        int belowSixteen = 0;

        for (int i = 0; i < N; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            height = sc.nextDouble();
            sc.nextLine();

            sum += height;

            if (idade < 16)
                belowSixteen++;

            pessoa[i] = new PessoaEX3(name, idade, height);
        }

        System.out.printf("\nIdade média: %.2f\n", sum/N);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", ((float)belowSixteen/(float)N)*100);
        for (int i = 0; i < N; i++) {
            if  (pessoa[i].getAge() < 16)
                System.out.println(pessoa[i].getName());
        }

        sc.close();
    }
}
