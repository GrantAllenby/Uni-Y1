import java.lang.Math;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends TwoDShape
{
    public Circle(double radius)
    {
        super("Circle", radius, radius);
    }

    public double area()
    {
        return Math.PI * getWidth() * getWidth();
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
