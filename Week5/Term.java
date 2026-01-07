package Week5;


/**
 * Write a description of class Term here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Term
{
    public static void main(String[] args) {
        int i;

        // for loop
        System.out.println("Series using for loop:");
        for (i = 1; i <= 10; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println("\n");

        // for  while loop
        System.out.println("Series using while loop:");
        i = 1;
        while (i <= 10) {
            System.out.print(2 * i + " ");
            i++;
        }
        System.out.println("\n");

        // for do-while loop
        System.out.println("Series using do-while loop:");
        i = 1;
        do {
            System.out.print(2 * i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }
}