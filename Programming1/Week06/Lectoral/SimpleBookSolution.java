
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a libray system, for instance.
 * 
 * Simplified for Week 6 lectoral exercise 2
 * 
 * Contains the exercise solution
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleBookSolution
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
  public SimpleBookSolution (String bookAuthor, String bookTitle)
  {
      author = bookAuthor;
      title = bookTitle;      
  }
  
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
    
    SimpleBookSolution other = (SimpleBookSolution) o;        
   
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
   */
  public String getAuthor() 
  { 
      return author;
  }

  /**
   * Returns the title of this book. 
   */
  public String getTitle()
  {
      return title;
  }
}
  
    

