
/**
 * Write a description of class Trapezium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trapezium extends TwoDShape
{
    private double width2;

    public Trapezium(double width1, double width2, double length)
    {
        super("Trapezium", width1, length);
        this.width2 = width2;
    }
    
    public double area()
    {
      return (super.getLength() * (super.getWidth() + width2 /2));  
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public void printType()
    {
        System.out.println("Type is: " + super.getType());
    }
    
    public String toString()
    {
        return super.toString();
    }
}
