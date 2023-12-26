/* 
 * This class forms the basis for some exercises in lab class 2
 */


public class Singer
{
  boolean happy;
        
  public Singer()
  {
    happy = true;
  }
  
  public void sing()
  {
    if (happy == true) {
      System.out.println("Happy Birthday to You!");
    }
    else {
      System.out.println("Suicide is painless!");
    }
  }
    
  public void sing1()
  {
    if (happy) {
      System.out.println("Happy Birthday to You!");
    }
    else {
      System.out.println("Suicide is painless!");
    }
  }
  
  public boolean isSad()
  {
    if (happy == true) {
      return false;
    }
    else {
      return true;
    }
  }
  
  public boolean isSad1()
  {
      return !happy;
    }
    
  public boolean badIsSad()
  {
    if (happy = true) {
      return false;
    }
    else {
      return true;
    }
  }
  
  public void changeMood()
  {
      happy = !happy;
    }
}
