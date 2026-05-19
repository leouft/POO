package Questao4.application;

import Questao4.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número da conta: ");
        int number = sc.nextInt();
        System.out.print("Insira o nome do titular: ");
        sc.nextLine(); // Para evitar a questão do buffer do teclado
        String holder = sc.nextLine();

        System.out.print("Haverá depósito inicial? (y/n) ");
        char op = sc.next().charAt(0);

        Account account;

        if (op == 'y' || op == 'Y') { // Execução caso o usuário queria fazer um depósito inicial
            System.out.print("Qual será o depósito inicial? ");
            double valor = sc.nextDouble();

            account = new Account(number, holder, valor); // Usa o construtor que recebe depósito
        }
        else
            account = new Account(number, holder); // Usa o construtor que não recebe depósito

        System.out.println("\nDados da conta:\n" + account.toString());

        System.out.print("Valor de depósito: ");
        double valor = sc.nextDouble();
        account.deposit(valor); // Faz o depósito na conta

        System.out.println("\nDados atualizados:\n" + account.toString());

        System.out.print("Valor de saque: ");
        valor = sc.nextDouble();
        account.withdraw(valor); // Faz o saque na conta

        System.out.println("\nDados atualizados:\n" + account.toString());

        sc.close();
    }
}
