package bankmanagement.people;
//Represents a bank customer.
public class Customer extends Person{
    private String customerID;
    public Customer(){
        customerID = "not applicable;";
    }
    public Customer(String name,int age,String address,String phoneNo,String customerID){
        super(name,address,phoneNo,age);
        this.customerID = customerID;
    }
    public String getCustomerID(){
        return customerID;
    }
    public void setCustomerID(String newCustomerID){
        this.customerID = newCustomerID;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Customer ID: "+customerID);
    }

}

