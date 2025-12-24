package Week4;
import java.util.Scanner;


/**
 * Write a description of class EvenOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOdd
{
    public static void main(String [] args)
    {
      
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number: ");
      
      int num = sc.nextInt();
      
      if(num % 2 == 0)
      {
        System.out.println("The number is even");
      }
      else
      {
        System.out.println("The number is odd");
      }
}
}