package program;

import entities.PessoaEX9;

import java.util.Locale;
import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantas pessoas você vai digitar? ");
        N = sc.nextInt();

        PessoaEX9[] pessoa = new PessoaEX9[N];

        String name;
        int idade;

        int pos = 0;

        for (int i = 0; i < N; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            pessoa[i] = new PessoaEX9(name, idade);

            if (pessoa[i].getAge() > pessoa[pos].getAge()) {
                pos = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoa[pos].getName());

        sc.close();
    }
}
