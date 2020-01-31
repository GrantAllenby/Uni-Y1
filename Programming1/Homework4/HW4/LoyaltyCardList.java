import java.util.*;
/**
 * Write a description of class LoyaltyCardList here.
 * 
 * @author (Grant Allenby) 
 * @version (V1.0 5/12/18)
 */
public class LoyaltyCardList
{
   private ArrayList<LoyaltyCard> loyaltyCards;    
   
   /**
    * Constructor for objects of class LoyaltyCardList
    */
   public LoyaltyCardList()
   {
       loyaltyCards = new ArrayList<LoyaltyCard>();
   }
    
   /**
    * Method that allows for adding of a loyalty card to the loyalty card array list.
    */
   public void addLoyaltyCard(LoyaltyCard loyaltyCard)
   {
       loyaltyCards.add(loyaltyCard);
   }
    
   /**
    * @return the number of loyalty cards.
    */
   public int getNumberOfLoyaltyCards()
   {
       return loyaltyCards.size();
   }
    
   /**
    * 
    */
   public void getLoyaltyCard(int loyaltyCardEntry)
   {
       if (loyaltyCardEntry < 0)
       {
           System.out.println("Negative entry: " + loyaltyCardEntry);
       }
       else if (loyaltyCardEntry < getNumberOfLoyaltyCards())
       { 
           LoyaltyCard loyaltyCard = loyaltyCards.get(loyaltyCardEntry);
           loyaltyCard.printCustomerDetails();
       }
       else
       {
           System.out.println("No such entry: " + loyaltyCardEntry);
       }
   }
    
   /**
    * 
    */
   public void getAllLoyaltyCards()
   {
        for(LoyaltyCard loyaltyCard : loyaltyCards)
        {
            loyaltyCard.printCustomerDetails();
            System.out.println();
        }
   }
   
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
    
   /**
    * 
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
    
   /**
    * 
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
    
   /**
    * 
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
}
