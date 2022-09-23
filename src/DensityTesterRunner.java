public class DensityTesterRunner
{
    public static void main(String[] args)
    {
        DensityBox BoxA = new DensityBox();

        //Part 1 =================================================================
        // Make the toString() method in DensityBox, so this prints out the relevant info for this DensityBox.
        // For example:
        //     (10 cm x 10 cm x 10 cm) box, 0.5 full of 1.0 g/cm^3 liquid.

        System.out.println("Box A: "+BoxA);

        //Part 2 =================================================================
        // make constructors to fulfill the requirements outlined in part 2 of the instructions.


        DensityBox BoxB = new DensityBox (5, 7, 12);
        System.out.println("Box B: "+BoxB);

        DensityBox BoxC = new DensityBox (0.75, 1.67);
        System.out.println("Box C: "+BoxC);

        DensityBox BoxD = new DensityBox (8, 3, 11, 0.25, 3.75);
        System.out.println("Box D: "+BoxD);



        // Part 3 =================================================================

        System.out.println("Box B has width: "+BoxB.getWidth()+"\theight: "+BoxB.getHeight()+"\tand depth: "+BoxB.getDepth());
        System.out.println("Box B is "+BoxB.getFractionFilled()*100+"% full of fluid with density "+BoxB.getFluidDensity()+" times that of water.");
        System.out.println("Box C has overall volume "+BoxC.getOverallVolume());
        System.out.println("Box A has filled volume "+BoxA.getFilledVolume());
        System.out.println("Box D has mass "+BoxD.getMass());

        
        // Part 4 =================================================================
        
        System.out.println("The following boxes will float:");
        System.out.println("A: "+BoxA.willFloat());
        System.out.println("B: "+BoxB.willFloat());
        System.out.println("A: "+BoxC.willFloat());
        System.out.println("B: "+BoxD.willFloat());

        
        // Part 5 =================================================================
        /*
        System.out.println("Filling Box C to 0.85.");
        BoxC.setFractionFilled(0.85);
        System.out.println(BoxC);
        System.out.println("Increasing Box D by 0.45.");
        BoxD.setFractionFilled(BoxD.getFractionFilled()+0.45);
        System.out.println(BoxD);
        */

        // Part 6 =================================================================
        /*
        System.out.println("Box A is heavier than Box B: "+BoxA.heavierThan(BoxB)); // should print true
        System.out.println("Box B is heavier than Box A: "+BoxB.heavierThan(BoxA)); // should print false
        System.out.println("Box B is heavier than Box C: "+BoxB.heavierThan(BoxC)); // should print false
        System.out.println("Box C is heavier than Box D: "+BoxC.heavierThan(BoxD)); // should print true
        */

        // Part 7 =================================================================
        /*
        System.out.println("Trying to add C to D.");
        System.out.println(BoxD.fillWith(BoxC)); // should print false, since densities don't match.
        System.out.println(BoxC+"\n"+BoxD); // both boxes should be unchanged.

        System.out.println("Trying to add A to B");
        System.out.println(BoxB.fillWith(BoxA)); // should print false, since B doesn't have enough space.
        System.out.println(BoxA+"\n"+BoxB); // both boxes should be unchanged

        System.out.println("Trying to add B to A");
        System.out.println(BoxA.fillWith(BoxB)); // should print true, since transfer can happen.
        System.out.println(BoxA+"\n"+BoxB); // BoxA should now be 0.71 fractionFilled. BoxB should now be 0.00 fractionFilled.
        */
    }

}
