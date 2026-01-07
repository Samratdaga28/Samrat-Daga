package Week7;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    double length; 
    double breadth; 
    public Rectangle(double length, double breadth) 
        {
            this.length = length;
            this.breadth = breadth; 
        } 
    public double calculateArea() 
        {
            return length * breadth; 
        }

        public void displayDetails() 
        {
            System.out.println("Length: " + length +" | Breadth: " + breadth +
            " | Area: " + calculateArea()); 
        } 
 }
    