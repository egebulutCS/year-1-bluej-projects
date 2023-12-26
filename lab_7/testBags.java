
/**
 * Write a description of class testBags here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testBags
{
    private bag1 firstBag;
    private bag2 secondBag;
    private bag3 thirdBag;
    
    /**
     * Constructor for objects of class testBags
     */
    public testBags()
    {
        firstBag = new bag1(10);
        secondBag = new bag2(10);
        thirdBag = new bag3(10);
        
        for(int i = 0; i < 3; i++){
            String str1 = "string1 " + i;
            String str2 = "string2 " + i;
            String str3 = "string3 " + i;
            firstBag.add(str1);
            secondBag.add(str2);
            thirdBag.add(str3);
        }
        
        firstBag.isFull();
        secondBag.isFull();
        thirdBag.isFull();
        
        firstBag.showStrings();
        secondBag.showStrings();
        thirdBag.showStrings();
        
        firstBag.contains("string1 1");
        secondBag.contains("string2 2");
        thirdBag.contains("string3 3");
        
        firstBag.remove("string1 1");
        secondBag.remove("string2 2");
        thirdBag.remove("string3 3");
        
        firstBag.showStrings();
        secondBag.showStrings();
        thirdBag.showStrings();
    }
}
