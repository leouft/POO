package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        double value;
        char op;

        Account account;

        System.out.print("Enter account number: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        op = sc.next().charAt(0);

        if (op == 'y' || op == 'Y') {
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            account = new Account(name, id, value);
        }
        else {
            account = new Account(name, id);
        }

        System.out.printf("\nAccount data:\n%s\n", account);

        System.out.print("\nEnter a deposit value: ");
        value = sc.nextDouble();
        account.Deposit(value);
        System.out.printf("Updated account data:\n%s\n", account);

        System.out.print("\nEnter a withdraw value: ");
        value = sc.nextDouble();
        account.Withdraw(value);
        System.out.printf("Updated account data:\n%s\n", account);

        sc.close();
    }
}
