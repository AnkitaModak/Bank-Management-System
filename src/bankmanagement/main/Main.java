package bankmanagement.main;
import bankmanagement.people.Person;
import java.util.*;
//Starts the application and displays the menu.
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
        p1.displayDetails();
        p2.displayDetails();
    }
}
