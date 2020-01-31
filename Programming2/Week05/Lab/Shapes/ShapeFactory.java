
/**
 * Creates shapes at random inorder to demonstrate polymorphism in action.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class ShapeFactory
{
    /**
     * Constructor for objects of class ShapeFactory
     */
    public ShapeFactory()
    {
    }

    /**
     * The factory method
     * 
     * @return a new TwoDShape 
     */
    public TwoDShape getShape()
    {
        int shapeType = (int)(4 * Math.random()+1);
        double width = (10 * Math.random() );
        double length = (10 * Math.random() );
        if ( shapeType == 1 )
        {
            String type;
            int triangleType = (int)(3 * Math.random() + 1);
            if (triangleType == 1)
            {
               type = "Scalene";
            }
            else if (triangleType == 2)
            {
               type = "Isoceles";
            }
            else
            {
               type = "Equliateral";
            }
            return new Triangle(type, width, length);
        }
        else if ( shapeType == 2 )
        {
            return new Rectangle( width, length);
        }
        else if ( shapeType == 3 )
        {
            double width2 = (10* Math.random() );
            return new Trapezium(width2, width, length);
        }
        else
        {
           return new Circle(width);
        }
    }
    
    
        
}
