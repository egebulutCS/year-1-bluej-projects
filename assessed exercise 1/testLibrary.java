
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testLibrary
{
    // instance variables - replace the example below with your own
    private Library lib;
    private LibraryCard card1;

    /**
     * Constructor for objects of class test
     */
    public testLibrary()
    {
        lib = new Library(10);
        lib.describe();
        card1 = new LibraryCard(2,0);
        System.out.println(card1.expired());
        System.out.println(card1.getCardRef());
        card1.describe();
        TextBook book1 = lib.borrowBook(card1);
        TextBook book2 = lib.borrowBook(card1);
        System.out.println(lib.borrowBook(card1));
        lib.describe();
        card1.describe();
        lib.returnTextBook(book2);
        lib.returnTextBook(book1);
        lib.describe();
    }
}
