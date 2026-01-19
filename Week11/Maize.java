package Week11;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable
{
    public Maize(double landArea)
    {
        super("Maize", "Summer", landArea);
    }
    @Override
    public double calculateYield()
    {
        return landArea * 2.5;
    }
    @Override
    public double calculateWaterRequirement()
    {
        return landArea * 400;
    }
    @Override
    public double calculateTransportCost()
    {
         return landArea * 2000;
    }
    @Override
    public String getTransportMethod()
    {
        return "Local Jeep";
    }
}