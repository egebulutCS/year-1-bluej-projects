
/**
 * Write a description of class NumberJudge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberJudge
{
    // instance variables - replace the example below with your own
    private int referenceNumber;

    /**
     * Constructor for objects of class NumberJudge
     */
    public NumberJudge(int refNo)
    {
        // initialise instance variables
        referenceNumber = refNo;
    }

    
    public String judge(int number)
    {
        // put your code here
        if (number>referenceNumber){
            return "Too Big!" ;
        }
        else if (number<referenceNumber)
        {
            return "Too Small!" ;
        }
        else
        {
            return "Perfect!" ;
        }
    }
    
    public void showJudgement(int number)
    {
        System.out.println(judge(number));
    }
    
    public boolean isTooSmall(int number)
    {
        return (referenceNumber > number);
    }
    
    public boolean isTooLarge(int number)
    {
        return (referenceNumber < number);
    }
    
    public boolean isPerfect(int number)
    {
        return (referenceNumber == number);
    }
}
