
/**
 * Write a description of class ResearchStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResearchStudent extends Student
{
    private int researchMark;
    private String supervisor;
    
    public ResearchStudent(String firstName, String lastName, String course, String id)
    {
        super(firstName, lastName, course, id);
    }
    
    public ResearchStudent()
    {
        
    }
    
    public int getResearchMark()
    {
        return researchMark;
    }
    
    public String getSupervisor()
    {
        return supervisor;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public void setResearchMark(int researchMark)
    {
        this.researchMark = researchMark;
    }
    
    public void setSupervisor(String supervisor)
    {
        this.supervisor = supervisor;
    }
    
    public String toString()
    {
       return super.toString(); 
    }
}
