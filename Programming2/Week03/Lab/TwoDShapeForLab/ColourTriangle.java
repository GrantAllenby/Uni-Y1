
/**
 * Write a description of class ColourTriangle here.
 * 
 * @author (Grant Allenby) 
 * @version (v.1.0)
 */
public class ColourTriangle extends Triangle
{
    public String colour;

    public ColourTriangle(double width, double length, String style, String colour)
    {
        super(width, length, style);
        this.colour = colour;
    }

    public String getColour()
    {
        return colour;
    }
    
    public String toString()
    {
        return "width is: " + getWidth() + ", length is: " + getLength() + ", style is: " + getStyle() + ", colour is: " + colour;
    }
}
