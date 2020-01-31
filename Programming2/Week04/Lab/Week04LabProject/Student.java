
/**
 * Write a description of class Student here.
 * 
 * @author (Grant Allenby) 
 * @version (21/02/19)
 */
public class Student extends Person
{
    private String course; // the course the student is on
    private String id; // the student's id
    private int year1Mark; // the mark they achieved during year 1
    private int year2Mark; // the mark they achieved during year 2
    private int year3Mark; // the mark they achieved during year 3
    
    /** Constructor method that allows the user to input the students first name, last name, course and id. 
     *  @param firstName, lastName, course, id
     */
    public Student(String firstName, String lastName, String course, String id)
    {
        super(firstName, lastName);
        this.course = course;
        this.id = id;
    }
    
    /** blank constructor for student.
     * 
     */
    public Student()
    {
        
    }
    
    /** returns the course of the student.
     *  @return course
     */
    public String getCourse()
    {
        return course;
    }
    
    /** returns the id of the student.
     *  @return id
     */
    public String getID()
    {
        return id;
    }
    
    /** returns the average marks of the student from each year.
     *  @return average of marks
     */
    public int getResultMark()
    {
        return (year1Mark + year2Mark + year3Mark) / 3;
    }
    
    /** returns total marks for the 3 years for the student.
     *  @return total marks
     */
    public int getTotalMark()
    {
        return year1Mark + year2Mark + year3Mark;
    }
    
    /** returns the year 1 mark.
     *  @return year1Mark
     */
    public int getYear1Mark()
    {
        return year1Mark;
    }
    
    /** returns the year 2 mark.
     *  @return year2Mark
     */
    public int getYear2Mark()
    {
        return year2Mark;
    }
    
    /** returns the year 3 mark.
     *  @return year3Mark
     */
    public int getYear3Mark()
    {
        return year3Mark;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public void setYear1Mark(int year1Mark)
    {
        this.year1Mark = year1Mark;
    }
    
        public void setYear2Mark(int year2Mark)
    {
        this.year2Mark = year2Mark;
    }
    
        public void setYear3Mark(int year3Mark)
    {
        this.year3Mark = year3Mark;
    }
    
    public String toString()
    {
        return (super.toString() + "\nid: " + id + "\ncourse: " + course);  
    }
}
