package Week5;


/**
 * Write a description of class IncreasingTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IncreasingTriangle
{
   public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}