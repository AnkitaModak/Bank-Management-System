package bankmanagement.main;

import bankmanagement.accounts.Account;
import bankmanagement.accounts.SavingsAccount;
import bankmanagement.people.Customer;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "John Doe",
                34,
                "221B Baker Street",
                "9876543210",
                "C101"
        );

        Account account = new SavingsAccount(
                8.5,
                1000.0,
                "7208933148",
                5000.00,
                "Mumbai Branch",
                "SBIN0001234",
                customer
        );

        System.out.println("===== ACCOUNT DETAILS =====");
        account.displayDetails();

        System.out.println("\n===== PERFORMING TRANSACTIONS =====");

        account.deposit(2000);      // Success
        account.deposit(-500);      // Failed

        account.withdraw(1000);     // Success
        account.withdraw(10000);    // Failed

        System.out.println("\nCurrent Balance: " + account.getBalance());

        System.out.println("\n===== TRANSACTION HISTORY =====");
        account.displayTransactionHistory();
    }
}
