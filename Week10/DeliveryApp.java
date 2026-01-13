package Week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args)
    {
        BikeDelivery b1 = new BikeDelivery(101, "Samrat", 12000);

        CarDelivery c1 = new CarDelivery(201, "pg", 15000);
        System.out.println("----- Bike Delivery Partner -----");
        System.out.println(b1);
        System.out.println("Payment (Normal): " + b1.calculatePayment());
        System.out.println("Payment (With Extra Orders): " + b1.calculatePayment(5));
        System.out.println();
        System.out.println("----- Car Delivery Partner -----");
        System.out.println(c1);
        System.out.println("Payment (Normal): " + c1.calculatePayment());
        System.out.println("Payment (With Extra Orders): " + c1.calculatePayment(3));
    }
}
