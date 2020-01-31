
/**
 * Write a description of class Triangle here.
 * 
 * @author (Grant Allenby) 
 * @version (v1.0)
 */
public class Triangle extends TwoDShapeForLab
{
    public String style;
    
    public Triangle(double width, double length, String style)
    {
        super(width, length);
        this.style = style;
    }
    
    public double area()
    {
        return (getWidth() * getLength() / 2);
    }
    
    public String getStyle()
    {
        return style;
    }
    
    public void printStyle()
    {
        System.out.println("style of triangle is " + style);
    }
    
    public String toString()
    {
        return "width is: " + getWidth() + ", length is: " + getLength() + ", style is: " + style;
    }
}
