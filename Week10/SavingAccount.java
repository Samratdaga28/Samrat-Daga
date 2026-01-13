package Week10;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends Account
{
    public SavingAccount(long accountNumber, String holderName, double balance)
    {
        super(accountNumber,  holderName, balance);
    }
    protected double getInterest()
    {
        double interestRate = 4.0;
        return super.getBalance() * interestRate / 100;
    }
    double calculateInterest(double rate) 
    {
        return super.getBalance() * rate / 100;
    }
    @Override
    public String toString() 
    {
        return super.toString() + " (Savings Account)";
    }
}