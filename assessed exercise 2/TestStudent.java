
/**
 * This class is a test class for Student class.
 *
 * @author (Ege Bulut)
 * @version (21.11.2017)
 */
public class TestStudent
{
    private Library l1;
    private String name;
    private Student s1;
    
    /**
     * Constructor for objects of class TestStudent
     */
    public TestStudent()
    {
        l1 = new Library(10);
        name = "student";
        s1 = new Student(name, l1);
    }
    
    public void finishedStudies()
    {
        s1.finishedStudies();
    }
}
