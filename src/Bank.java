import java.util.Scanner;

public class Bank {

    private Scanner scanner = new Scanner(System.in);

    public void Start_banking() {
        System.out.println("Welcome to the banking system!");

         {
            System.out.println("\nSelect an option:");
            System.out.println("1. Create a bkash account");
            System.out.println("2. Create a nagad account");
            System.out.println("3. Create a rocket account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createBkashAccount();
                    break;
                case 2:
                    createNagadAccount();
                    break;
                case 3:
                    createRocketAccount();
                    break;
                case 4:
                    System.out.println("Exiting the banking system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void createBkashAccount() {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        bkash farinbkash = new bkash(name, phoneNumber, balance, pin);
        farinbkash.information();

        // Perform add money operation
        System.out.print("Do you want to add money to your bkash account? (y/n): ");
        String addMoneyChoice = scanner.nextLine();
        if (addMoneyChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter the amount to add: ");
            double amountToAdd = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            farinbkash.addmoney(amountToAdd);
            System.out.println("Money added successfully.");
            farinbkash.information(); // Display updated account information
        }

        // Perform cashout operation
        System.out.print("Do you want to cashout from your bkash account? (y/n): ");
        String cashoutChoice = scanner.nextLine();
        if (cashoutChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter the amount to cashout: ");
            double amountToCashout = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter your PIN: ");
            String cashoutPin = scanner.nextLine();
            farinbkash.cashout(amountToCashout, cashoutPin);
            System.out.println("Cashout operation completed.");
            farinbkash.information(); // Display updated account information
        }
        if (cashoutChoice.equalsIgnoreCase("n")) {
            System.out.println("Exits system");
        }
    }
    private void createNagadAccount() {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        nagad farinnagad = new nagad(name, phoneNumber, balance, pin);
        farinnagad.information();

        // Perform add money operation
        System.out.print("Do you want to add money to your Nagad account? (y/n): ");
        String addMoneyChoice = scanner.nextLine();
        if (addMoneyChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter the amount to add: ");
            double amountToAdd = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            farinnagad.addmoney(amountToAdd);
            System.out.println("Money added successfully.");
            farinnagad.information(); // Display updated account information
        }

        // Perform cashout operation
        System.out.print("Do you want to cashout from your Nagad account? (y/n): ");
        String cashoutChoice = scanner.nextLine();
        if (cashoutChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter the amount to cashout: ");
            double amountToCashout = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter your PIN: ");
            String cashoutPin = scanner.nextLine();
            farinnagad.cashout(amountToCashout, cashoutPin);
            System.out.println("Cashout operation completed.");
            farinnagad.information(); // Display updated account information
        }
        if (cashoutChoice.equalsIgnoreCase("n")) {
            System.out.println("Exits system");
        }

    }

    private void createRocketAccount() {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        rocket farinrocket = new rocket(name, phoneNumber, balance, pin);
        farinrocket.information();

        // Perform add money operation
        System.out.print("Do you want to add money to your Rocket account? (y/n): ");
        String addMoneyChoice = scanner.nextLine();
        if (addMoneyChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter the amount to add: ");
            double amountToAdd = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            farinrocket.addmoney(amountToAdd);
            System.out.println("Money added successfully.");
            farinrocket.information(); // Display updated account information
        }



        // Perform cashout operation
        System.out.print("Do you want to cashout from your Rocket account? (y/n): ");
        String cashoutChoice = scanner.nextLine();
        if (cashoutChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter the amount to cashout: ");
            double amountToCashout = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter your PIN: ");
            String cashoutPin = scanner.nextLine();
            farinrocket.cashout(amountToCashout, cashoutPin);
            System.out.println("Cashout operation completed.");
            farinrocket.information(); // Display updated account information
        }
        if (cashoutChoice.equalsIgnoreCase("n")) {
            System.out.println("Exits system");
        }
    }




}
