
/**
 * Write a description of class NumberProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberProcessor
{
    // instance variables - replace the example below with your own
    private InputReader reader;

    /**
     * Constructor for objects of class NumberProcessor
     */
    public NumberProcessor()
    {
        // initialise instance variables
        reader = new InputReader();
    }

    public void sum(int n)
    {
        int beginner = reader.getInt("Please type a positive integer to begin.");
        int total = 0;
        int counter = 0;
        while (beginner<0){
            beginner = reader.getInt("Please type a positive integer to begin.");
        }
        while (counter<n){
            beginner = reader.getInt("Pleas type a number to add.");
            total += beginner;
            counter++;
        }
        System.out.println(total);
    }
    
    public void maximum(int n)
    {
        int beginner = reader.getInt("Please type a positive integer to begin.");
        int maximum = 0;
        int counter = 0;
        while (beginner<0){
            beginner = reader.getInt("Please type a positive integer to begin.");
        }
        while (counter<n){
            beginner = reader.getInt("Please type a number.");
            if (beginner > maximum){
                maximum = beginner;
            }
            counter++;
        }
        System.out.println(maximum);
    }
    
    public void sumAndMaximum(int n)
    {
        int beginner = reader.getInt("Please type a positive integer to begin.");
        int total = 0;
        int maximum = 0;
        int counter = 0;
        while (beginner<0){
            beginner = reader.getInt("Please type a positive integer to begin.");
        }
        while (counter<n){
            beginner = reader.getInt("Please enter a number.");
            total += beginner;
            if (beginner > maximum){
                maximum = beginner;
            }
            counter++;
        }
        System.out.println(total);
        System.out.println(maximum);
    }
    
    public void sumForLoop(int n)
    {
        int beginner = reader.getInt("Please type a positive integer to begin.");
        int total = 0;
        while (beginner<0){
            beginner = reader.getInt("Please type a positive integer to begin.");
        }
        for (int i = 0; i<n; i++){
            beginner = reader.getInt("Pleas type a number to add.");
            total += beginner;
        }
        System.out.println(total);
    }
    
    public void maximumForLoop(int n)
    {
        int beginner = reader.getInt("Please type a positive integer to begin.");
        int maximum = 0;
        while (beginner<0){
            beginner = reader.getInt("Please type a positive integer to begin.");
        }
        for(int i = 0; i<n; i++){
            beginner = reader.getInt("Please type a number.");
            if (beginner > maximum){
                maximum = beginner;
            }
        }
        System.out.println(maximum);
    }
    
    public void sumAndMaximumForLoop(int n)
    {
        int beginner = reader.getInt("Please type a positive integer to begin.");
        int total = 0;
        int maximum = 0;
        while (beginner<0){
            beginner = reader.getInt("Please type a positive integer to begin.");
        }
        for(int i = 0; i<n; i++){
            beginner = reader.getInt("Please enter a number.");
            total += beginner;
            if (beginner > maximum){
                maximum = beginner;
            }
        }
        System.out.println(total);
        System.out.println(maximum);
    }
}
