package bankmanagement.accounts;
import bankmanagement.enums.TransactionStatus;
import bankmanagement.enums.TransactionType;
import bankmanagement.people.Customer;
import bankmanagement.services.Transaction;

import java.util.ArrayList;

//Stores common account information and behavior.
public class Account {
    private String accNumber;
    private double balance;
    private String ifscCode;
    private String branchName;
    private Customer accountHolder;
    private ArrayList<Transaction> transactionHistory ;

    public Account(){
        this.accNumber = "Not Available";
        this.balance = 0.0;
        this.ifscCode = "Not Available.";
        this.branchName = "Not Available.";
        this.accountHolder = null;
        this.transactionHistory = new ArrayList<>();
    }
    public Account(String accNumber,double balance,String ifscCode,String branchName,Customer accountHolder){
        this.accNumber = accNumber;
        this.balance = balance;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
        this.accountHolder = accountHolder;
        this.transactionHistory = new ArrayList<>();
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
    public boolean deposit(double amount){
        if(amount<=0) {
            addTransaction(TransactionType.DEPOSIT,TransactionStatus.FAILED,amount);
            return false;
        }
        setBalance(getBalance()+amount);
        addTransaction(TransactionType.DEPOSIT,TransactionStatus.SUCCESS,amount);
        return true;
    }
    public boolean withdraw(double amount){
        if(amount<=0|| amount >getBalance()) {
            addTransaction(TransactionType.WITHDRAWAL,TransactionStatus.FAILED,amount);
            return false;
        }
        setBalance(getBalance()-amount);
        addTransaction(TransactionType.WITHDRAWAL,TransactionStatus.SUCCESS,amount);
        return true;
    }
    private void addTransaction(TransactionType type , TransactionStatus status,double amount){
        Transaction t1 = new Transaction(amount, type, status,this);
        transactionHistory.add(t1);
    }
    public void displayTransactionHistory(){
        System.out.println("===== Transaction History =====");
        if(transactionHistory.isEmpty()){
            System.out.println("No Transactions found!");
            return;
        }
        for(Transaction transaction: transactionHistory){
            transaction.displayDetails();
        }
        System.out.println("------------------------");
    }
}
