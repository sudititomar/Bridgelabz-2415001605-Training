import java.util.ArrayList;

class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println(name + "'s Account Balances:");
        for (Account account : accounts) {
            System.out.println("Account " + account.accountNumber + ": " + account.getBalance());
        }
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    void openAccount(Customer customer, int accountNumber, double balance) {
        Account newAccount = new Account(accountNumber, balance);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Opened account " + accountNumber + " for " + customer.name + " in " + bankName);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1, 101, 5000);
        bank.openAccount(c1, 102, 1500);
        bank.openAccount(c2, 201, 2000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
