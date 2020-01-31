/**
 * This extends the base class to be used in the first part of the inheritance 
 * lab.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */

public class Triangle extends TwoDShape
{
    private String style;

    /**
     * Constructor for objects of class Triangle
     * accepts type as a parameter intended for use with subclasses.
     */
    public Triangle(String type, String style, double width, double length)
    {
        super(type, width, length);
        this.style = style;
    }
    
    /**
     * Constructor for objects of class Triangle assumes type set
     */
    public Triangle(String style, double width, double length)
    {
        super("Triangle", width, length);
        this.style = style;
    }

    /**
     * Calculates the area of the triangle as width * length / 2.0.
     * 
     * @return     the area of the triangle 
     */
    public double area()
    {
        return getWidth() * getLength() / 2.0 ;
    }
    
    /**
     * prints out the triangle type.
     * 
     */
    public void printStyle()
    {
        System.out.println("The triangle is " + style);
    }
    
    /**
     * gets the triangle style
     * 
     * @return the style of the triangle
     */
    public String getStyle()
    {
        return style;
    }
    
    /**
     * returns the triangle data.
     * 
     */
    public String toString()
    {
        String output = super.toString() + "\nThe triangle is " + style;
        return output;
    }
    /**
     * prints out the triangle data.
     * 
     */
    public void print()
    {
        System.out.println(toString());
        
    }
    

}
