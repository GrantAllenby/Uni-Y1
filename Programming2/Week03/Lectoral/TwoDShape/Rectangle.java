/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends TwoDShape
{
    private String style;
    
    public Rectangle(String style, double width, double length)
    {
        super(width,length);
        //setWidth(width);
        //setLength(length);
        this.style = style;
    }
   
    public double area()
    {
        return getWidth() * getLength();
    }

    public void setStyle(String style)
    {
        this.style = style;
    }

    public String getStyle()
    {
        return style;
    }
}
