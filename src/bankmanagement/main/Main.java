package bankmanagement.main;
import bankmanagement.people.Person;
import bankmanagement.people.Customer;
import bankmanagement.people.Employee;
//Starts the application and displays the menu.
public class Main {
    public static void main(String[] args){
        Person p1 = new Person("Ankita Modak","Tarakeswar","9648291829",20);
        Customer c1 = new Customer("Arnab Ganguly",23,"Takipur","9097692242","c01");
        Person p2 = new Customer();//upcasting
        Person p3 = new Employee("Ameha Mahato","Hydrabad","9823790810",32,"E0001","HR",45000.00);
        c1.displayDetails();
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}
