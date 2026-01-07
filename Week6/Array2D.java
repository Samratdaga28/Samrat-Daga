package Week6;


/**
 * Write a description of class Array2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array2D
{
public static void main(String []args)
    {
        int [] [] n = {{1,2,3},{4,5,6}};
        for (int i= 0; i<2; i++)
        {
            for (int j = 0; j<3; j++)
            {
                System.out.print(n[i][j]+ "");
            }
            System.out.println();
        }
    }
}