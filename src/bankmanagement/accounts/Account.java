package bankmanagement.accounts;
import bankmanagement.people.Customer;
//Stores common account information and behavior.
public class Account {
    private String accNumber;
    private double balance;
    private String ifscCode;
    private String branchName;
    private Customer accountHolder;
    public Account(){
        this.accNumber = "Not Available";
        this.balance = 0.0;
        this.ifscCode = "Not Available.";
        this.branchName = "Not Available.";
        this.accountHolder = null;
    }
    public Account(String accNumber,double balance,String ifscCode,String branchName,Customer accountHolder){
        this.accNumber = accNumber;
        this.balance = balance;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
        this.accountHolder = accountHolder;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String newAccNumber) {
        this.accNumber = newAccNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public String getIfscCode(){
        return  ifscCode;
    }
    public void setIfscCode(String newIfscCode){
        this.ifscCode = newIfscCode;
    }
    public String getBranchName(){
        return branchName;
    }
    public void setBranchName(String newBranchName){
        this.branchName = newBranchName;
    }
    public Customer getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(Customer newAccountHolder) {
        this.accountHolder = newAccountHolder;
    }
    public void displayDetails(){
        System.out.println("AccountHolder Details: ");
        getAccountHolder().displayDetails();
        System.out.println("Account number: "+ getAccNumber());
        System.out.println("IFSC Code: " + getIfscCode());
        System.out.println("Branch Name: "+ getBranchName());
        System.out.println("available balance: "+getBalance());
    }
}
