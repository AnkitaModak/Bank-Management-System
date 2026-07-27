package bankmanagement.main;
import bankmanagement.people.*;
import bankmanagement.accounts.*;
import bankmanagement.services.*;
import bankmanagement.enums.*;
//Starts the application and displays the menu.
public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person("Ankita Modak", "Tarakeswar", "9648291829", 20);
        Customer c1 = new Customer("Arnab Ganguly", 23, "Takipur", "9097692242", "c01");
//        Person p2 = new Customer();//upcasting
//        Person p3 = new Employee("Ameha Mahato", "Hydrabad", "9823790810", 32, "E0001", "HR", 45000.00);
//        Account account1 = new Account("MAIN-072026-0001", 10000.89, "123422131313", "mumbai", c1);
//        account1.displayDetails();
//        Account account2 = new SavingsAccount(7.2,100.00,"MAIN-072026-0001", 5000.00, "123422131313", "Mumbai Main Branch", c1);
        Account account3 = new CurrentAccount(10000.00,5000.00,2,17.89,"MAIN-072026-0001", 5000.00, "123422131313", "Mumbai Main Branch", c1);
//        account2.displayDetails();
//        account3.displayDetails();
        Transaction t1 = new Transaction("BK6352001",2000.00,TransactionType.WITHDRAWAL,TransactionStatus.SUCCESS,account3);
        account3.displayDetails();
        t1.displayDetails();
    }
}
