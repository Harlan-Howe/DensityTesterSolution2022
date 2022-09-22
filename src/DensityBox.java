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

    public DensityBox(double density, double fraction)
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





}
