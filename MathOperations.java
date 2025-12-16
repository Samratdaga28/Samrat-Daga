
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]args)
    { 
        int a = 10;
        int b = 5;
        int c = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        System.out.println("Unary Operators:");
        System.out.println("pre-increment: ++a = " + (++a));
        System.out.println("post-increment: b++ = " + (b++));
        System.out.println("pre-decrement: --a = " + (--a));
        System.out.println("post-decrement: b-- = " + (b--));
        System.out.println("Assignment Operators:");
        a += 5;
        System.out.println("a = " + a);
        b -= 2;
      }
    }