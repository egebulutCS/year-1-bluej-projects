import java.util.ArrayList;
import java.util.Random;
/**
 * College class is a main class which runs the code.
 *
 * @author (Ege Bulut)
 * @version (21.11.2017)
 */
public class College
{
    private ArrayList<Student> studentList;
    private Library collegeLibrary;
    private Random random;
    
    /**
     * Its purpose is to initialise global fields.<p>
     * Constructor.<p>
     * Integer type studentNo, Integer type bookNo.<p>
     * @param studentNo parameter sets the limit of student array list.
     * @param bookNo parameter sets the number of books that is kept in the library.
     */
    public College(int studentNo, int bookNo)
    {
        collegeLibrary = new Library(bookNo);
        studentList = new ArrayList(studentNo);
        for(int i = 0; i < studentNo; i++){
            Student student = new Student("Student" + i, collegeLibrary);
            studentList.add(student);
        }
        random = new Random();
    }
    
    /**
     * Its purpose is to print the description of the state of the class and its fields.<p>
     * type void.
     */
    public void describe()
    {
        System.out.println("The college currently has " + studentList.size() + " hard-working student");
        collegeLibrary.describe();
    }
    
    /**
     * Its purpose is to check the list and control the students according to its state.<p>
     * type void.<p>
     */
    private void nextStep()
    {
        if(studentList.size() <= 0){
            System.out.println("Everything has gone very quiet!");
        }
        else{
            Student student = studentList.get(random.nextInt(studentList.size()));
            if(student.finishedStudies()){
                System.out.println("The student has graduated and left the college!");
                studentList.remove(student);
            }
            else{
                student.study();
            }
        }
    }
    
    /**
     * Its purpose is to run the methods of college class.<p>
     * type void.<p>
     * Integer type nSteps.<p>
     * @param nSteps indicates the amount of number of loops this method will do.<p>
     */
    public void runCollege(int nSteps)
    {
        for(int i = 0; i < nSteps; i++){
            System.out.println("Step " + i);
            describe();
            nextStep();
        }
    }
    
    /**
     * Its purpose is to make the class executable by command prompt by creating a new class.<p>
     * type void.<p>
     * String type Array args.<p>
     * @param args hold the values that will be used for when running other methods.<p>
     */
    public static void main(String[] args)
    {
        College college = new College(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        college.runCollege(Integer.valueOf(args[2]));
    }
}
