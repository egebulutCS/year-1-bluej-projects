
/**
 * This class is a test class for Library class.
 *
 * @author (Ege Bulut)
 * @version (21.11.2017)
 */
public class TestLibrary
{
    private Library l1;
    private LibraryCard aCard;
    
    public TestLibrary()
    {
    }
    
    public void positiveTest()
    {
        l1 = new Library(10);
        aCard = l1.issueCard();
        l1.issueCard();
        l1.borrowBook(aCard);
    }
    
    public void zeroTest()
    {
        l1 = new Library(0);
        aCard = l1.issueCard();
        l1.issueCard();
        l1.borrowBook(aCard);
    }
    
    public void negativeTest()
    {
        l1 = new Library(-10);
        aCard = l1.issueCard();
        l1.issueCard();
        l1.borrowBook(aCard);
    }
}
