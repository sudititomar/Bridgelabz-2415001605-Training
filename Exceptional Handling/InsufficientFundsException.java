
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}
class ATM {
    int balance = 10000;
    public void withdraw(int amount) throws InsufficientFundsException {
        if(amount > balance)
            throw new InsufficientFundsException("Insufficient funds: can't withdraw " + amount);
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(12000); // Excess withdrawal
        } catch(InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
