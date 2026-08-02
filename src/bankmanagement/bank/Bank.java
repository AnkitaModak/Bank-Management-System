package bankmanagement.bank;
import bankmanagement.accounts.Account;
import bankmanagement.people.Customer;
import bankmanagement.people.Employee;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Account> accounts;
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;
    public Bank(){
        this.bankName = "BCBI BANK";
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.employees = new ArrayList<>();
    }
public boolean addAccount(Account account){
        if(account ==null) return false;
        if(accounts.contains(account)) return false;
        accounts.add(account);
        addCustomer(account.getAccountHolder());
        return true;
}
public boolean addCustomer(Customer customer){
        if(customer==null) return false;
        if(customers.contains(customer)) return false;
        customers.add(customer);
        return true;
}
public boolean addEmployee(Employee employee){
        if(employee==null) return false;
        if(employees.contains(employee)) return false;
        employees.add(employee);
        return true;
}
public void displayAccounts(){
        System.out.println("===== Accounts =====");
        if(accounts.isEmpty()){
            System.out.println("No accounts found!");
            return;
        }
        for(Account account : accounts){
            account.displayDetails();
        }
}
public void displayCustomers(){
    System.out.println("===== Customers =====");
    if(customers.isEmpty()){
        System.out.println("No customers found!");
        return;
    }
    for(Customer customer : customers){
        customer.displayDetails();
    }
}
public void displayEmployees(){
    System.out.println("===== Employees =====");    
    if(employees.isEmpty()){
        System.out.println("No employees found!");
        return;
    }
    
    for(Employee employee : employees){
        employee.displayDetails();
    }
}
public Account findAccount(String accountNumber){
        for(Account account : accounts){
            if(account.getAccNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
}
public Customer findCustomer(String customerID){
        for(Customer customer: customers){
            if(customer.getCustomerID().equals(customerID)){
                return customer;
            }
        }
        return null;
    }
public Employee findEmployee(String empId){
        for(Employee employee : employees){
            if(employee.getEmployeeID().equals(empId)){
                return employee;
            }
        }
        return null;
    }
}

