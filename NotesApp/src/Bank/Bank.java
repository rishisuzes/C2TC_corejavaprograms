package Bank;

import java.util.ArrayList;
import java.util.List;

class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    protected List<String> transactions;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount);
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount);
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolder + ":");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw! Minimum balance of ₹" + MIN_BALANCE + " required.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("1001", "Risabhan", 5000);

        acc1.deposit(2000);
        acc1.withdraw(2500);
        acc1.withdraw(2000); // Below minimum balance

        System.out.println("Final Balance: ₹" + acc1.getBalance());
        System.out.println();
        acc1.printTransactionHistory();
    }
}

