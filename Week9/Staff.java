package Week9;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person
{
    private double workingHours;
    private double ratePerHour;
    
    public Staff(int id, String name, double basicSalary, double workingHours, double ratePerHour)
    {
        super(id, name, 0);
        this.workingHours= workingHours;
        this.ratePerHour= ratePerHour;
    }
    
    public double calculateSalary()
    {
        return this.workingHours * this.ratePerHour;
    }
}
