
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends TwoDShape
{
    public Rectangle(double width, double length)
    {
        super("Rectangle", width, length);
    }
    
    public double area()
    {
       return (super.getLength() * super.getWidth()); 
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
