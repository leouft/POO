package EX1.entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance*interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount + 5.0;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Número da conta: %d\n", number));
        sb.append(String.format("Nome: %s\n", holder));
        sb.append(String.format("Saldo: R$ %.2f\n", balance));
        sb.append(String.format("Rendimento: %.2f%%\n", interestRate*100));

        return sb.toString();
    }
}