package Week7;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main 
{
    public static void main(String []args)
    {
        // book objects
        Book book1 = new Book("Java Programming", "James Gosling", 499.99);
        Book book2 = new Book("Data Structures", "Robert Lafore", 599.50); 
         System.out.println("Book Details:");
         book1.displayDetails(); 
         book2.displayDetails();
        
        // rectangleobjects
        Rectangle rect1 = new Rectangle(10, 5); 
        Rectangle rect2 = new Rectangle(7.5, 4); 
         System.out.println("Rectangle Details:"); 
         rect1.displayDetails();
         rect2.displayDetails();
        
        // employee objects
          Employee emp1 = new Employee(101, "Alice", 50000); 
          Employee emp2 = new Employee(102, "Bob", 65000); 
          Employee emp3 = new Employee(103, "Charlie", 60000); 
          System.out.println("Employee Details:"); 
          emp1.displayDetails(); 
          emp2.displayDetails(); 
          emp3.displayDetails(); 
           Employee highest = emp1; 
          if (emp2.salary > highest.salary){
               highest = emp2; 
            }
           if (emp3.salary > highest.salary) {
               highest = emp3; 
            } 
        System.out.println("\nEmployee with Highest Salary:"); highest.displayDetails();
        
        


        
        
        // laptop objects
        Laptop l1 = new Laptop("Dell", 8, 75000);
        Laptop l2 = new Laptop("HP", 16, 90000);
        Laptop l3 = new Laptop("Lenovo", 12, 85000);
        System.out.println("Laptops with RAM greater than 8GB:");
        System.out.println("Brand\tRAM\tPrice");
        if (l1.ram > 8)
        {
            System.out.println(l1.brand + "\t" + l1.ram + "\t" + l1.price);
        }
         if (l2.ram > 8)
         {
             System.out.println(l2.brand + "\t" + l2.ram + "\t" + l2.price);
             
         }
          if (l3.ram > 8)
          {
               System.out.println(l3.brand + "\t" + l3.ram + "\t" + l3.price);
          }
          
          
          
        // Mobile objects
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 18000;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 120000;

        Mobile m3 = new Mobile();
        m3.brand = "Redmi";
        m3.price = 15000;
        Mobile[] mobiles = {m1, m2, m3};
        System.out.println("Affordable Mobiles (Price < 20000):");
        for (Mobile m : mobiles)
        {
             if (m.isAffordable())
             {
                 System.out.println(m.brand + " - Rs. " + m.price);
             }
        }
        
        
        
        
        // result objects
        Result a2 = new Result();
        a2.subject1 = 65;
        a2.subject2 = 70;
        a2.subject3 = 85;
        Result b2 = new Result();
        b2.subject1 = 65;
        b2.subject2 = 70;
        b2.subject3 = 85;
        System.out.println("Result of Student 1:");
        a2.displayResult();
        System.out.println();
        System.out.println("Result of Student 2:");
        b2.displayResult();
          
          
          
         // Scenario objects
        
        BankAccount acc1 = new BankAccount("ACC1001", "Alice", 5000);
        BankAccount acc2 = new BankAccount("ACC1002", "Bob", 3000);

        acc1.deposit(1500);
        acc1.withdraw(2000);

        acc2.deposit(1000);
        acc2.withdraw(500);

        System.out.println("\nFinal Balances:");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
