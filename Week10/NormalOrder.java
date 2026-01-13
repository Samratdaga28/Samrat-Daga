package Week10;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order
{
    public NormalOrder(int orderId, String customerName, double amount)
    {
        super(orderId, customerName, amount);
    }
    @Override
    public double calculateFinalAmount() 
    {
        return super.getAmount() + (super.getAmount() * 0.05); 
    }
    double calculateFinalAmount(double discountAmount)
    {
        return calculateFinalAmount() - discountAmount;
    }
    @Override
    public String toString()
    {
        return super.toString() + " (Normal Order)";
    }
}