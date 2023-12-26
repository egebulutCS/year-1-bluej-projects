
/**
 * Student class is a helper class which is used by College class.
 *
 * @author (Ege Bulut)
 * @version (21.11.2017)
 */
public class Student
{
    private String studentName;
    private Library collegeLibrary;
    private LibraryCard studentLibraryCard;
    private TextBook book;
    
    /**
     * Its purpose is the initialise global fields.<p>
     * Constructor.<p>
     * String type name and Library type library.
     * @param name is used to take an input name for a student.
     * @param library is used to set the library class.
     */
    public Student(String name, Library library)
    {
        studentName = name;
        collegeLibrary = library;
        studentLibraryCard = collegeLibrary.issueCard();
        book = null;
    }
    
    /**
     * Its purpose is to check if a student has a book and if the student can borrow any more.<p>
     * type boolean.
     * @return True, if both of the conditions are met.
     */
    public boolean finishedStudies()
    {
        return(book==null && studentLibraryCard.expired());
    }
    
    /**
     * Its purpose is to make the student borrow a book if there is none; otherwise check if the book is finished.<p>
     * type void.
     * If it is not increase chapters read by one; otherwise return the book back to the library.<p>
     */
    public void study()
    {
        if(book==null){
            book = collegeLibrary.borrowBook(studentLibraryCard);
        }
        else if(!book.isFinished()){
            book.readNextChapter();
        }
        else{
            book.closeBook();
            collegeLibrary.returnBook(book);
            book = null;
        }
    }
    
    /**
     * Its purpose is to print out the state of the student.<p>
     * type void.
     */
    public void describe()
    {
        if(book==null){
            System.out.println("Student " + studentName + " does not have a book and ");
            studentLibraryCard.describe();
        }
        else if(!book.isFinished()){
            System.out.println("Student " + studentName + " has a book ");
            book.describe();
        }
        else{
            System.out.println("Student " + studentName + " has a book ");
            book.describe();
            System.out.println("The book is finished!");
        }
    }
}
