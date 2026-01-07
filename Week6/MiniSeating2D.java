package Week6;


/**
 * Write a description of class MiniSeating2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniSeating2D
{
public static void main(String []args)
    {
         String[][] seats = {{"Alice", "Bob", "Charlie"},{null, null, null}};
        System.out.println("Seating Chart:");
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                if (seats[i][j] == null || seats[i][j].isEmpty())
                {
                    System.out.print("[empty]\t");
                } else 
                {
                    System.out.print(seats[i][j] + "\t");
                }
                
            }
            System.out.println(); 
        }
    }
}