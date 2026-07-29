package bankmanagement.services;
import bankmanagement.enums.*;
import bankmanagement.accounts.*;
//Defines the operations that an account should support.
public class Transaction {
    private String transactionId;
    private double amount;
    private TransactionType type;
    private TransactionStatus status;
    private Account account;
    private static int transactionCounter = 1;
    public Transaction(){
        this.transactionId = "No ID";
        this.amount = 0.0;
        this.type = TransactionType.NOTRANSACTION;
        this.status = TransactionStatus.PENDING;
        this.account = null;
    }
    public Transaction( double amount, TransactionType type, TransactionStatus status, Account account){
        this.transactionId = "TXN"+transactionCounter++;
        this.amount = amount;
        this.type = type;
        this.status = status;
        this.account = account;
    }
    public String getTransactionId(){
        return transactionId;
    }
    public void setTransactionId(String newTransactionId){
        this.transactionId = newTransactionId;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double newAmount){
        this.amount = newAmount;
    }
    public TransactionType getType(){
        return type;
    }
    public void setType(TransactionType newType){
        this.type = newType;
    }
    public TransactionStatus getStatus(){
        return status;
    }
    public void setStatus(TransactionStatus newStatus){
        this.status = newStatus;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account newAccount){
        this.account = newAccount;
    }
    public void displayDetails(){
        if(account != null){
            System.out.println("Account number: " + account.getAccNumber());
        }else{
            System.out.println("Account number: Not Assigned");
        }
        System.out.println("Transaction amount: "+getAmount());
        System.out.println("Transaction ID: "+getTransactionId());
        System.out.println("Transaction type: "+getType());
        System.out.println("Transaction Status: "+ getStatus());
    }
}
