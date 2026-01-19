package Week11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable
{
    public Rice(double landArea)
    {
        super("Rice", "Monsoon", landArea);
    }
    @Override
    public double calculateYield()
    {
        return landArea * 4.0;
    }
    @Override
    public double calculateWaterRequirement()
    {
        return landArea * 1200;
    }
    @Override
    public double calculateTransportCost() 
    {
         return landArea * 3000;
    }
    @Override
    public String getTransportMethod()
    {
         return "Tractor";
    }
    
     
}