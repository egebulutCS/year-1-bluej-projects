
/**
 * Write a description of class testTextBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testTextBook
{
    // instance variables - replace the example below with your own
    private TextBook book1;

    /**
     * Constructor for objects of class testTextBook
     */
    public testTextBook()
    {
        book1 = new TextBook("book 1", 2);
        System.out.println(book1.getTitle());
        System.out.println(book1.isFinished());
        book1.readNextChapter();
        book1.readNextChapter();
        book1.readNextChapter();
        System.out.println(book1.isFinished());
        book1.describe();
        book1.closeBook();
        book1.describe();
    }
}
