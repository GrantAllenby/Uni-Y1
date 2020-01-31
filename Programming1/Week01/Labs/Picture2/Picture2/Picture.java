
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
    private Square grass;

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
        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(300);
        grass.moveVertical(130);
        grass.moveHorizontal(-60);
        grass.makeVisible();
        
        wall = new Square();
        wall.moveVertical(100);
        wall.moveHorizontal(-10);
        wall.changeSize(50);
        wall.makeVisible();
        
        window = new Square();
        window.changeSize(15);
        window.changeColor("black");
        window.moveVertical(110);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(25,70);
        roof.moveHorizontal(25);
        roof.moveVertical(110);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(60);
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
    /**
     * This starts a sunset
     */
    public void Sunset()
    {
        if(wall != null)   // only if it's painted already...
        {
        sun.slowMoveVertical(30);
        sun.makeInvisible();
        grass.changeColor("black");
        roof.changeColor("black");
        }
    }
}
