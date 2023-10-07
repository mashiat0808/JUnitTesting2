import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {
    private ByteArrayOutputStream outContent;
    private Account account;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAccountConstructor() {
        account = new Account("John Doe", "1234567890", 1000.0);

        assertEquals("John Doe", account.name);
        assertEquals("1234567890", account.phone_no);
        assertEquals(1000.0, account.balance, 0.001);
    }



    @Test
    public void testAddMoneyMethod() {
        account = new Account("Bob", "5555555555", 100.0);
        account.addmoney(50.0);

        assertEquals(150.0, account.balance, 0.001);
    }

    @Test
    public void testCashoutMethodWithSufficientBalance() {
        account = new Account("Eve", "3333333333", 200.0);
        account.cashout(50.0, "1234");

        assertEquals(150.0, account.balance, 0.001);
    }

    @Test
    public void testCashoutMethodWithInsufficientBalance() {
        account = new Account("Eve", "3333333333", 200.0);
        account.cashout(500.0, "1234");

        String expectedOutput = "insufficient balance\n";
        assertEquals(expectedOutput, outContent.toString());
    }


}
