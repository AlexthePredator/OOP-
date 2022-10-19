import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup(){
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Nicola");
        BankAccount  newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        b.deposit(newAccount.getAccountNumber(), 3000);
        Assert.assertEquals(4000, b.getBalance(1), 0);
    }

    @Test
    public void withdrawTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Nicola");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        b.withdraw(1, 500);
        Assert.assertEquals(500, b.getBalance(1), 0);
    }

    @Test
    public void transferTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Redez");
        b.addAccount(1000, "Synergo");
        BankAccount newAccount1 = b.find(1);
        BankAccount newAccount2 = b.find(2);
        Assert.assertEquals(1, newAccount1.getAccountNumber());
        Assert.assertEquals(2, newAccount2.getAccountNumber());

        b.transfer(1, 2, 500);
        Assert.assertEquals(500, b.getBalance(1), 0);
        Assert.assertEquals(1500, b.getBalance(2), 0);

    }
}