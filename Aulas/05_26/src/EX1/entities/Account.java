package EX1.entities;

public class Account {
    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Número da conta: %d\n", number));
        sb.append(String.format("Nome: %s\n", holder));
        sb.append(String.format("Saldo: R$ %.2f\n", balance));

        return sb.toString();
    }
}
