
/**
 * Write a description of class Toy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toy extends Goods implements Taxable
{
  private int minimumAge;

  public Toy( String des, double pr, int min)
  {
    super( des, pr );
    minimumAge  = min ;
  }

  public void display()
  {
    super.display() ;
    System.out.println( "minimum age: " + minimumAge );
  }

  public double calculateTax() // implementing the interface
  {
    return getPrice() * taxRate ;
  }
}


