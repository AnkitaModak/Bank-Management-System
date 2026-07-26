package bankmanagement.accounts;
import bankmanagement.people.Customer;

//Represents a current account.
public class CurrentAccount extends Account{
    private double overdraftLimit;
    private double withdrawalLimit;
    private int transactionLimit;
    private double maintenanceFee;
    private int transactionCount;
    public CurrentAccount(){
        super();
        this.overdraftLimit = 0.0;
        this.withdrawalLimit = 0.0;
        this.transactionLimit = 0;
        this.maintenanceFee = 0.0;
        this.transactionCount = 0;
    }
    public CurrentAccount(double overdraftLimit,double withdrawalLimit,int transactionLimit,double maintenanceFee,String accNumber, double balance, String ifscCode, String branchName, Customer accountHolder){
        super(accNumber,balance,ifscCode,branchName,accountHolder);
        this.overdraftLimit = overdraftLimit;
        this.withdrawalLimit = withdrawalLimit;
        this.transactionLimit = transactionLimit;
        this.maintenanceFee = maintenanceFee;
        this.transactionCount = 0;
    }
    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }
    public void setOverdraftLimit(double newOverdraftLimit){
        this.overdraftLimit = newOverdraftLimit;
    }
    public double getWithdrawalLimit(){
        return this.withdrawalLimit;
    }
    public void setWithdrawalLimit(double newWithdrawalLimit){
        this.withdrawalLimit = newWithdrawalLimit;
    }
    public int getTransactionLimit(){
        return this.transactionLimit;
    }
    public void setTransactionLimit(int newTransactionLimit){
        this.transactionLimit = newTransactionLimit;
    }
    public double getMaintenanceFee(){
        return this.maintenanceFee;
    }
    public void setMaintenanceFee(double newMaintenanceFee){
        this.maintenanceFee = newMaintenanceFee;
    }
    public int getTransactionCount(){
        return transactionCount;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Overdraft Limit: " + getOverdraftLimit());
        System.out.println("Withdrawal Limit: " + getWithdrawalLimit());
        System.out.println("Transaction Limit: " + getTransactionLimit());
        System.out.println("Maintenance Fee: " + getMaintenanceFee());
        System.out.println("Transaction Count: " + getTransactionCount());
    }
    @Override
    public boolean withdraw(double amount){
        if(amount <= 0 || amount>getWithdrawalLimit() || getTransactionCount() >= getTransactionLimit() || getBalance() - amount < -(getOverdraftLimit())) return false;
        setBalance(getBalance()-amount);
        this.transactionCount++;
        return true;
    }
}

