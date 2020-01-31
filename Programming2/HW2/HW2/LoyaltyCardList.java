import java.util.*;
/** A list comprising of all loyalty cards for LoyaltyCard, StaffLoyaltyCard and StudentLoyaltyCard.
 *  @author (Grant Allenby w18013678) 
 *  @version (4/3/19)
 */
public class LoyaltyCardList
{
    private ArrayList<LoyaltyCard> loyaltyCards;    

    /** Constructor for objects of class LoyaltyCardList
     */
    public LoyaltyCardList()
    {
        loyaltyCards = new ArrayList<LoyaltyCard>();
    }

    /** Method that allows for adding of a loyalty card to the loyalty card array list.
     */
    public void addLoyaltyCard(LoyaltyCard loyaltyCard)
    {
        loyaltyCards.add(loyaltyCard);
    }

    /** Returns the number of loyalty cards.
     *  @return - The number of loyalty cards.
     */
    public int getNumberOfLoyaltyCards()
    {
        return loyaltyCards.size();
    }

    /** Prints all loyalty cards.
     */
    public void getAllLoyaltyCards()
    {
        for(LoyaltyCard loyaltyCard : loyaltyCards)
        {
            loyaltyCard.printHolderDetails();
            System.out.println();
        }
    }

    /** Method that finds a loyalty card by its specific card number. returns true if found.
     *  @param cardNumber - the card number to be found.
     *  @return true - Card is found matching the card number.
     *  @return false - Card is not found matching the card number.
     */
    public boolean getLoyaltyCard(String cardNumber)
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {
                loyaltyCards.get(index);
                return true;
            }
        }
        return false;
    }

    /** Method that removes a loyalty card from the array. Prints if entry is negative or non-existant.
     *  @param loyaltyCardEntry - The number of the loyalty card in the array.
     */
    public void removeLoyaltyCard(int loyaltyCardEntry)
    {
        if(loyaltyCardEntry < 0)
        {
            System.out.println("Negative entry :" + loyaltyCardEntry);
        }
        else if(loyaltyCardEntry < getNumberOfLoyaltyCards())
        {
            loyaltyCards.remove(loyaltyCardEntry);
        }
        else
        {
            System.out.println("No such entry :" + loyaltyCardEntry);
        }
    }

    /** Method that removes a loyalty card from the array. Returns true if successful.
     *  @param cardNumber - The card number to be entered for removal.
     *  @return true - Card matching the card number is removed from the array successfully.
     *  @return false - Card has failed to be found matching the card number.
     */
    public boolean removeLoyaltyCard(String cardNumber)
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {
                loyaltyCards.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

    /** Searches for a loyalty card based on the card Number.
     *  @param cardNumber - The card number to be found.
     *  @return index - The entry for the card number entered.
     *  @return -1 - Search has failed.
     */
    public int search(String cardNumber)
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard : loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {
                return index;
            }
            else
            {
                index++;
            }
        }
        return -1;
    }

    /** Method for returning the number of Student loyalty cards.
     *  @return index - The number of Student loyalty cards.
     */
    public int getNumberOfStudentLoyaltyCards()
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (loyaltyCard instanceof StudentLoyaltyCard) 
            {
                index++;
            }
        }
        return index;
    }

    /** Method for returning the number of Staff loyalty cards.
     *  @return index - The number of Staff loyalty cards.
     */
    public int getNumberOfStaffLoyaltyCards()
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (loyaltyCard instanceof StaffLoyaltyCard)
            {
                index++;
            }
        }
        return index;
    }
} // End of class LoyaltyCardList.
