
/**
 * A simple Student ID system that lets you see ID, name, and credits available.
 *
 * @author (Grant Lawrence Allenby)
 * @version (v1.0 14/10/18)
 */
public class Student
{
    // instance variables, which define what each variable is in the student ID system. string id defines the Id of the student.
    private String id;
    // string name defines the name of the student.
    private String name;
    // int credits defines the credits the student has.
    private int credits;
    
        /** this lets you input a student name, student ID into the system. 
         * @param credits should be 0 */    
        public Student (String fullName, String studentID)
        {
            //students full name.
            name = fullName;
            // student id.
            id = studentID;
            // amount of credits the student has so far.
            credits = 0;
        }
        
        /** accessor method that lets you fetch student name */
        public String getName() 
        {
            return name;
        }
        
        /** accessor method that lets you fetch student ID */
        public String getID() 
        {
            return id;
        }
        
        /** accessor method that lets you fetch student credits */
        public int getCredits() 
        {
            return credits;
        }
        
        /** method that lets you add credits to the student */
        public void addCredits(int additionalPoints)
        {
             credits = additionalPoints;
        }
        /** this mutator lets you change the student name if it is incorrect. */
        public void changeName(String replacementName)
        {
            name = replacementName;
        }
        
        /** method that prints student name and id number to terminal window */
        public void printStudent()
        {
            System.out.println(name + " (" + id + ") " + "Credits: " + credits);
        }
        
        /** method that returns login name of the student. name is combination of first four characters of students name
         * and first three characters of of the students ID number.*/
        public String getLoginName()
        {
        return name.substring(0, 4) + id.substring(0,3);
        }
}
