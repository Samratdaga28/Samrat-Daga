package Week9;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class CurrentAccount extends BankAccount 
{ 
    private double overdraftLimit;
    public CurrentAccount(int accountNumber, String name, double balance, double overdraftLimit)
    {
        super(accountNumber, name, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double amount)
    {
        if (amount <= getBalance() + overdraftLimit)
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            return true;
        } else
        {
            System.out.println("Withdrawal denied!");
            return false;
        }
    }
}
