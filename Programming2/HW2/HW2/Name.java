public class Name
{
    private String title;
    private String firstName;
    private String secondName;
    private String lastName;

    /**
     *  Constructor for objects of class Name
     *  Only a first and last name
     *  
     *  @param title        the title used
     *  @param firstName    the first name
     *  @param lastName     the last name
     */
    public Name(String title, String firstName, String lastName)
    {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     *  Constructor for objects of class Name
     *  first, second and last name
     *  
     *  @param title        the title used
     *  @param firstName    the first name
     *  @param secondName   the middle name
     *  @param lasstName    the last name
     */
    public Name(String title, String firstName, 
                  String secondName, String lastName)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    /**
     * Returns the title
     * 
     * @return the title used
     */
    /**
     * Returns the first name
     * 
     * @return     the first name 
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * Returns the second name
     * 
     * @return     the second name if it exists
     */
    public String getSecondName()
    {
      return secondName;           
    }
    
    /**
     * Returns the last name
     * 
     * @return     the last name 
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * Returns the full name name. Allows for any element being null.
     * 
     * @return     the full name 
     */
    @Override
    public String toString()
    {
        String name = title + " ";
        if ( firstName != null )
        {
           name = name + firstName;
        }
        if ( secondName != null )
        {
           name = name + " " + secondName;
        }
        if ( lastName != null )
        {
           name = name + " " + lastName;
        }
        return name;
    }
    
    /**
     * Set the title
     * 
     * @param title the new title
     */
    public void setTitle (String title)
    {
        this.title = title;
    }
    
    /**
     * Set the first name
     * 
     * @param  firstName   the first name
     */
    public void setFirstName( String firstName )
    {
       this.firstName = firstName;
    }
    
    /**
     * Set the second name
     * 
     * @param  secondName   the second name
     */
    public void setSecondName( String secondName )
    {
       this.secondName = secondName;
    }
    
    /**
     * Set the last name
     * 
     * @param  lastName   the last name
     */
    public void setLastName( String lastName )
    {
       this.lastName = lastName;
    }
    
    /* There are two versions of the method setFirstName
     * One to handle a 2-part name and the other a 3-part name
     * 
     * Methods can have the same name as long as 
     * the method signatures are different:
     *    void setFullName(String, String)
     *    void setFullName(String, String, String)
     *  
     * This is known as 'method overloading'.
     */
    
    /**
     * Set the full name where there is no second name
     * 
     * @param title         the title used
     * @param firstName     the first name
     * @param lastName      the last name
     */
    public void setFullName(String title, String firstName,
                                                 String lastName)
    {
       setTitle(title);
       setFirstName(firstName);
       setLastName(lastName);        
    }
    
    /**
     * Set the full name where there is a second name
     * 
     * NOTE: If this method is chosen & there is no second name then 
     * null would have to be entered as the value.
     * 
     * @param title         the title used
     * @param firstName     the first name
     * @param secondName    the second name
     * @param lastName      the last name
     */
    public void setFullName(String title, String firstName, 
                                 String secondName, String lastName)
    {
       setTitle(title);
       setFirstName(firstName);
       setSecondName(secondName);
       setLastName(lastName);        
    }
    
    /**
     * Compares two Names based on the toString method
     * 
     * @return true if names are equal, false otherwise
     */
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
         
        Name other = (Name) o;        
         
        if (other.toString().equals( toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
  } // end Name class
