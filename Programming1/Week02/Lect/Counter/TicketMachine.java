
/**
 * A Machine for tracking tickets.
 * 
 * @author (Grant Lawrence Allenby) 
 * @version (v1.0 08/10/2018)
 */

public class TicketMachine
{
    // set integers for price, balance and total
    private int price;
    private int balance;
    private int total;
    
    public TicketMachine(int ticketCost) //ticketCost only exists during this section of code
    /** Lets you set the ticket cost and set it to price
      * so long as it is greater than 0.
      * @param ticketCost the cost of a ticket */
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }
}
