package Week4;
import java.util.Scanner;


/**
 * Write a description of class Nested here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nested
{
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      
      if(num % 3 == 0)
      {
       if(num % 5 == 0)
       {
        System.out.println("The number is divisible by both 3 and 5");
       }
       else
       {
        System.out.println("The number is divisble by 3");
       }
      }
      else
      {
       if(num % 5 == 0)
       {
        System.out.println("The number is divisible by 5");
       }
       else
       {
           System.out.println("The number is not divisible by neither 3 nor 5");
       }
      }
    }
    
}
