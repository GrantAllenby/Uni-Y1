
/**
 * Used to demonstrate multiple inheritance.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class ColourTriangle extends Triangle
{    
    private String colour;

    /**
     * Constructor for objects of class ColourTriangle
     */
    public ColourTriangle(String colour, String style, double width, double length)
    {
        super("ColourTriangle",style, width, length);
        this.colour = colour;
    }

    /**
     * gets the current value for colour
     * 
     * @return     the triangle colour
     */
    public String getColour()
    {
        return colour;
    }
    
    /**
     * returns the triangle details.
     */
    public String toString()
    {
        String output = "Colour is " + colour +"\n";
        output = output + super.toString();
        return output;
    }
    
    /**
     * prints out the triangle details.
     */
    public void print()
    {
        System.out.println(toString());
    }
}
