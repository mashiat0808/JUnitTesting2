import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank bank;

    @BeforeEach
    public void setUp() {
        // Initialize the Bank object before each test
        bank = new Bank();
    }

    @Test

    public void testExitOption() {
        // Prepare input
        String input = "4\n"; // User selects option 4 (Exit)
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert expected output
        assertTrue(printedOutput.contains("Exiting the banking system."));
    }


    @Test
    public void testInvalidInput() {
        // Prepare input
        String input = "5\n"; // Exit
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages

        assertTrue(printedOutput.contains("Invalid choice. Please enter a valid option."));
    }
    @Test
    public void testCreateBkashAccountWithAddAndCashout() {
        // Prepare input
        String input = "1\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "y\n" // Add money
                + "500.0\n" // Enter amount to add
                + "y\n" // Cashout
                + "200.0\n" // Enter amount to cashout
                + "1234\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("your bkash account is created"));
        assertTrue(printedOutput.contains("Cashout operation completed."));
    }

    @Test
    public void testCreateNagadAccountWithAddAndCashout() {
        // Prepare input
        String input = "2\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "y\n" // Add money
                + "500.0\n" // Enter amount to add
                + "y\n" // Cashout
                + "200.0\n" // Enter amount to cashout
                + "1234\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("your ngad account is created"));
        assertTrue(printedOutput.contains("Cashout operation completed."));
    }

    @Test
    public void testCreateRocketAccountWithAddAndCashout() {
        // Prepare input
        String input = "3\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "y\n" // Add money
                + "500.0\n" // Enter amount to add
                + "y\n" // Cashout
                + "200.0\n" // Enter amount to cashout
                + "1234\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("your rocket account is created"));
        assertTrue(printedOutput.contains("Cashout operation completed."));
    }

    @Test
    public void testCreateBkashAccountWithAdd() {
        // Prepare input
        String input = "1\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "y\n" // Add money
                + "500.0\n" // Enter amount to add
                + "n\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("Exits system"));
    }

    @Test
    public void testCreateNagadAccountWithAdd() {
        // Prepare input
        String input = "2\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "y\n" // Add money
                + "500.0\n" // Enter amount to add
                + "n\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("Exits system"));
    }

    @Test
    public void testCreateRocketAccountWithAdd() {
        // Prepare input
        String input = "3\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "y\n" // Add money
                + "500.0\n" // Enter amount to add
                + "n\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("Exits system"));
    }


    @Test
    public void testCreateBkashAccount() {
        // Prepare input
        String input = "1\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "n\n"
                + "n\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("Exits system"));
    }

    @Test
    public void testCreateNagadAccount() {
        // Prepare input
        String input = "2\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "n\n"
                + "n\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("Exits system"));
    }

    @Test
    public void testCreateRocketAccount() {
        // Prepare input
        String input = "3\n" // User selects option 1 (Create a bkash account)
                + "John Doe\n" // Enter account holder's name
                + "1234567890\n" // Enter phone number
                + "1000.0\n" // Enter initial balance
                + "1234\n" // Enter PIN
                + "n\n"
                + "n\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Create Bank object and call Start_banking
        Bank bank = new Bank();
        bank.Start_banking();

        // Capture the printed messages
        String printedOutput = outputStream.toString();

        // Assert specific expected output within the captured messages
        assertTrue(printedOutput.contains("Exits system"));
    }


}
