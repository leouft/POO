package EX1.entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(){}

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <= loanLimit)
            balance += amount - 10.0;
        else
            System.out.println("Empréstimo não aprovado. O limite é de: R$ " + loanLimit);
    }

    @Override

    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Número da conta: %d\n", number));
        sb.append(String.format("Nome: %s\n", holder));
        sb.append(String.format("Saldo: R$ %.2f\n", balance));
        sb.append(String.format("Limite de empréstimo: R$ %.2f\n", loanLimit));

        return sb.toString();
    }
}
