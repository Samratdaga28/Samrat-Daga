package Week8;


/**
 * Write a description of class EmployeeTask here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTask
{
    public static void main(String[] args)
    {
        Employee emp = new Employee(30000);
        System.out.println("Basic Salary: Rs. " + emp.getBasicSalary());
        System.out.println("Gross Salary: Rs. " + emp.calculateGrossSalary());
    }
}