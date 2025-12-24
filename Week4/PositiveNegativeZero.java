package Week4;
import java.util.Scanner;


/**
 * Write a description of class PositiveNegativeZero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegativeZero
{
    public static void main(String [] args)
    {
    
        Scanner sc = new Scanner(System.in);
    
      System.out.println("Enter a number");
      int n = sc.nextInt();
      
      if(n == 0)
      {
        System.out.println("The number is zero");
      }
      else if(n > 0)
      {
          System.out.println("The number is positive");
      }
      else
      {
        System.out.println("The number is negative");
      }
    }
}

