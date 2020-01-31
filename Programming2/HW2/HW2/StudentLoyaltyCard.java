
/** Represents a Student loyalty card for a fictional university
 *  bookshop.
 *  @author (Grant Allenby w18013678)
 *  @version (4/3/19)
 */
public class StudentLoyaltyCard extends LoyaltyCard
{
    private String studentID;
    private Address termAddress;
    /** Constructor for a student loyalty card. This constructor assigns 0 points.
     *  @param title - The Student's title.
     *  @param firstName - The Student's first name.
     *  @param lastName - The Student's last name.
     *  @param cardNumber - The Student's card number.
     *  @param street - The Student's street.
     *  @param town - The Student's town.
     *  @param postcode - The Student's postcode.
     *  @param studentID - The Student's ID.
     */
    public StudentLoyaltyCard(String title, String firstName, String lastName, String cardNumber, 
    String street, String town, String postcode, String studentID)
    {
        super(title, firstName, lastName, cardNumber);
        termAddress = new Address(street, town, postcode);
        this.studentID = studentID;

    }

    /** Constructor for a student loyalty card. This constructor includes points. The points may be 0.
     *  @param title - The Student's title.
     *  @param firstName - The Student's first name.
     *  @param lastName - The Student's last name.
     *  @param cardNumber - The Student's card number.
     *  @param street - The Student's street.
     *  @param town - The Student's town.
     *  @param postcode - The Student's postcode.
     *  @param studentID - The Student's ID.
     *  @param points - The Student's points.
     */
    public StudentLoyaltyCard(String title, String firstName, String lastName, String cardNumber, 
    String street, String town, String postcode, String studentID, int points)
    {
        super(title, firstName, lastName, cardNumber, points);
        termAddress = new Address(street, town, postcode);
        this.studentID = studentID;
    }

    /** Amends the Student's term address.
     *  @param street - The Student's street.
     *  @param town - The Student's town.
     *  @param postcode - The Student's postcode.
     */
    public void amendTermAddress(String street, String town, String postcode)
    {
        termAddress = new Address(street, town, postcode); 
    }

    /** Returns the Student's ID.
     *  @return studentID -  The Student's ID.
     */
    public String getID()
    { 
        return studentID;
    }

    /** Returns the Student's term address.
     *  @return termAddress.toString() - The Student's term address.
     */
    public String getTermAddress()
    {
        return termAddress.toString();
    }

    /** Prints the Student's name, card number, student id, and term address.
     */
    public void print()
    {
        System.out.println(toString());  
    }

    /** Returns the Student's name, card number, student ID and term address.
     *  @return super.toString() - The Student's name and card number.
     *  @return studentID - The Student's ID.
     *  @return termAddress - The Student's term address.
     */
    public String toString()
    {
        return super.toString() + "\nStudent ID: " + studentID + "\n" + termAddress;
    }
} // End of class StudentLoyaltyCard
