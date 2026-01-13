package Week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student
 {

    public ScienceStudent(int rollNo, String name, double marks)
    {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult()
    {
        String baseResult = super.calculateResult();
        return "Science Student Result: " + baseResult;
    }

    public String calculateResult(int graceMarks)
    {
        setMarks(getMarks() + graceMarks);
        return calculateResult();
    }
}
