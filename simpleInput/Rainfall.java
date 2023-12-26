
/**
 * Write a description of class Rainfall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rainfall
{
    // instance variables - replace the example below with your own
    private InputReader reader;

    /**
     * Constructor for objects of class Rainfall
     */
    public Rainfall()
    {
        // initialise instance variables
        reader = new InputReader();
    }

    public void getStatistics(int days)
    {
        int total = 0;
        int maximum = 0;
        int rainyDays = 0;
        int numberOfInputs = 0;
        for(int i=0; i<days; i++){
            int amount = reader.getInt("What is the rainfall amount today?");
            if ((amount>=0)&&(amount<99999)){
                total += amount;
                numberOfInputs++;
                if (amount>0){
                    rainyDays++;
                }
                if (amount>maximum){
                    maximum = amount;
                }
            }
        }
        System.out.println(total/days + " is the average amount of rainfall per day.");
        System.out.println(rainyDays + " is the total number of rainy days.");
        System.out.println(numberOfInputs + " is the total number of valid inputs.");
        System.out.println(maximum + " is the maximum amount of rainfall on any one day.");
    }
}
