package Questao4.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        balance = 0;
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= (amount+5);
    }

    public String toString() {
        return String.format("Conta %d, Titular: %s, Saldo: %.2f", number, holder, balance);
    }
}
