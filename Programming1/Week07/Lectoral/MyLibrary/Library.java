import java.util.ArrayList;
/**
 * Write a description of class Library here.
 * 
 * @author (Grant Allenby) 
 * @version (v1.0 12/11/18)
 */
public class Library
{
    private ArrayList books;
    
    public Library()
    {
        books = new ArrayList<SimpleBook>();
    }
    
    public void addBook(SimpleBook book)
    {
        books.add(book);
    }
    
    public int getNumberOfBooks()
    {
        return books.size();
    }
    
    public int search (SimpleBook bookToFind)
    {
        int index =0;
        while(index < books.size())
        {
            if(books.get(index).equals(bookToFind))

            return index;
            index++;
        }
        return -1;
    }
    
    public int search2 (SimpleBook bookToFind)
    {
        return books.indexOf(bookToFind);
    }
    
    public int findLastIndexOf(SimpleBook book)
    {
       return books.lastIndexOf(books); 
    }
    
    public void printFirstIndexOf(SimpleBook book)
    {
        System.out.println(books.indexOf(book));
        
        //or alternatively: System.out.println(search2(book));
    }
    
    public int search3 (SimpleBook bookToFind)
    {
        int index = 0;
        for (SimpleBook book: books)
        {
            if (book.equals(bookToFind))
            return x;
        }
        x++;
    }
}
