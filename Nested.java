
/**
 * Write a description of class Nested here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nested
{
    public static void main(String[]Args)
    {
        int num= 15;
        
        if(num%3==0)
           {
            if(num%5==0)
           {
               System.out.println("It is divisible by both 3 and 5");
           }
           else 
           {
               System.out.println("It is not divisible by both 3 and 5");
           }
        }
        else if(num%5==0)
        
        {
            System.out.println("It is divisible by 5 not by 3");
        }
        
        }      
    }   
     