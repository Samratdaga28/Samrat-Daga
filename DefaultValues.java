
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class DefaultValues
{
    // Member variables (fields) – not initialized
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    public static void main(String[] args)
    {
        DefaultValues obj = new DefaultValues();
        
        System.out.println("Byte default value: " + obj.byteValue);
        System.out.println("Short default value: " + obj.shortValue);
        System.out.println("Int default value: " + obj.intValue);
        System.out.println("Long default value: " + obj.longValue);

        System.out.println("Float default value: " + obj.floatValue);
        System.out.println("Double default value: " + obj.doubleValue);

        System.out.println("Char default value: [" + obj.charValue + "]");
        System.out.println("Boolean default value: " + obj.booleanValue);

        /*
         * This does NOT work for local variables because
         * Java does not assign default values to local variables.
         * They must be initialized before use.
         */
    }
}

