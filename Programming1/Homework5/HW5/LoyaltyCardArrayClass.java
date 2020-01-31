import java.util.ArrayList;
/**
 * Write a description of class LoyaltyCardArrayClass here.
 * 
 * @author (Grant Allenby) 
 * @version (v1.0 20/12/18)
 */
public class LoyaltyCardArrayClass
{
    // instance variables - replace the example below with your own
    private int x;
    private int currentIndex;
    private LoyaltyCard [] loyaltyCard;
    /**
     * Constructor for objects of class LoyaltyCardArrayClass
     */
    public LoyaltyCardArrayClass()
    {

    }

    public LoyaltyCardArrayClass (int maxNoOfLoyaltyCards)
    {
    }

    public void addLoyaltyCard(LoyaltyCard [] loyaltyCard) 
    {
        if (currentIndex <loyaltyCard.length) // checks for space on array
        {
            loyaltyCard[currentIndex] = loyaltyCard;
            currentIndex++;
            return true; //successful
        }
        else {
            return false; //failure
        }
    }

    public int getCapacity()
    {
        if (index < currentIndex)
        {
            return LoyaltyCard[index];
        }
        else
        {
            return "index too large";
        }
    }

    public int getNumberOfLoyaltyCards()
    {

    }

    public void printAllLoyaltyCards()
    {
    }

    public boolean printLoyaltyCard (String cardNumber)
    {

    }

    public boolean removeLoyaltyCard (String cardNumber)
    {
        if (index < currentIndex)
        {
            squash(index);
            return true;
        }
        else
        {
            return false;
        }
    }

    public int search (String cardNumber)
    {
        int index = 0;
        boolean found = false;
        while( index < loyaltyCard.size() && !found) 
        {
            if ( loyaltyCard[index].equals(cardNumber))
            {        
                found = true; 
            }
            else
                index++;
        }
        if (found)
        {
            return index;
        }
        else
        {
            return -1;
        }
    }

    private void squash (int index)
    {
        if (index >= 0)
        {
            for (int i = index; i < currentIndex -1; i++ )
            {
                loyaltyCard[i]= loyaltyCard[i+1];
            }
            loyaltyCard[currentIndex -1] = null;
            currentIndex--;
        }
    }
}
