import java.util.Arrays;
/**
 * Write a description of class bag1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bag3
{
    // instance variables - replace the example below with your own
    private String[] strings;
    private int nextFreePosition;
    
    /**
     * Constructor for objects of class bag1
     */
    public bag3(int limit)
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
                String temp = strings[nextFreePosition - 1];
                strings[i] = temp;
                nextFreePosition--;
                return;
            }
            else
            {
                i++;
            }
        }
        System.out.println("String " + s + " is not in the array list");
    }

    public void showStrings()
    {
        for(int i = 0; i < nextFreePosition - 1; i++){
            System.out.println(strings[i]);
        }
    }
}
