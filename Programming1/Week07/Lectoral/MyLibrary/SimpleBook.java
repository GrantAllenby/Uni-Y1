
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a libray system, for instance.
 * 
 * Simplified for Week 6 lectoral exercise 2
 * Used in Week 7 lectoral
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class SimpleBook
{
  // The fields
  private String author;
  private String title;
   
  /**
   * Set the author and title fields when this object
   * is constructed.
   * @param bookAuthor  the name of the authorof the book
   * @param bookTitle   the name of the book.
   */
  public SimpleBook(String bookAuthor, String bookTitle)
  {
      author = bookAuthor;
      title = bookTitle;      
  }
  
  @Override
  public boolean equals( Object o) 
  { 
      if ( o == null)     
      {
          return false;     
      }
      
      if ( this == o)
      {
          return true;   
      }
      
      SimpleBook other = (SimpleBook) o;    
      
    
      if (( other.getAuthor().equals( author) ) 
                          && ( other.getTitle().equals(title)))
      {
          return true;
      }
      else
      {
          return false;
      }
  } 
  
  /**
   * Returns the author of this book. 
   * 
   * @return the author's name
   */
  public String getAuthor() 
  { 
      return author;
  }

  /**
   * Returns the title of this book. 
   * 
   * @return the book's title
   */
  public String getTitle()
  {
      return title;
  }
  
  /**
   * Return details of a book
   * @return the book details
   */
  @Override
  public String toString()
  {
      return author + ": " + title;
  }
} // end SimpleBook
  
    

