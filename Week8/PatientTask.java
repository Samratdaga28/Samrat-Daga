package Week8;


/**
 * Write a description of class PatientTask here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatientTask
{
  public static void main(String[] args)
    {
        Patient p1 = new Patient("Ram Sharma", 45, 5, 2000);
        Patient p2 = new Patient("Sita Thapa", 30, 10, 1500);
        System.out.println("Hospital Patient Billing System\n");
        p1.displayDetails();
        p2.displayDetails();
    }
}