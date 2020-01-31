
/**
 * .
 * 
 * @author (Grant Allenby) 
 * @version (v1.0)
 */
public class AdmissionControl
{
    private BoundedCounter noInBuilding;
    
    public AdmissionControl(int maxOccupancy) {
        noInBuilding = new BoundedCounter(maxOccupancy);
    }

    public void enterBuilding(){
        boolean success = noInBuilding.incrementCount();
        if (success)
        {
            System.out.println("Number in buidling is " + noInBuilding.getCount());
        }
        else
        {
            System.out.println("no entry building full");
        }
    }
    
    public void leaveBuilding(){
        boolean success = noInBuilding.decrementCount();
        if (success)
        {
            System.out.println("Number in building is " + noInBuilding.getCount());
        }
        else
        {
            System.out.println("building is empty");
        }
    }
    
    public int getMaxOccupancy(){
        return noInBuilding.getMaxAllowed();
    }
    
    public int getNumberInbuilding(){
        return noInBuilding.getCount();
    }
}
