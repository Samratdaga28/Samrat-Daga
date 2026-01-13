package Week9;


/**
 * Write a description of class SchoolApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolApp
{
    public static void main(String[] args)
    {
        Teacher t1= new Teacher(2001, "Samrat", 45000, "Programming", 6000);
        t1.calculateAnnualSalary();
        
        Staff s1= new Staff(2012, "Sam", 25000, 12, 250);
        s1.calculateSalary();
    }
}
