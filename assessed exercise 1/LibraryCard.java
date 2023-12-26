
/**
 * Write a description of class LibraryCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LibraryCard
{
    // instance variables - replace the example below with your own
    private int bookLimit;
    private int booksBarrowed;
    private String id;

    /**
     * Constructor for objects of class LibraryCard
     */
    public LibraryCard(int limit, int num)
    {
        // initialise instance variables
        bookLimit = limit;
        id = "cardID " + num;
        booksBarrowed = 0;
    }

    public void swipe()
    {
        booksBarrowed++;
    }

    public boolean expired()
    {
        return (booksBarrowed >= bookLimit);
    }

    public String getCardRef()
    {
        return id;
    }

    public void describe()
    {
        int booksLeft = bookLimit - booksBarrowed;
        System.out.println("Library card " + id + " with " + booksLeft + " books left.");
    }
    
    public String print(){
        String str = "Library card " + id + " has an allowance of " + (bookLimit-booksBarrowed) + " book. ";
        return str;
    }
}
