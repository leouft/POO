package entities;

public class Account {
    private double balance;
    private String name;
    private int id;

    /**
     * Construtor para iniciar uma conta com saldo inicial
     * @param name Nome do Titular da conta
     * @param id ID da conta
     * @param balance Saldo inicial da conta
     */
    public Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    /**
     * Construtor para iniciar uma conta sem saldo inicial
     * @param name Nome do Titular da conta
     * @param id ID da conta
     */
    public Account(String name, int id){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    /**
     * Função para depositar saldo na conta
     * @param value quantidade para ser depositada
     */
    public void Deposit(double value) {
        this.balance += value;
    }

    /**
     * Função para retirar saldo da conta
     * @param value quantidade para ser retirada
     */
    public void Withdraw(double value) {
        this.balance -= value+5;
    }

    /**
     * Função para alterar o nome do titular
     * @param name novo nome
     */
    public void changeName(String name) {
        this.name = name;
    }

    /**
     * Função para representar o objeto como string
     * @return string que representa o objeto
     */
    @Override
    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", id, name, balance);
    }
}
