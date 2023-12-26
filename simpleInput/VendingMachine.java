
/**
 * Write a description of class VendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    // instance variables - replace the example below with your own
    private InputReader reader;
    private int numberOfGums;
    private int numberOfChocolate;
    private int numberOfPopcorn;
    private int numberOfJuice;

    /**
     * Constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        // initialise instance variables
        reader = new InputReader();
        numberOfGums = 0;
        numberOfChocolate = 0;
        numberOfPopcorn = 0;
        numberOfJuice = 0;
    }

    public void run()
    {
        while (1<2){
            int choice = reader.getInt("Please choose your product by its number.");
            if (choice == 1){
                System.out.println("Here is your gum.");
                numberOfGums++;
            }
            else if (choice == 2){
                System.out.println("Here is your chocolate.");
                numberOfChocolate++;
            }
            else if (choice == 3){
                System.out.println("Here is your popcorn");
                numberOfPopcorn++;
            }
            else if (choice == 4){
                System.out.println("Here is your juice");
                numberOfJuice++;
            }
            else if (choice == 5){
                break;
            }
            else
            {
                System.out.println("Error, options 1-5 only.");
            }
        }
    }

    public void displayTotals()
    {
        System.out.println(numberOfGums + " items of gum were sold.");
        System.out.println(numberOfChocolate + " items of chocolate were sold.");
        System.out.println(numberOfPopcorn + " items of popcorn were sold.");
        System.out.println(numberOfJuice + " items of juice were sold.");
    }
}
