package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create an instance of BankAccount
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter your account holder name: ");
        String accountHolderName = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountHolderName);

        // Perform actions
        while (true) {
            System.out.println("\nChoose an action: 1. Deposit 2. Withdraw 3. Check Balance 4. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    // Check balance
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid action.");
            }
        }
    }
}