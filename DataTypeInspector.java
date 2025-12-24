
/**
 * Write a description of class DataTypeInstructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeInspector 
{
        public static void main(String[] args) 
        {
        byte byteValue = 100;              
        short shortValue = 32000;           
        int intValue = 123456;              
        long longValue = 123456789L;      

        float floatValue = 10.5f;          
        double doubleValue = 99.99;         

        char charValue = 'A';              
        boolean booleanValue = true;       

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}
