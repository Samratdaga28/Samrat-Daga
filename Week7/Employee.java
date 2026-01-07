package Week7;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    
    int id;
    String name;
    double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("ID: " + id + 
                           " | Name: " + name + 
                           " | Salary: " + salary);
    }
}



    


