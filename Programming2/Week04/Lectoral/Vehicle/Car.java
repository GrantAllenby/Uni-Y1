public class Car extends Vehicle
{
    private int year;
    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        System.out.println("I'm a Car");
    }
    
     public Car(String name)
    {
       super();
       System.out.println("I'm a Car called " + name );
    }
    
     public Car(String name,int year)
    {
       super(name);
       System.out.println("I'm a Car called " + name );
       this.year = year;
       
    }
    
    public void print1()
    {
        System.out.println("I am print1 in Car");
    }
}

