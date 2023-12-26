 
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet
{
	private String species;
	private String sound;
	private String name;
	private int age;
	private Human owner;
	
	public Pet(String kind, String whatCalled, int theAge, String noise)
	{
	    species = kind;
	    name = whatCalled;
	    sound = noise;
	    age = theAge;
	}
	
	public void makeNoise()
	{
	    System.out.println(sound);
	}
	
	public void birthday()
	{
	    age += 1;
	}
	
	public int getAge()
	{
	    return age;
	}
	
	public void setOwner(Human theOwner)
	{
	    owner = theOwner;
	   }
}
