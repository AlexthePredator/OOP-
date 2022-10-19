import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String customerName) {
        BankAccount account = new BankAccount( initialBalance, customerName);
        accounts.add(account);
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount ba : this.accounts) {
            if (ba.getAccountNumber() == accountNumber)
                return ba;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount ba = this.find(accountNumber);
        ba.deposit(amount);
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount ba = this.find(accountNumber);
        ba.withdraw(amount);
    }

    public double getBalance(int accountNumber) {
        BankAccount ba = find(accountNumber);
        return ba.getBalance();
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        this.withdraw(fromAccountNumber, amount);
        this.deposit(toAccountNumber, amount);
    }
}