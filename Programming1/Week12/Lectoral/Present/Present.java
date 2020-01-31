public class Present 
{
    private Label label;
    private String contents;
    private boolean wrapped;
    
    public Present(String contents)
    {
        this.contents = contents;
        wrapped = false;
    }
    
    public String readMessage()
    {
        return label.getMessage();
    }
    
    public String getDescription()
    {
        if(!wrapped)
        {
            return contents;
        }
        else
        {
            return "present still wrapped";
        }
    }
    
    public void openPresent()
    {
        wrapped = false;
    }
    
    public void wrapPresent(Label label)
    {
        this.label = label;
        wrapped = true;
    }
}