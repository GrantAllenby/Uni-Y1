/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 1.1
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     * 
     * @param ticketCost the cost of a ticket
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the total amount in the machine.
     *
     * @return the total amount
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Set a new ticket price
     * 
     * @param ticketPrice the new ticket price
     */
    public void setPrice( int ticketPrice)
    {
        price = ticketPrice;
    }

    /**
     * Display the ticket price
     */
    public void showPrice()
    {
        System.out.println( "The price of a ticket is "
            + price + "  pence" );
    }

    /**
     * Return the price of a ticket.
     * 
     * @return the price of a ticket
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     * 
     * @return the amount already inserted for the next ticket
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     * 
     * @param amount value of the money entered
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;

        if(balance > price)
        {
            System.out.println((price - balance) + " pence change, your tickets are now printing");
            printTicket();
        }
        else if(balance < price)
        {
            System.out.println((price - balance) + " pence still to pay");
        }
        else 
        { 
            System.out.println("exact change, your ticket is now printing");
            printTicket();
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " pence.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    public void refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance - price;
        processOverpayment (amountToRefund);
    }

}
