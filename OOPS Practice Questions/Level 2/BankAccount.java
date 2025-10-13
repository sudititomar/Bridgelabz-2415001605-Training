class BankAccount {
    String accountHolder;
    @SuppressWarnings("unused")
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Akshit", "1234567890", 10000.0);

        account.displayBalance();

        account.deposit(5000);
        account.displayBalance();

        account.withdraw(3000);
        account.displayBalance();

        account.withdraw(15000);
        account.displayBalance();
    }
}
