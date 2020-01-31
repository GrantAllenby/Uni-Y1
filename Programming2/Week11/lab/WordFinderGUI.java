import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * Write a description of class WordFinderGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordFinderGUI extends JFrame implements ActionListener
{
    private JLabel findLabel;
    private JLabel resultMessage;
    private JTextField wordField;
    private JButton clear;
    private JTextArea wordArea;

    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel messagePanel;

    JScrollPane scroller;

    WordList words ;

    /**
     * Constructor for objects of class WordFinderGUI
     */
    public WordFinderGUI(String fileName)
    {
        super("Word Finder");
        words = new WordList(fileName);
        makeFrame();
        showFrame();
    }

    private void makeFrame()
    {
        setLayout(new BorderLayout());        
        makePanels();
        addPanels();
        addActionListeners();
    }

    private void makePanels()
    {
        makeTopPanel();
        makeBottomPanel();        
    }

    private void makeTopPanel()
    {
        // ADD CODE
        topPanel = new JPanel();
        findLabel = new JLabel("Find:");
        wordField = new JTextField(20);
        wordField.setActionCommand("MATCH"); 
        clear = new JButton("clear");
        topPanel.setLayout(new FlowLayout() );
        topPanel.add(findLabel);
        topPanel.add(wordField);
        topPanel.add(clear);
    }

    private void makeBottomPanel()
    {        
       // The Bottom Panel needs two regions
        // One to hold the label indicating the number of word
        // The other to hold a JTextArea
        // ADD CODE  
        bottomPanel = new JPanel();        
        bottomPanel.setLayout ( new BorderLayout() );
        makeMessagePanel();
        makeWordsArea();
        addToBottomPanel();      

    }

    private void makeMessagePanel()
    {
        // ADD CODE
        resultMessage = new JLabel("");  
        messagePanel = new JPanel();
        messagePanel.setLayout( new FlowLayout() );
        messagePanel.add(resultMessage);

    }

    private void makeWordsArea()
    {
        // ADD CODE
        wordArea = new JTextArea(7,20); 
        wordArea.setLineWrap(true);
        wordArea.setEditable( false ); 
        scroller= new JScrollPane(wordArea);
    }

    private void addToBottomPanel()
    {
        bottomPanel.add(messagePanel, BorderLayout.NORTH);
        bottomPanel.add(scroller, BorderLayout.CENTER);
    }


    private void addPanels()
    {
        add(topPanel,BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);
    }

    private void addActionListeners()
    {
        // ADD CODE
        wordField.addActionListener( this );
        clear.addActionListener( this);

    }

    private void showFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        setLocationRelativeTo( null); 
        setSize(380, 200);
        setResizable(false);
        displayAllWords();
        setVisible(true);
    }

    private void displayAllWords()
    {
        
        ArrayList<String> allWords = words.getAllWords();
        resultMessage.setText("Number of Words is " + allWords.size() );
        /*
        for ( String word : allWords )
            wordArea.append( word + "\n");
        */
       //Task 4       
       wordArea.setText(buildString( allWords));


    }

    private void displayMatches(String charSequence)
    {
        ArrayList<String> matches = words.find(charSequence);
        resultMessage.setText("Number of matches for " + charSequence + " is " + matches.size() );
        /*
        for ( String word : matches )
            wordArea.append( word + "\n");        
        */
       wordArea.setText(buildString( matches));
    }
    
    ////////////////////////////////////////////////////////
    
    private String buildString( ArrayList<String> list)
    {
        // Version 1
        /*
        String temp = "";
        for ( String word : list ) temp += word + "\n";
        return temp;
        */
       
       // Version 2
         StringBuilder temp = new StringBuilder(); 
         for ( String word : list )
            temp.append( word + "\n");
        return temp.toString();
    }
    
    /////////////////////////////////////////////////////////

    public void actionPerformed( ActionEvent evt )
    {
        String source = evt.getActionCommand();
        
       // if ( source is textField)
        {
           // read from text field
           // clear text field
           // display matching words            
        }
     //   else
     //   if ( source is clear button)
        {
            // clear text field
            // clear text area
            // display all the words
        }
         
        if ( source.equals("MATCH"))
        {
            String charSequence = wordField.getText();
            wordArea.setText("");
            displayMatches(charSequence);
        }
        else  if ( source.equals("clear"))
        {
            wordField.setText("");
            wordArea.setText("");
            displayAllWords();
        }


    }

}
