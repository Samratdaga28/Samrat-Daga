package Week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class PremiumOrder extends Order
{
   public PremiumOrder(int orderId, String customerName, double amount) 
   {
        super(orderId, customerName, amount);
   } 
   @Override
   public double calculateFinalAmount()
   {
        return super.getAmount() + (super.getAmount() * 0.10) + 50;
   }
   public double calculateFinalAmount(double discountAmount)
   {
        return calculateFinalAmount() - discountAmount;
   }
   @Override
   public String toString()
   {
        return super.toString() + " (Premium Order)";
   }
}
