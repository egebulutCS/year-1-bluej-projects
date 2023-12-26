
/**
 * Write a description of class Student here.
 *
 * @author (Ege Bulut)
 * @version (21.11.2017)
 */
public class LibraryCard
{
    private int limit;
    private int booksBorrowed;
    private String cardRef;

    public LibraryCard(int idNum, int maxNum)
    {
        limit = maxNum;
        cardRef = "cardNum" + idNum; 
        booksBorrowed = 0;
    }
    
    public void swipe()
    {
        booksBorrowed++;
    }
      
    public boolean expired()
    {
        return booksBorrowed >= limit;
    }
       
    public String getCardRef() 
    {
        return cardRef;
    }      
    
    public void describe() 
    {
        System.out.println( "Library card " + cardRef + 
               " has an allowance of " + (limit-booksBorrowed) + " books. " );
    }
}