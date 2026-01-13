package Week10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args)
    {
        Doctor d1 = new Doctor(101, "Dr. Samrat", 50000,"cardiology", 15000);
        Nurse n1 = new Nurse(201, "Sita", 30000, "Night", 5000);
        System.out.println("----- Doctor Details -----");
        System.out.println(d1);
        System.out.println("Salary (Normal): " + d1.calculateSalary());
        System.out.println("Salary (With Emergency): " + d1.calculateSalary(3));

        System.out.println();

        System.out.println("----- Nurse Details -----");
        System.out.println(n1);
        System.out.println("Salary: " + n1.calculateSalary());
    }
}
