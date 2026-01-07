package Week5;
import java.util.Scanner;


/**
 * Write a description of class TableGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TableGenerator

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        for (int i = 1; i<=10; i++)
        {
            System.out.println(num + "x" + i + " = " + (num * i));
        }
        
    }
}
