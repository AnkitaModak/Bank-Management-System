package bankmanagement.main;
import bankmanagement.people.Person;
import bankmanagement.people.Customer;
//Starts the application and displays the menu.
public class Main {
    public static void main(String[] args){
        Person p1 = new Person("Ankita Modak","Tarakeswar","9648291829",20);
        Customer c1 = new Customer("Arnab Ganguly",23,"Takipur","9097692242","c01");
        Person p2 = new Customer();//upcasting(Dynamic Method Dispatch)
        c1.displayDetails();
        p1.displayDetails();
        p2.displayDetails();
    }
}
