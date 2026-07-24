package bankmanagement.accounts;
import bankmanagement.accounts.Account;
import bankmanagement.people.Customer;

//Represents a savings account.
public class SavingsAccount extends Account{
    private double interestRate;
    private double minimumBalance;
    public SavingsAccount(){
        super();
        this.interestRate = 0.0;
        this.minimumBalance = 0.0;
    }
    public SavingsAccount(double interestRate,double minimumBalance,String accNumber, double balance, String ifscCode, String branchName, Customer accountHolder){
        super(accNumber,balance,ifscCode,branchName,accountHolder);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double newInterestRate){
        this.interestRate = newInterestRate;
    }
    public double getMinimumBalance(){
        return  minimumBalance;
    }
    public void setMinimumBalance(double newMinimumBalance){
        this.minimumBalance = newMinimumBalance;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest rate: "+ interestRate);
        System.out.println("Minimum Balance: "+minimumBalance);
    }
}
