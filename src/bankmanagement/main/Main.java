package bankmanagement.main;

import bankmanagement.accounts.*;
import bankmanagement.bank.Bank;
import bankmanagement.people.*;

public class Main {
    public static void main(String[] args) {

        // Create Bank
        Bank bank = new Bank();

        // Create Customers
        Customer customer1 = new Customer(
                "John Doe",
                34,
                "221B Baker Street",
                "9876543210",
                "C101"
        );

        Customer customer2 = new Customer(
                "Jane Smith",
                28,
                "Park Street",
                "9123456780",
                "C102"
        );

        // Create Employee
        Employee employee = new Employee(
                "Robert Brown",
                "Mumbai",
                "9988776655",
                34,
                "E101",
                "Manager",
                75000.00
        );

        // Create Accounts
        Account account1 = new SavingsAccount(
                8.5,
                1000.0,
                "7208933148",
                5000.00,
                "Mumbai Branch",
                "SBIN0001234",
                customer1
        );

        Account account2 = new SavingsAccount(
                7.5,
                500.0,
                "7208933149",
                8000.00,
                "Mumbai Branch",
                "SBIN0001234",
                customer2
        );

        // Add to Bank
        bank.addEmployee(employee);
        bank.addAccount(account1);
        bank.addAccount(account2);

        System.out.println("===== BANK DETAILS =====");
        bank.displayBankDetails();

        System.out.println("\n===== ACCOUNTS =====");
        bank.displayAccounts();

        System.out.println("\n===== CUSTOMERS =====");
        bank.displayCustomers();

        System.out.println("\n===== EMPLOYEES =====");
        bank.displayEmployees();

        System.out.println("\n===== FIND ACCOUNT =====");
        Account found = bank.findAccount("7208933148");
        if (found != null) {
            found.displayDetails();
        } else {
            System.out.println("Account not found.");
        }

        System.out.println("\n===== PERFORMING TRANSACTIONS =====");

        account1.deposit(2000);      // Success
        account1.deposit(-500);      // Failed
        account1.withdraw(1000);     // Success
        account1.withdraw(10000);    // Failed

        System.out.println("\nCurrent Balance: " + account1.getBalance());

        System.out.println("\n===== TRANSACTION HISTORY =====");
        account1.displayTransactionHistory();

        System.out.println("\n===== REMOVE EMPLOYEE =====");
        bank.removeEmployee(employee);
        bank.displayEmployees();
    }
}
