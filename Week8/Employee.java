package Week8;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
private double basicSalary;
    Employee(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    double calculateGrossSalary()
    {
        return basicSalary + (0.20 * basicSalary);
    }
    double getBasicSalary()
    {
        return basicSalary;
    }
}