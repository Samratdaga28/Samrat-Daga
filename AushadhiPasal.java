
/**
 * Write a description of class AyurvedicPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AushadhiPasal
{
    public static void main(String[] args)
    {
    
        String med1 = "Paracetamol";
        double price1 = 4.5;     
        int stock1 = 130;
        boolean prescription1 = false;

        String med2 = "Amoxicillin";
        double price2 = 6.0;
        int stock2 = 90;
        boolean prescription2 = true;

        String med3 = "Cough Syrup";
        double price3 = 55.0;
        int stock3 = 35;
        boolean prescription3 = false;

        System.out.println("\n\tAUSHADHI PASAL INVENTORY REPORT");
        System.out.println("\t-----------------------------------------");
        System.out.println("\tMedicine\tPrice (NPR)\tStock\tPrescription");
        System.out.println("\t-----------------------------------------");

        System.out.println("\t" + med1 + "\t" + price1 + "\t\t" + stock1 + "\t" + prescription1);
        System.out.println("\t" + med2 + "\t" + price2 + "\t\t" + stock2 + "\t" + prescription2);
        System.out.println("\t" + med3 + "\t" + price3 + "\t\t" + stock3 + "\t" + prescription3);

        System.out.println("\t-----------------------------------------");
    }
}
