
/**
 * Write a description of class UndergraduateStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UndergraduateStudent extends Student
{
    public UndergraduateStudent(String firstName, String lastName, String course, String id)
    {
        super(firstName, lastName, course, id);
    }
    
    public UndergraduateStudent()
    {
        
    }
    
    public int getResultMark()
    {
        int year23Average = (super.getYear2Mark() + super.getYear3Mark()) / 2;
        if ( year23Average > super.getResultMark())
        {
            return year23Average;
        }
        return super.getResultMark();
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public String toString()
    {
        return super.toString();
    }
}
