
/** Represents a Staff loyalty card for a fictional university
 *  bookshop.
 *  @author (Grant Allenby w18013678)
 *  @version (4/3/19)
 */
public class StaffLoyaltyCard extends LoyaltyCard
{
    private String location;
    private String staffNumber;
    /** Constructor for a staff loyalty card. this constructor assigns 0 points.
     *  @param title - The Staff Member's title.
     *  @param firstName - The Staff Member's first name.
     *  @param lastName - The Staff Member's last name.
     *  @param cardNumber - The Staff Member's card number.
     *  @param location - The Staff Member's location.
     *  @param staffNumber - The Staff Member's staff number.
     */
    public StaffLoyaltyCard(String title, String firstName, String lastName, String cardNumber,
    String staffNumber, String location)
    {
        super(title, firstName, lastName, cardNumber);
        this.staffNumber = staffNumber;
        this.location = location;
    }

    /** Constructor for a staff loyalty card. this constructor assigns 0 points.
     *  @param title - The Staff Member's title.
     *  @param firstName - The Staff Member's first name.
     *  @param lastName - The Staff Member's last name.
     *  @param cardNumber - The Staff Member's card number.
     *  @param location - The Staff Member's location.
     *  @param staffNumber - The Staff Member's staff number.
     *  @param points - The number of points on the Staff Member's card. This can be 0.
     */
    public StaffLoyaltyCard(String title, String firstName, String lastName, String cardNumber,
    String staffNumber, String location, int points)
    {
        super(title, firstName, lastName, cardNumber, points);
        this.staffNumber = staffNumber;
        this.location = location;
    }

    /** Method for returning the location of the Staff Member.
     *  @return location - the location of the Staff Member.
     */
    public String getLocation()
    {
        return location;
    }

    /** Method for returning the Staff Member's staff number.
     *  @return staffNumber - the staff number of the Staff Member.
     */
    public String getStaffNumber()
    {
        return staffNumber;
    }

    /** Prints the Staff Member's name, card number and location.
     */
    public void print()
    {
        System.out.println(toString());
    }

    /** Allows the change of location of the Staff Member.
     *  @param location - The location of the Staff Member.
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

    /** Returns the Staff Member's name, card number and location.
     *  @return super.toString() - The Staff Member's name and card number.
     *  @return staffNumber - The Staff Member's staff number.
     *  @return location - The Staff Member's location.
     */
    public String toString()
    {
        return super.toString() + "\nStaff Number: " + staffNumber + "\nLocation: " + location;
    }
} // End of class StaffLoyaltyCard.
