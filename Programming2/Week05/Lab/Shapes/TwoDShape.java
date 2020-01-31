
/**
 * This is the base class to be used in the first part of the inheritance 
 * lab.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public abstract class TwoDShape
{    
    private double width;
    private double length;
    private String type;
    
    private static int shapeCount;

    /**
     * DefaultConstructor for objects of class TwoDShape
     */
    public TwoDShape()
    {
        this.width = 0.0;
        this.length = 0.0;
        type = "unknown";
        shapeCount++;
    }
    
    /**
     * Constructor for objects of class TwoDShape
     * 
     * @param width the width of the shape
     * @param length the length of the shape
     */
    public TwoDShape(String type, double width, double length)
    {
        this.type = type;
        this.width = width;
        this.length = length;
        shapeCount++;
    }
    
    /**
     * returns the typeof the shape.
     * 
     * @return     the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * returns the current value for width of the shape.
     * 
     * @return     the width
     */
    public double getWidth()
    {
        return width;
    }
    
     /**
     * returns the current value for length of the shape.
     * 
     * @return     the length
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * returns the dimensions of the shape.
     */
    public String toString()
    {
        String output = "The shape type is " + type;
        output = output + "\nWidth is " + width + " Length is " + length;
        return output;
    }
    /**
     * prints out the dimensions of the shape.
     */
    public void print()
    {
        System.out.println(toString());        
    }
    
    /**
     * assigns a value to width
     * 
     * @param width the new value of width
     */
    public void setWidth( double width)
    {
        this.width = width;
    }
    
     /**
     * assigns a value to length
     * 
     * @param width the new value of length
     */
    public void setLength( double length)
    {
        this.length = length;
    }
    
     /**
     * prints out the number of shapes created.
     * 
     */
    public void printShapeCount()
    {
        System.out.println("Number of shapes created is " + shapeCount);
    }
        	
    public abstract double area();
}
