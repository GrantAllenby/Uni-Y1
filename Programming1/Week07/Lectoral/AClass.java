
public class AClass 
{
    private static int numOfObjects = 0;
    
    public AClass()
    {
        numOfObjects++;
    }
    
    public static int getNumOfObjects()
    {
        return numOfObjects;
    }
    
    public int getNumOfObjects2()
    {
        //return numOfObjects;
        return getNumOfObjects();
    }
}
