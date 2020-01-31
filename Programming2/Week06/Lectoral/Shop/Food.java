
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Goods
{
  private double calories;

  public Food( String des, double pr, double cal)
  {
    super(des, pr);
    calories = cal;
  }

  public void display()
  {
    super.display();
    System.out.println( "calories: " + calories );
  }
}



