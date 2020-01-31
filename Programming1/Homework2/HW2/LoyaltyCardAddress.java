
/**
 * A class dedicated to the address of the loyalty card program.
 *
 * @author (Grant Allenby)
 * @version (v1.0 22/10/18)
 */
public class LoyaltyCardAddress
{
    // instance variables used by the loyaltycardaddress constructor.
    private String postcode;
    private String street;
    private String town;
    private String fullAddress;
    /** the constructor by which the post code, street and town can be inputted by the user.
     * @param postcode - postcode of the student.
     * @param street - street of the student.
     * @param town - town of the student.
     */
    public LoyaltyCardAddress(String street, String town, String postcode)
    {
        this.street = street;
        this.town = town;
        this.postcode = postcode; 
    }

    //accessor methods

    /** method that fetches the address of the student.
     * @return postcode + street + town - returns the full address.
     */
    public String getFullAddress() {
        return (street + "\n" + town + "\n" + postcode);

    }

    /** method that fetches just the post code of the student.
     * @return postcode - returns the postcode.
     */
    public String getPostcode() {
        return postcode;
    }

    /** method that fetches just the street of the student.
     * @return street - returns the street.
     */
    public String getStreet() {
        return street;
    }

    /** method that fetches just the town of the student.
     * @return town - returns the town.
     */
    public String getTown(){
        return town;
    }

    //mutator methods

    /** method that changes the full address of the student.
     * @param postcode - postcode of the student.
     * @param street - street of the student.
     * @param town - town of the student
     */
    public void setFullAddress(String postcode, String street, String town) {
        this.postcode = postcode;
        this.street = street;
        this.town = town;
    }

    /** method that changes the postcode of the student.
     * @param postcode - postcode of the student.
     */
    public void setPostCode(String postcode){
        this.postcode = postcode;
    }
    
    /** method that changes the street of the student.
     * @param street - street of the student.
     */
    public void setStreet(String street){
        this.street = street;
    }
    
    /** method that changes the town of the student.
     * @param town - town of the student.
     */
    public void setTown(String town){
        this.town = town;
    }
    
    //print method
    
    /** method that prints out the address of the student.
     * 
     */
    public void printAddress(){
        System.out.println(street + "\n" + town + "\n" + postcode);
    }
}
