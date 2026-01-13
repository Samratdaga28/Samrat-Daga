package Week10;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student 
{

    public ManagementStudent(int rollNo, String name, double marks)
    {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() 
    {
        String baseResult = super.calculateResult();
        return "Management Student Result: " + baseResult;
    }

    public String calculateResult(int graceMarks) 
    {
        setMarks(getMarks() + graceMarks);
        return calculateResult();
    }
}
