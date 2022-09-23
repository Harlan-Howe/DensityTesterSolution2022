public class DensityBox
{
    private int width, height, depth;
    private double fluidDensity, fractionFilled;

    public DensityBox()
    {
        width = 10;
        height = 10;
        depth = 10;
        fluidDensity = 1.0;
        fractionFilled = 0.5;
    }

    public DensityBox(int w, int h, int d)
    {
        this();
        width = w;
        height = h;
        depth = d;
    }

    public DensityBox(double fraction, double density)
    {
        this();
        fluidDensity = density;
        fractionFilled = fraction;
    }

    public DensityBox(int w, int h, int d, double density, double fraction)
    {
        this(w,h,d);
        fluidDensity = density;
        fractionFilled = fraction;
    }

    public String toString()
    {
        String result = "("+width+" cm x "+height+" cm x "+depth+" cm) box filled "+fractionFilled;
        result+= " full of fluid with density "+fluidDensity+" g/cm^3)";
        return result;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getDepth()
    {
        return depth;
    }

    public double getFluidDensity()
    {
        return fluidDensity;
    }

    public double getFractionFilled()
    {
        return fractionFilled;
    }

    public int getOverallVolume()
    {
        return width * height * depth;
    }

    public double getFilledVolume()
    {
        return getOverallVolume()*fractionFilled;
    }

    public double getMass()
    {
        return getFilledVolume() * fluidDensity;
    }

    public boolean canFloat()
    {
        return (getMass()/getOverallVolume())<1.0;
    }


}
