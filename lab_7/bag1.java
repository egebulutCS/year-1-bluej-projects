import java.util.Arrays;
/**
 * Write a description of class bag1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bag1
{
    // instance variables - replace the example below with your own
    private String[] strings;

    /**
     * Constructor for objects of class bag1
     */
    public bag1(int limit)
    {
        strings = new String[limit];
    }

    public boolean isFull()
    {
        for(int i = 0; i < strings.length; i++){
            if(strings[i] == null){
                return false;
            }
        }
        return true;
    }

    public void add(String s)
    {
        if(isFull() == true){
            System.out.println("Array is already full.");
        }
        else
        {
            for(int i = 0; i < strings.length; i++){
                if(strings[i] == null){
                    strings[i] = s;
                    return;
                }
            }
        }
    }

    public boolean contains(String s)
    {
        boolean b = false;
        for(int i = 0; i < strings.length; i++){
            if(s.equals(strings[i])){
                b = true;
            }
        }
        return b;
    }

    public void remove(String s)
    {
        int i = 0;
        while(i < strings.length){
            if(s.equals(strings[i])){
                strings[i] = null;
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
        for(int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
