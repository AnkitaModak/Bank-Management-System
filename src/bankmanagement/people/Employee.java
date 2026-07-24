package bankmanagement.people;
//Represents a bank employee.
public class Employee extends Person{
    private String employeeID;
    private String designation;
    private double salary;
    public Employee(){
        super();
        this.employeeID = "Not Available";
        this.designation="Not Available";
        this.salary = 0.0;
    }
    public Employee(String name,String address,String phoneNo,int age,String employeeID,String designation,double salary){
        super(name,address,phoneNo,age);
        this.employeeID = employeeID;
        this.designation = designation;
        this.salary =salary;
    }
    public String getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(String newEmployeeID){
        this.employeeID = newEmployeeID;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String newDesignation){
        this.designation = newDesignation;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee's ID: "+ getEmployeeID());
        System.out.println("Employee's designation: "+getDesignation());
        System.out.println("Employee's salary: ₹"+ getSalary());
    }
}

