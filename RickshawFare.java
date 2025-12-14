
/**
 * Write a description of class RickShawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

     public class RickshawFare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double baseFare = 120;
        double perKm = 40;
        double perMinute = 3;

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (minutes): ");
        double time = sc.nextDouble();

        System.out.print("Is customer local? (yes/no): ");
        String local = sc.next();

        System.out.print("Is it night time? (yes/no): ");
        String night = sc.next();

        double totalFare = baseFare + (distance * perKm) + (time * perMinute);

        double discount = (local.equalsIgnoreCase("yes") && distance > 10)
                ? totalFare * 0.10
                : 0;

        double surcharge = (night.equalsIgnoreCase("yes"))
                ? totalFare * 0.15
                : 0;

        double finalFare = totalFare - discount + surcharge;

        System.out.println("\n--------------------");
        System.out.println("Rickshaw Fare Bill");
        System.out.println("Total Fare: Rs. " + (int) finalFare);
        System.out.println("--------------------");

        sc.close();
    }
}
