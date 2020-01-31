import java.util.ArrayList; //imports the Array List utility from 
/**
 * LoyaltyCardList which uses an array list for adding, removing, searching and fetching of the loyalty
 * cards available.
 *
 * @author (Grant Allenby)
 * @version (v1.0)
 */
public class LoyaltyCardList 
{
    private ArrayList<LoyaltyCard> loyaltyCards; //Defines the array list used in the class.
    
    /**
     * Constructor method that defines a new array list.
     */
    public LoyaltyCardList() 
    {
        loyaltyCards = new ArrayList<LoyaltyCard>();
    }

    /**
     * Allows the user to add loyalty cards to the array list.
     */
    public void addLoyaltyCard(LoyaltyCard loyaltyCard) 
    {
        loyaltyCards.add(loyaltyCard);
    }

    /**
     * Method that will return all loyalty cards to the use in a print line provided the index is equal
     * to or greater than the getNumberOfLoyaltyCards method.
     */
    public void getAllLoyaltyCards() 
    {
        int index = 0; //sets index to 0.
        while (index < getNumberOfLoyaltyCards())
        {
            loyaltyCards.get(index).printCustomerDetails();
            index++;
        }
    }

    /**
     * Prints the details of the specified loyalty card.
     */
    public void getLoyaltyCard(int loyaltyCardEntry) 
    {
        if (loyaltyCardEntry < 0 || loyaltyCardEntry > loyaltyCards.size()) 
        {
            System.out.println("The index value you have entered is not valid");
        }
        loyaltyCards.get(loyaltyCardEntry).printCustomerDetails();
    }

    /**
     * Returns the number of loyalty cards.
     * @return loyaltyCards.size()
     */
    public int getNumberOfLoyaltyCards() 
    {
        return loyaltyCards.size();
    }

    /**
     * Boolean method that allows removal of a loyalty card.
     * @return true
     * @return false
     */
    public boolean removeLoyaltyCard(String cardNumber) 

    {
       int index = 0; //sets index to 0.
       boolean found = false; //defines found as false to allow the for statement to run.
       for (LoyaltyCard loyaltyCard : loyaltyCards)
       {
           if (cardNumber.equals(loyaltyCard.getCardNumber()))
           {
               found = true;
               loyaltyCards.remove(index);
           }
           else
           {
               index++;
           }
        }
        if (found == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * mutator method that allows for removal of loyalty cards by input of the entry it is assigned.
     */
    public void removeLoyaltyCard(int loyaltyCardEntry) 
    {
        loyaltyCards.remove(loyaltyCardEntry);
    }

    /**
     * method that performs a search function utilising card number inputted.
     * @return index
     * @return -1
     */
    public int search(String cardNumber) 
    {
        int index = 0; //sets index to 0.
        boolean found = false; //defines found as false to allow while statement to run.
        while (index < loyaltyCards.size() && !found) 
        {
            String name = (loyaltyCards.get(index)).getCardNumber();
            if (name.equals(cardNumber)) 
            {
                found = true; // defines found as true if card number is equal to the name assigned.
            }
            else 
            {
                index++;
            }
        }
        if (found == true) // search moves to here if found is true.
        {
            return index; //returns index number for the card number searched
        }
        else 
        {
            return -1; //if the search fails, returns -1.
        }
    }
}