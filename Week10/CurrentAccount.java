package Week10;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends Account
{
    public CurrentAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo, holderName, balance);
    }
    public double calculateInterest()
    {
        double interestRate = 1.0; 
        return super.getBalance() * interestRate / 100;
    }
    public double calculateInterest(double rate)
    {
        return super.getBalance() * rate / 100;
    } 
    @Override
    public String toString()
    {
        return super.toString() + " (Current Account)";
    }
}