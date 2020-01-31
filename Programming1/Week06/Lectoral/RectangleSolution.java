/**
 * A simple class representing a rectangle.
 * Intended to be used in lecture 1.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class RectangleSolution
{
    // instance variables 
    private int length;
    private int breadth;

    /**
     * Constructor for objects of class Rectangle.
     */
    public RectangleSolution(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
   
    public boolean equals( Object o) 
    {     
        if ( o == null)    
        {
            return false;
        }
        
        if ( this == o)
        {
            return true;   
        }
        
        RectangleSolution other = (RectangleSolution) o;        
        
        if (( other.getLength() == length ) 
                          && ( other.getBreadth()== breadth))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
  
    /**
     * obtains the current value of length.
     *
     * @return     the length
     */
    public int getLength( )
    {
        return length;
    }
    
     /**
     * obtains the current value of breadth.
     *
     * @return     the breadth
     */
    public int getBreadth( )
    {
        return breadth;
    }
    
    /**
     * Calculates the area of the rectangle.
     *
     * @return     the area of the rectangle
     */
    public int calculateArea()
    {
        return length * breadth;
    }
    
    /**
     * Calculate perimeter
     * 
     * @return the perimeter of the rectangle
     */
    public int calculatePerimeter()
    {
        return 2 * ( length + breadth);
    }

}
