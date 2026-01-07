package Week5;


/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    public static void main(String[] args)
    {
        int i = 1;
        System.out.println("Squares of first 10 natural numbers:");
        while (i <= 10) {
            System.out.println(i + "² = " + (i * i));
            i++;
        }
    }
}