import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class bkashTest {
    private ByteArrayOutputStream outContent;
    private bkash bkashAccount;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testBkashConstructorWithPin() {
        bkashAccount = new bkash("Alice", "1234567890", 1000.0, "1234");

        assertEquals("Alice", bkashAccount.name);
        assertEquals("1234567890", bkashAccount.phone_no);
        assertEquals(1000.0, bkashAccount.balance, 0.001);
        assertEquals("1234", bkashAccount.pin);
    }

    @Test
    public void testBkashConstructorWithoutPin() {
        bkashAccount = new bkash("Bob", "5555555555", 100.0);

        assertEquals("Bob", bkashAccount.name);
        assertEquals("5555555555", bkashAccount.phone_no);
        assertEquals(100.0, bkashAccount.balance, 0.001);
        assertEquals(null, bkashAccount.pin);
    }

    @Test
    public void testAddMoneyWithinAllowedRange() {
        bkashAccount = new bkash("Charlie", "1111111111", 500.0);
        bkashAccount.addmoney(50.0);

        assertEquals(550.0, bkashAccount.balance, 0.001);
    }

    @Test
    public void testAddMoneyWithNonAllowedRange() {
        bkashAccount = new bkash("Charlie", "1111111111", 500.0);
        bkashAccount.addmoney(5.0);
        String expectedOutput = "Error\n";
        assertEquals(expectedOutput, outContent.toString());
    }


    @Test
    public void testCashoutWithinAllowedRange() {
        bkashAccount = new bkash("Grace", "5555555555", 1000.0, "1234");
        bkashAccount.cashout(500.0, "1234");

        assertEquals(500.0, bkashAccount.balance, 0.001);
    }




    @Test
    public void testCashoutWithFeeBelow500() {
        bkashAccount = new bkash("Kate", "9999999999", 2000.0, "1234");
        bkashAccount.cashout(100.0, "1234");

        assertEquals(1900.0, bkashAccount.balance, 0.001);
    }




}
