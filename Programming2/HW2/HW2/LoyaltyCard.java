
/**
 * Represents a loyalty card for a fictional university
 * bookshop.
 * 
 * Amended for inheritency and abstract.
 * 
 * @author (Grant Allenby w18013678) 
 * @version (4/3/19)
 */
public abstract class LoyaltyCard
{
    private Name name;
    private String cardNumber;
    private int points;

    /** Constructor for objects of class LoyaltyCard where they obtain 
     *  a card without purchasing any book(s) at that point.
     *  The number of points / spend should be set to 0.
     *  @param title - The Customer's title.
     *  @param firstName - The Customer's first name.
     *  @param lastName - The Customer's last name.
     *  @param cardNumber - The number for this card.
     */
    public LoyaltyCard(String title, String firstName, String lastName, String cardNumber)
    {
        name = new Name(title, firstName, lastName);
        this.cardNumber = cardNumber;
        points = 0;
    }

    /** Constructor for objects of class Customer where they purchase 
     *  a book(s) at the same time as they obtain their card.
     *  @param title - The Customer's title.
     *  @param firstName - The Customer's first name .
     *  @param lastName - The Customer's last name.
     *  @param cardNumber - The number for this card.
     *  @param points - The number of points earned. Can be 0.
     */
    public LoyaltyCard(String title, String firstName, String lastName, 
    String cardNumber, int points)
    {
        name = new Name(title, firstName, lastName);
        this.cardNumber = cardNumber;
        this.points = points;               
    }

    /** Get the Customer's card Number.
     *  @return cardNumber - The Customer's card number.
     */
    public String getCardNumber()
    {
        return cardNumber;
    }    

    /** Get the Customer's full name.
     *  @return toString() - The Customer's full name.
     */
    public String getFullName()
    {
        return toString();
    }

    /** Get the number of points earned.
     *  @return points - The number of points available.
     */
    public double getPoints()
    {
        return points;
    }

    /** Record a new title.
     *  @param title - The revised Customer's title.
     */

    public void setTitle(String title)
    {
        name.setTitle(title);  
    }

    /** Record a new firstName.
     *  @param firstName - The revised Customer's first name.
     */

    public void setFirstName(String firstName)
    {
        name.setFirstName(firstName);
    }

    /** Record a new last name.
     *  @param lastName -  The revised Customer's last name.
     */

    public void setLastName(String lastName)
    {
        name.setLastName(lastName);
    }

    /** Record a new Customer spend and add it to the current amount.
     *  @param numberOfPoints - Amount of points to add to the Customer's existing points.
     */
    public void addPoints(int numberOfPoints)
    {
        points = points + numberOfPoints;
        System.out.println("Points now: " + points);
    }

    /** Record spending the Customer's points and subtract from the Customer's current points.
     *  If points are less than 0 as a consequence of the spend, they will not be reduced and and error
     *  will display.
     *  @param numberOfPoints - Amount of points to subtract from the Customer's existing points.
     */
    public void reducePoints(int numberOfPoints)
    {
        if (points - numberOfPoints < 0)
        {
            System.out.println("Transaction refused, only " + points + " points available.");
        }
        else 
        {
            points = points - numberOfPoints;
            System.out.println("Points now: " + points);   
        }
    }

    /** Output the Customer's details.
     *  @param cardNumber - The Customer's card number.
     *  @param points - The Customer's points.
     */
    public void printHolderDetails()
    {
        System.out.println(toString()
            + "\nCard Number: " + cardNumber 
            + "\nPoints available: " + points);
    }

    /** Returns the name, card number and points of the Customer.
     *  @return name - The Customer's name.
     *  @return cardNumber - The Customer's card number.
     *  @return points - The Customer's points. 
     */
    public String toString()
    {
        return name + "\nCard Number: " + cardNumber + "\nPoints available: " + points;
    }
} // End of class LoyaltyCard.
