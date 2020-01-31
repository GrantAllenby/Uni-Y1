
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a libray system, for instance.
 * 
 * @author (Grant Allenby) 
 * @version (V1.0 19/10/18)
 */
public class Book
{
    /** parameters for the book constructor.
     * @param author Author of the book.
     * @param title Title of the book.
     * @param refNumber the reference number of the book.
     */
    private String author;
    private String title;
    private int pages;
    private String refNumber = ("");
    /**
     * Set the author and title fields when this object
     * is constructed.
     * @param bookAuthor  the name of the author of the book
     * @param bookTitle   the name of the book.
     */
    public Book (String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    /**
     * Accessor method that returns the author of the book.
     * @return author
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Accessor method that returns the title of the book.
     * @return title
     */
    public String getTitle(){
        return title;
    }

    /**
     * Accessor method that returns the pages of the book.
     * @return pages
     */
    public int getPages(){
        return pages;
    }

    /** Accessor method that returns the reference number of the book.
     * @return refNumber;
     */    
    public String getRefNumber(){
        return refNumber;
    }

    /**
     * Method that prints the author of the book.
     */
    public void printAuthor(){
        System.out.println(author);
    }

    public void printTitle(){
        System.out.println(title);
    }

    /** A more complex print method, where it dispenses the title, author and pages of the book as
     * well as the reference number of the book, which if not set asigns the reference number to
     * ZZZ.
     */
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        int stringLength = refNumber.length();
        
        if (int stringLength == 0) {
            
            
    }
    }

    public void setRefNumber(String ref){
        int stringLength = refNumber.length();
        if (stringLength < 3){
            System.out.println("Error: string length too small");
        }
        else{
            refNumber = ref;
        }
    }
}
