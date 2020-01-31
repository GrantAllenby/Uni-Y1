
/**
 * Write a description of class PolymorphicReporter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PolymorphicReporter
{
    public void outputDetails( TwoDShape shape)
    { 
        System.out.println( shape.toString()); 
        System.out.println(); 
    } 

    public void outputArea(TwoDShape shape)
    {     
        System.out.println(  "The area for the " + shape.getType() + " is " + shape.area() );
    }
}
