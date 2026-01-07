package Week8;


/**
 * Write a description of class ElectricityTaskBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityTaskBill
{
public static void main(String[] args)
    {
         ElectricityBill bill1 = new ElectricityBill("Ram Sharma", 150);
         bill1.displayBill();
         System.out.println();
          bill1.setUnitsConsumed(90);
        bill1.displayBill();
    }
}