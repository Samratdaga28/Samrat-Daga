
/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[]args)
    {
       int num=15;
       
       if(num%3==0 && num%5==0)
       {
           System.out.println("This number is divisible by both 3 and 5");
       }
       else
       {
           System.out.println("This number is not divisible by 3 and 5");
       }
       
    }
}