
/**
 * This class is a test class for College class.
 *
 * @author (Ege Bulut)
 * @version (21.11.2017)
 */
public class TestCollege
{
    private String[] str;

    public TestCollege()
    {
        str = new String[3];
    }
    
    public void allPositiveTest()
    {
        str[0] = "10";
        str[1] = "15";
        str[2] = "100";
        College.main(str);
    }
    
    public void NegativeStudentNo()
    {
        str[0] = "-10";
        str[1] = "15";
        str[2] = "100";
        College.main(str);
    }
    
    public void NegativeBookNo()
    {
        str[0] = "10";
        str[1] = "-15";
        str[2] = "100";
        College.main(str);
    }
    
    public void NegativeSteps()
    {
        str[0] = "10";
        str[1] = "15";
        str[2] = "-100";
        College.main(str);
    }
}
