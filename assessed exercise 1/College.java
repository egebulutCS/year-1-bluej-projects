import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class College here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class College
{
    private ArrayList<Student> studentList;
    private Library collegeLibrary;
    private Random random;
    
    public College(int studentNo, int bookNo){
        collegeLibrary = new Library(bookNo);
        studentList = new ArrayList(studentNo);
        for(int i = 0; i < studentNo; i++){
            Student student = new Student("Student" + i, collegeLibrary);
            studentList.add(student);
        }
        random = new Random();
    }
    
    public void describe(){
        System.out.println("The college currently has " + studentList.size() + " hard-working student");
        System.out.println(collegeLibrary.print());
    }
    
    private void nextStep(){
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
    
    public void runCollege(int nSteps){
        for(int i = 0; i < nSteps; i++){
            System.out.println("Step " + i);
            describe();
            nextStep();
        }
    }
    
    public static void main(String[] args){
        College college = new College(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        college.runCollege(Integer.valueOf(args[2]));
    }
}
