import java.util.ArrayList;

/**
 * Write a description of class EmployeeDatabase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmployeeDatabase
{

    private ArrayList<Employee> employees;;

    /**
     * Constructor for objects of class EmployeeDatabase
     */
    public EmployeeDatabase()
    {
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee)
    {
        employees.remove(employee);
    }

    public String toString()
    {
        String theEmployees = "The employees \n";
        for( Employee employee : employees)
        {
            theEmployees = theEmployees + employee +"\n\n";
        }
        return theEmployees;
    }
    
    public void print()
    {
        System.out.println(toString());
    }

}
