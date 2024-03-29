/**
 * A generic loyalty card scheme for a university bookshop with the ability to track points, as well as card owner details.
 *
 * @author (Grant Allenby)
 * @version (v1.0 11/10/18)
 */
public class LoyaltyCard
{
    //students card number.
    private String cardNumber;
    //students title (mr, dr, mrs, miss, sir, rev).
    private String title;
    //students forename (first name).
    private String firstName;
    //students surname (last name).
    private String lastName;
    //students points earned on the loyalty card.
    private int points;

    /** Constructor consisting of the students card number, title, first name and last name.
     *  @param cardNumber students card number.
     *  @param title students title.
     *  @param firstName students first name.
     *  @param lastName students last name.
     */
    public LoyaltyCard(String theCardNumber, String theTitle, String theFirstName, String theLastName)
    {
        cardNumber =theCardNumber;
        title = theTitle;
        firstName = theFirstName;
        lastName = theLastName;
        points = 0;
    }

    /** Constructor consisting of the students card number, title, first name and last name.
     *  @param cardNumber customers card number.
     *  @param title customers title.
     *  @param firstName customers first name.
     *  @param lastName customers last name.
     */
    public LoyaltyCard(String theCardNumber, String theTitle, String theFirstName, String theLastName, int thePoints)
    {
        cardNumber =theCardNumber;
        title = theTitle;
        firstName = theFirstName;
        lastName = theLastName;
        points = thePoints;
    }

    /** accessor method that fetches the card number of the student.
     *  @return the card number of the students.
     */
    public String getcardNumber()
    {
        return cardNumber;
    }

    /** accessor method that fetches the title of the student.
     *  @return the title of the customer.
     */
    public String getTitle()
    {
        return title;
    }

    /** accessor method that fetches the first name of the student.
     *  @return the first name of the customer.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**accessor method that fetches the last name of the student.
     * @return the last name of the student.
     */
    public String getLastName()
    {
        return lastName;
    }

    /** accessor method that fetches the points the student has on his card 
     *  @return the points of the student.  
     */
    public int getPoints()
    {
        return points;
    }

    /** mutator method that allows for revising the title of the student.
     *  @param newTitle revised title of the student.
     */
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    /** mutator method that allows for revising the first name of the student.
     *  @param newFirstName revised first name of the student.
     */
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    /** mutator method that allows for revising the last name of the student.
     *  @param newLastName revised last name of the student.
     */
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }

    /** mutator method that allows for revising the points on the students balance. 
     *  @param revisedPoints revised points of the student. 
     */
    public void setRevisedPoints(int revisedPoints)
    {
        points = revisedPoints;
    }

    /** method that prints the students details 
     *  
     */
    public void printCustomerDetails()
    {
        System.out.println(title + " " + firstName + " " + lastName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Points available: " + points);
    }
}