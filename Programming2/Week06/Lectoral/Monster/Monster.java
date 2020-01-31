
/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster implements Comparable<Monster> 
{ 
    private int hitPoints, strength, age; 
    private String name; 

    public Monster( int hp, int str, int age, String nm ) 
    { 
        hitPoints = hp; 
       strength = str; 
        this.age = age; 
        name = nm; 
    }
    
    public int getHitPoints()
    { 
        return hitPoints; 
    } 
    
    public int getStrength()
    { 
       return strength;
    }
    
    public int getAge()
    { 
       return age; 
    }
    
    public String getName() 
    { 
        return name; 
    } 
    
    public String toString() 
    { 
        return "HP: " + getHitPoints() + " \tStr: " +
        getStrength() + "\t" + getName(); 
    }
    
    public int compareTo(Monster other)
    {
        int hitDifference = getHitPoints() - other.getHitPoints();
        
        if (hitDifference !=0)
        {
            return hitDifference;
        }
        else
        {
            return getStrength()-other.getStrength();
        }   
    }
}
