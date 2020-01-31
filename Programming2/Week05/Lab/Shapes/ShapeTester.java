/**
 * Tests superclass / subclass assignment.
 * 
 * @author Ian Bradley
 * @version 1.0
 */
public class ShapeTester
{
    public static void main ( String [] args)
    {
        ShapeFactory sf = new ShapeFactory();      
        PolymorphicReporter pr =  new PolymorphicReporter();
        TwoDShape shape;
        
        for ( int i = 0 ; i < 10; i++)
        {
            shape = sf.getShape();
            pr.outputDetails(shape);
            pr.outputArea( shape);
            System.out.println();
        }        
 
    }
}
