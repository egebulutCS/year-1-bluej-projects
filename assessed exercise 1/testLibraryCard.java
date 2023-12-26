
/**
 * Write a description of class testLibraryCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testLibraryCard
{
    // instance variables - replace the example below with your own
    private LibraryCard card1;

    /**
     * Constructor for objects of class testLibraryCard
     */
    public testLibraryCard()
    {
        card1 = new LibraryCard(3,0);
        System.out.println(card1.getCardRef());
        card1.describe();
        System.out.println(card1.expired());
        card1.swipe();
        card1.swipe();
        System.out.println(card1.expired());
        card1.describe();
    }
}
