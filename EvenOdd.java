
/**
 * Write a description of class EvenOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOdd
{
    public static void main(String[]args)
    {
        int number= 7;
        
        String Result= (number%2==0)?"Even":"Odd";
        
        System.out.println("The number is: " + Result);
    }
}