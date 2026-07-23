package bankmanagement.accounts;
import bankmanagement.people.Customer;
//Stores common account information and behavior.
public class Account {
    private int accNumber;
    private double balance;
    private String ifscCode;
    private String branchCode;
    private Customer accountHolder;
    public Account(){
        this.accNumber = 0;
        this.balance = 0.0;
        this.ifscCode = "Not Available.";
        this.branchCode = "Not Available.";
        this.accountHolder = null;
    }
    public Account(int accNumber,double balance,String ifscCode,String branchCode,Customer accountHolder){
        this.accNumber = accNumber;
        this.balance = balance;
        this.ifscCode = ifscCode;
        this.branchCode = branchCode;
        this.accountHolder = accountHolder;
    }
}   public get
