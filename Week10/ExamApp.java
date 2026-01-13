package Week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
 {
    public static void main(String[] args)
    {

        ScienceStudent s1 = new ScienceStudent(101, "Samrat", 38);
        ManagementStudent m1 = new ManagementStudent(102, "pg", 42);

        System.out.println(s1);
        System.out.println(s1.calculateResult());
        System.out.println("After Grace Marks: " + s1.calculateResult(5));

        System.out.println();

        System.out.println(m1);
        System.out.println(m1.calculateResult());
        System.out.println("After Grace Marks: " + m1.calculateResult(3));
    }
}
