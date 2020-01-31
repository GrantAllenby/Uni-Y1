
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.1  
 */
public class Picture 
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */

    public void draw()
    {
        wall = new Square();
        wall.moveVertical( "ENTER AN INTEGER VALUE" );
        wall.changeSize( "ENTER AN INTEGER VALUE");
        wall.makeVisible();
        
        window = new Square();
        window.changeColor( "ENTER A COLOUR STRING" );
        window.moveHorizontal( "ENTER AN INTEGER VALUE");
        window.moveVertical( "ENTER AN INTEGER VALUE");
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize("ENTER AN INTEGER VALUE",  "ENTER AN INTEGER VALUE");
        roof.moveHorizontal( "ENTER AN INTEGER VALUE");
        roof.moveVertical("ENTER AN INTEGER VALUE");
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("ENTER A COLOUR STRING");
        sun.moveHorizontal( "ENTER AN INTEGER VALUE");
        sun.moveVertical( "ENTER AN INTEGER VALUE");
        sun.changeSize( "ENTER AN INTEGER VALUE");
        sun.makeVisible();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
