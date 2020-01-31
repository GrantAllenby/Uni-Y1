import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * The GUI For HW4.
 *
 * @author (Grant Allenby)
 * @version (01/05/19)
 */
public class HW4GUI extends JFrame implements ActionListener
{
    private JPanel buttonPanel,textPanel;
    private JButton jbtAdd,jbtNumber,jbtQuit;
    private JLabel jlbCardNumber,jlbFName,jlbLName;
    private JTextField jtfCardNumber,jtfFName,jtfLName;
    private HW4LoyaltyCardList cards;
    private int nextCardNumber;
    private static int LoyaltyCardNumber = 0;

    /** Constructor for creating the GUI.
     */
    public HW4GUI()
    {
        super("HW4GUI");
        cards=new HW4LoyaltyCardList();
        makeFrame();
        showFrame();
    }

    /** Method for making the frame of the GUI.
     */
    private void makeFrame()
    {
        setLayout(new BorderLayout());
        createButtonPanel();
        add(buttonPanel,BorderLayout.SOUTH);
        createTextPanel();
        add(textPanel,BorderLayout.NORTH);
    }

    /** Method for displaying the frame of the GUI.
     */
    private void showFrame()
    {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(500,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /** Method that creates the buttons for the GUI.
     */
    private void createButtons()
    {
        jbtAdd = new JButton("Add Loyalty Card");
        jbtNumber = new JButton("Number of Cards");
        jbtQuit = new JButton("Quit");
    }

    /** Method that adds action listeners to the buttons of the GUI.
     */
    private void addActionListeners()
    {
        jbtAdd.addActionListener(this);
        jbtNumber.addActionListener(this);
        jbtQuit.addActionListener(this);
    }

    /** Method that creates the panels for the buttons within the GUI.
     */
    private void createButtonPanel()
    {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout());
        buttonPanel.setBorder(BorderFactory.createEtchedBorder());
        createButtons();
        buttonPanel.add(jbtAdd);
        buttonPanel.add(jbtNumber);
        buttonPanel.add(jbtQuit);
        addActionListeners();
    }

    /** Method that clears the text fields for the GUI.
     */
    private void clearTextFields()
    {
        jtfFName.setText("");
        jtfLName.setText("");
        jtfCardNumber.setText("");
    }

    /** Method for when an input is performed, such as add loyalty card, confirm, number of loyalty
     *  cards and clear number.
     */
    public void actionPerformed(ActionEvent e) 
    {
        String input = e.getActionCommand();
        if(input.equals("Add Loyalty Card"))
        {
            if(jtfFName.getText().equals("") && jtfLName.getText().equals(""))
            {
                jtfCardNumber.setText("No names");
            }
            else if(jtfFName.getText().equals("") && !(jtfFName.getText().equals("")))
            {
                jtfCardNumber.setText("No first name");
            }
            else if(!(jtfFName.getText().equals("")) && jtfFName.getText().equals(""))
            {
                jtfCardNumber.setText("No last name");
            }
            else
            {
                jlbCardNumber.setVisible(true );
                jtfCardNumber.setText(""+ ++LoyaltyCardNumber);
                jbtAdd.setText("Confirm");
                jbtNumber.setEnabled(false);
            }
        }
        else if(input.equals("Confirm"))
        {
            cards.addLoyaltyCard(new HW4LoyaltyCard (jtfFName.getText(),jtfLName.getText(),jtfCardNumber.getText()));
            clearTextFields();
            jbtAdd.setText("Add Loyalty Card");
            jlbCardNumber.setVisible(false);
            jbtNumber.setEnabled(true);
        }
        else if(input.equals("Number of Cards"))
        {
            jbtAdd.setEnabled(false);
            jbtNumber.setText("Clear Number");
            jlbCardNumber.setVisible(true);
            jtfCardNumber.setText(""+ LoyaltyCardNumber);
        }
        else if(input.equals("Clear Number"))
        {
            jbtNumber.setText("Number of Cards");
            jlbCardNumber.setVisible(false);
            clearTextFields();
            jbtAdd.setEnabled(true);
        }
        else
        {
            System.exit(0);
        } 
    }

    /** Method that creates the text panel for the GUI, as well as adjusting the alignments. 
     */
    private void createTextPanel()
    {
        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(3,3,20,20));
        jlbCardNumber = new JLabel("Loyalty Card Number:");
        jlbCardNumber.setHorizontalAlignment(JLabel.RIGHT);
        jlbFName = new JLabel("First Name:");
        jlbFName.setHorizontalAlignment(JLabel.RIGHT);
        jlbLName = new JLabel("Last Name:");
        jlbLName.setHorizontalAlignment(JLabel.RIGHT);
        jtfCardNumber = new JTextField();
        jtfFName = new JTextField();
        jtfLName = new JTextField();
        jtfCardNumber.setEditable(false);
        jlbCardNumber.setVisible(false);
        textPanel.add(jlbFName);
        textPanel.add(jtfFName);
        textPanel.add(jlbLName);
        textPanel.add(jtfLName);
        textPanel.add(jlbCardNumber);
        textPanel.add(jtfCardNumber);
    }
}