import java.util.ArrayList;
/**
 * Write a description of class StringUtilities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringUtilities
{

    public StringUtilities()
    {

    }

    public void judgeInputString(String string)
    {
        if((string.equals("quit")) || (string.equals("Quit")) || (string.equals("QUIT"))){
            return;
        }
        else if(string.length()<7){
            System.out.println("Too short");
        }
        else if(string.length()>7){
            System.out.println("Too long");
        }
        else
            System.out.println(string.substring(2,5));
    }

    public boolean isPalindrome(String string)
    {
        boolean p = true;
        for(int i = 0; i < string.length()/2; i++){            
            if(string.charAt(i) != string.charAt(string.length()-1-i)){
                p = false;
            }
        }
        return p;
    }

    public int getPositionOfSubstring1(String toBeSearched, String toBeFound){
        return toBeSearched.indexOf(toBeFound);
    }

    public int getPositionOfSubstring(String toBeSearched, String toBeFound){
        for(int i = 0; i <= toBeSearched.length()-toBeFound.length(); i++){
            int j = 0;
            while(toBeSearched.charAt(i+j) == toBeFound.charAt(j)){
                j++;
                if(j == toBeFound.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }

    public void printAllPositionOfSubstring(String toBeSearched, String toBeFound){
        for(int i = 0; i <= toBeSearched.length()-toBeFound.length(); i++){
            int j = 0;
            while(toBeSearched.charAt(i+j) == toBeFound.charAt(j)){
                j++;
                if(j == toBeFound.length()-1){
                    System.out.println("The substring " + toBeFound + " is located at index " + i);
                    break;
                }
            }
        }
    }

    public ArrayList<Integer> printAllPositionsOfSubstring(String toBeSearched, String toBeFound){
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for(int i = 0; i <= toBeSearched.length()-toBeFound.length(); i++){
            int j = 0;
            while(toBeSearched.charAt(i+j) == toBeFound.charAt(j)){
                j++;
                if(j == toBeFound.length()-1){
                    positions.add(i);
                    break;
                }
            }
        }
        return positions;
    }
}
