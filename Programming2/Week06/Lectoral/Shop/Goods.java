
/**
 * Write a description of class Goods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goods 
{ 
   private String description; 
   private double price; 
   public Goods( String des, double pr ) 
   { 
      description = des; 
      price = pr; 
   } 
   public void display() 
   { 
      System.out.println( "item: " + description + " price: " + price );
   } 
   public double getPrice()
   {
        return price;
   }
} 

