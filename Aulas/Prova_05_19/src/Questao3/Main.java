package Questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos mínutos foram consumidos? ");
        int time = sc.nextInt(); // Essa variável irá armazenar o tempo em minutos de consumo.
        double valor; // Essa variável servirá para exibir o valor na tela.

        if (time <= 100)
            valor = 50;
        else
            valor = 50 + (2*(time-100)); // Somamos o valor do plano com a multiplicação de 2 por cada minuto que exceder.

        System.out.printf("Valor a pagar: R$%.2f\n", valor);

        System.out.print("\nQuantos clientes serão processados? ");
        int N = sc.nextInt(); // Variável para o núemro de clientes processados

        double media = 0; // Variável pra armazenar o valor médio das contas

        // Estrutura de repetição que irá rodar de acordo com o número de clientes
        for (int i = 0; i < N; i++) {
            System.out.print("\nQuantos minutos foram consumidos? ");
            time = sc.nextInt();

            if (time <= 100)
                valor = 50;
            else
                valor = 50 + (2*(time-100));

            System.out.printf("Valor a pagar do cliente %d: R$%.2f\n", i+1, valor);
            media += valor; // Sempre soma o valor desse cliente para no fim tirar a média
        }

        media = media/N; // Finalizando a média

        System.out.printf("Valor médio das contas de todos os clientes: R$%.2f\n", media);

        sc.close();
    }
}
