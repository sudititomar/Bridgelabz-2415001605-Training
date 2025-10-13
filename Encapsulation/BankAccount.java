abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if(amount <= balance) balance -= amount; }
    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int num, String name, double bal) { super(num, name, bal); }
    public double calculateInterest() { return getBalance() * 0.05; }
    public void applyForLoan(double amount) {}
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int num, String name, double bal) { super(num, name, bal); }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) {}
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}
