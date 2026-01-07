package Week5;


/**
 * Write a description of class RightAlligned here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RightAlligned
{
  public static void main(String []args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int s = 5; s > i; s--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
            }
        }
}