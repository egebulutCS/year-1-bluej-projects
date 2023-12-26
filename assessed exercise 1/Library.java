import java.util.Arrays;
/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private TextBook[] bookShelf;
    private int nextBook;
    private int barrowers;

    /**
     * Constructor for objects of class Library
     */
    public Library(int shelfLimit)
    {
        // initialise instance variables
        bookShelf = new TextBook[shelfLimit];
        nextBook = 0;
        barrowers = 0;
        for(int i = 0; i < shelfLimit; i++){
            String bookName = "text book" + i;
            int chapter = 3 + i;
            bookShelf[i] = new TextBook(bookName, chapter);
        }
    }

    public LibraryCard issueCard(int limit)
    {
        LibraryCard card = new LibraryCard(limit, barrowers);
        barrowers++;
        return card;
    }

    public TextBook borrowBook(LibraryCard card)
    {
        if((card.expired() == false)&&(nextBook<bookShelf.length)){
            TextBook book = bookShelf[nextBook];
            bookShelf[nextBook] = null;
            nextBook++;
            card.swipe();
            return book;
        }
        else
        {
            return null;
        }
    }

    public void returnTextBook(TextBook book)
    {
        nextBook--;
        bookShelf[nextBook] = book;
    }

    public void describe()
    {
        int bookCount = 0;
        for(int i = 0; i < bookShelf.length; i++){
            if(bookShelf[i] != null){
                bookCount++;
            }
        }
        System.out.println("The library has " + bookCount + " books left on the shelf and has issued " + barrowers + " library cards.");
    }
    
    public String print(){
        String str = "The library has " + (bookShelf.length-nextBook) + " books on shelf, and has issued " + barrowers + " cards";
        return str;
    }
}
