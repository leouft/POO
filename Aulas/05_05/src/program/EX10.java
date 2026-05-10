package program;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantas alunos serão digitados? ");
        N = sc.nextInt();

        Aluno[] aluno = new Aluno[N];

        String name;
        double[] nota = new double[2];

        for (int i = 0; i < N; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
            sc.nextLine();
            name = sc.nextLine();
            nota[0] = sc.nextDouble();
            nota[1] = sc.nextDouble();

            aluno[i] = new Aluno(name, nota);
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < N; i++) {
            if (aluno[i].aproved())
                System.out.println(aluno[i].getName());
        }

        sc.close();
    }
}
