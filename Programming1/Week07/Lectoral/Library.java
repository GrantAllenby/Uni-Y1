import java.util.ArrayList;

/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Library
{ 
    private ArrayList<SimpleBook> books;
    
    /**
     * Single constructor
     */
    public Library()
    {
        books = new ArrayList<SimpleBook>(); 
    }    
    
    /**
     * Ad a bookto the array list
     * 
     * @param book the book being added
     */
    public void addBook(SimpleBook book)    
    {
        books.add(book);    
    }    
    
    /**
     * @return the size of the collection
     */
    public int getNumberOfBooks()
    {
        return books.size();
    }
    
    /**
     * Search for a book using a while loop
     * 
     * @param bookToFind the book to search for
     * @return the index of the book if found or else -1 
     */
    public int search (SimpleBook bookToFind)    
    {
        int index = 0;
        boolean found = false;
        
        while(index < books.size() && !found)        
        {
            if(books.get(index).equals(bookToFind))            
            {
               found = true;
               System.out.println(books.get(index));
               System.out.println(bookToFind);
            }
            else            
            {
               index++;
            }
        }    
        
        if( found == true)      
        {
            return index;
        }
        else                    
        {
            return -1;
        }
    }
    
    /**
     * Print the index of the book to the console window
     * or -1 if not found
     * 
     * @param book the book to search for using indexOf
     */
    public void printFirstIndexOf(SimpleBook book)    
    {
       System.out.println(books.indexOf(book));
    }    
   
    /**
     * Find the first occurance of a book
     * 
     * @param book the book to search for using indexOf
     * @return the the index of the book or else -1
     */
    public int findFirstIndexOf(SimpleBook book)    
    {
        return books.indexOf(book);
    }
    
    /**
     * Find the last occurance of a book
     * 
     * @param book the book to search for using indexOf
     * @return the the index of the book or else -1
     */
    public void findLastIndexOf(SimpleBook book)    
    {
       System.out.println(books.lastIndexOf(book));
    }
    
    /**
     *@return the list of books
     */
    public String toString()
    {
        String output = "";
        for ( SimpleBook book : books ) 
        {
          output = output + book +"\n";
        }
        
        return output;
    }
    
    /**
     * search using a for-each loop
     *@param targetBook the book to search for
     *@return the position of book in list or -1 if not found
     */
     public int searchUsingForEach(SimpleBook targetBook)
     {
       int index = 0;
       for (SimpleBook book : books)
       {
           if(book.equals(targetBook))
           {
               return index;
           }
           index++;
       }
       return -1;
     }
    
    /**
     * Show the required book information
     * 
     * @param bookEntry the book to search for
     */
    public void showBook(int bookEntry)    
    {
        if(bookEntry < 0)
        {
            System.out.println("Negative entry: " + bookEntry);
        } 
        else if (bookEntry < getNumberOfBooks())        
        {
 //           System.out.println(books.get(bookEntry).getBookDetails());
              System.out.println(books.get(bookEntry));
        }
        else
        {
            System.out.println("No such entry: " + bookEntry);
        }        
    }
    
    /**
     * Show the author of the required book 
     * 
     * @param bookEntry the book to search for
     */
    public void showBookAuthor(int bookEntry)    
    {
        if(bookEntry < 0)
        {
            System.out.println("Negative entry: " + bookEntry);
        } 
        else if (bookEntry < getNumberOfBooks())        
        {
           // SimpleBook book = books.get(bookEntry);
           // System.out.println(book.getAuthor());           
           
           // Can be:
           System.out.println(books.get(bookEntry).getAuthor());
        }
        else
        {
            System.out.println("No such entry: " + bookEntry);
        }
    }
    
    /**
     * Print out the collection
     */
    public void printCollection()
    {
        System.out.println(books);
    }
    
    /**
     * Remove a book from the collection
     *     
     * @param bookEntry the book to search for
     */
    public void removeBook(int bookEntry)    
    {
        if(bookEntry < 0)
        {
            System.out.println("Negative entry: " + bookEntry);
        }
        else if (bookEntry < getNumberOfBooks())
        {
            books.remove(bookEntry);
        }
        else
        {
            System.out.println("No such entry: " + bookEntry);
        }
    }    
} // end class
         