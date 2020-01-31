
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book extends Goods implements Taxable
{
  private String author;

  public Book( String des, double pr, String auth)
  {
    super( des, pr );
    author  = auth ;
  }

  public void display()
  {
    super.display() ;
    System.out.println( "author: " + author );
  }

  public double calculateTax()
  {
    return getPrice() * taxRate  ;
  }
}

