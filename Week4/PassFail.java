package Week4;
import java.util.Scanner;


/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFail
{
    public static void main(String [] args)
    {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter student's marks: ");
      int marks = sc.nextInt();
      
      if(marks >= 40)
      {
          System.out.println("Student has passed an examination");
      }
      else
      {
          System.out.println("Student has failed an examination");
      }
    }
}
