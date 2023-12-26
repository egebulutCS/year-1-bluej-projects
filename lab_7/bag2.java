import java.util.Arrays;
/**
 * Write a description of class bag1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bag2
{
    // instance variables - replace the example below with your own
    private String[] strings;
    private int nextFreePosition;
    
    /**
     * Constructor for objects of class bag1
     */
    public bag2(int limit)
    {
        strings = new String[limit];
        nextFreePosition = 0;
    }

    public boolean isFull()
    {
        if(nextFreePosition == strings.length){
            return true;
        }
        return false;
    }

    public void add(String s)
    {
        if(isFull() == true){
            System.out.println("Array is already full.");
        }
        else
        {
            strings[nextFreePosition] = s;
            nextFreePosition++;
        }
    }

    public boolean contains(String s)
    {
        boolean b = false;
        for(int i = 0; i < nextFreePosition - 1; i++){
            if(s.equals(strings[i])){
                b = true;
            }
        }
        return b;
    }

    public void remove(String s)
    {
        int i = 0;
        while(i < nextFreePosition - 1){
            if(s.equals(strings[i])){
                strings[i] = null;
                break;
            }
            else
            {
                i++;
            }
        }
        System.out.println("String " + s + " is not in the array list");
        for(int k = 0; k < strings.length; k++){
            int reverseIndex = strings.length - k;
            if((strings[reverseIndex] != null) && (strings[reverseIndex + 1] == null)){
                String temp = strings[reverseIndex];
                strings[reverseIndex] = null;
                strings[reverseIndex + 1] = temp;
                nextFreePosition--;
            }
        }
    }

    public void showStrings()
    {
        for(int i = 0; i < nextFreePosition - 1; i++){
            System.out.println(strings[i]);
        }
    }
}
