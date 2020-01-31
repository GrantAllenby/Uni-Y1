import java.util.Scanner;
/**
 * Write a description of class LoyaltyCardTUI here.
 *
 * @author (Grant Allenby)
 * @version (v1.0 6/12/18)
 */
public class LoyaltyCardTUI
{
    private LoyaltyCard loyaltyCard;
    private LoyaltyCardList loyaltyCardList;
    Scanner myScanner;

    /**
     * Constructor for the objects of class.
     */
    public LoyaltyCardTUI()
    {
        loyaltyCard = new LoyaltyCard();
        myScanner = new Scanner(System.in);
    }

    /**
     * Provides the main user interface for the program.
     */
    public void menu()
    {
        int command = -1;
        while (command != 0)
        {
            displayMenu();
            command = getCommand();
            execute(command);
        }
    }

    private void addLoyaltyCard()
    {
        System.out.println("Enter Loyalty Card Holders first name: ");
        String firstName = myScanner.nextLine();
        System.out.println("Enter Loyalty Card Holders second name: ");
        String surName = myScanner.nextLine();
        System.out.println("Enter Loyalty Card street: ");
        String street = myScanner.nextLine();
        System.out.println("Enter Loyalty Card Holders second town: ");
        String town = myScanner.nextLine();
        System.out.println("Enter Loyalty Card Holders postcode: ");
        String postcode = myScanner.nextLine();
        System.out.println("Enter Loyalty Card Holders points ");
        String points = myScanner.nextLine();
    }

    /**
     * Displays the inputs available to the user.
     */
    private void displayMenu()
    {
        String menuString = "Please select an option:...........[X]\n";
        menuString += "Get number of loyalty cards..............[1]\n";
        menuString += "Find loyalty card by name................[2]\n";
        menuString += "Add loyalty card.........................[3]\n";
        menuString += "Remove loyalty card......................[4]\n";
        menuString += "Show loyalty card........................[5]\n";
        menuString += "Show all loyalty card....................[6]\n";
        menuString += "quit.....................................[7]\n";
    }

    /**
     * Processes thee commands if allowed.
     * @param command the command entered by the user.
     */
    private void execute(int command)
    {
        // Else if chain for commands.
        if (command == 1)
        {
            getNumberOfLoyaltyCards();
        }
        else if (command == 2)
        {
            showLoyaltyCard();
        }
        else if (command == 3)
        {
            addLoyaltyCard();
        }
        else if (command == 4)
        {
            removeLoyaltyCard();
        }
        else if (command == 5)
        {
            showLoyaltyCard();
        }
        else if (command == 6)
        {
            showAllLoyaltyCards();
        }    
        else if (command == 7)
        {
            quitCommand();
        }
        
    }

    /**
     * Grabs the users command.
     * one command per line.
     * @return command the user command.
     */
    private int getCommand()
    {
        int command = myScanner.nextInt();
        myScanner.nextLine();
        return command;
    }

    public void getNumberOfLoyaltyCards()
    {
        System.out.println(LoyaltyCardList.size());
    }

    private void quitCommand()
    {
        System.out.println("Application closing");
        System.exit(0);
    }

    public void removeLoyaltyCard()
    {
        System.out.print("Enter Loyalty Card number you would like to remove: ");
        String cardNumber = myScanner.nextLine();
        if (LoyaltyCardList.removeLoyaltyCard(cardNumber))
            System.out.println("Loyalty card with card number " + cardNumber + " removed.");
        else
            System.out.println("Could not find loyalty card number: " + cardNumber);
    }

    public void showAllLoyaltyCards()
    {
        System.out.println("");
        loyaltyCardList.getAllLoyaltyCards();
    }

    public void showLoyaltyCard()
    {
        System.out.println("");
        System.out.println("Enter loyalty card number: ");
        String cardNumber = myScanner.next();
        if (loyaltyCardList.getLoyaltyCard(cardNumber))
        {
            System.out.println("the loyalty card is: " + LoyaltyCard(cardNumber));
        }
        else
        {
            System.out.println("Could not find loyalty card for number: " + cardNumber);
        }
    }

    public void unknownCommand(int command)
    {
        System.out.println("Invalid Command : "+ command);
    }
}
