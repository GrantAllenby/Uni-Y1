
public class TwoDShape
{
    private double width;
    private double length;
    public TwoDShape()
    {
    }
    
    public TwoDShape(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    
    public TwoDShape (double width)
    {
        this.width = width;
        length = width;
    }
       
    public void setWidth( double width)
    {
        this.width = width; 
    }
    
    public void setLength( double length)
    {
        this.length = length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public String toString()
    {
        return "Width and length are " + width + " and " + length;
    }
}

