package Week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
public static void main(String[] args)
     {
        NormalOrder no = new NormalOrder(101, "Samrat", 2000);
        PremiumOrder po = new PremiumOrder(201, "Pg", 5000);
        System.out.println("----- Normal Order -----");
        System.out.println(no);
        System.out.println("Final Amount (No Discount): " + no.calculateFinalAmount());
        System.out.println("Final Amount (With Discount 100): " + no.calculateFinalAmount(100));
        System.out.println();
        System.out.println("----- Premium Order -----");
        System.out.println(po);
        System.out.println("Final Amount (No Discount): " + po.calculateFinalAmount());
        System.out.println("Final Amount (With Discount 200): " + po.calculateFinalAmount(200));
    }
    
}