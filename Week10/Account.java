package Week10;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
private long accountNumber;
    private String holderName;
    private double balance;
    
    public Account(long accountNumber, String holderName, double balance)
    {
        this.accountNumber= accountNumber;
        this.holderName= holderName;
        this.balance= balance;
    }
    
    public void setAccountNumber(long newAccountNumber) 
    {
        this.accountNumber= newAccountNumber;
    }
    
    public long getAccountNumber() 
    {
        return this.accountNumber;
    }
    
    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public double calculateInterest() 
    {
        return 0;   
    }
    
    @Override
    public String toString() 
    {
        return "Account No: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance;
    }
}