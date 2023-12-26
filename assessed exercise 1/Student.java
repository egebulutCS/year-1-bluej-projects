
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String studentName;
    private Library collegeLibrary;
    private LibraryCard studentLibraryCard;
    private TextBook book;
    
    public Student(String name, Library library){
        studentName = name;
        collegeLibrary = library;
        studentLibraryCard = collegeLibrary.issueCard(5);
        book = null;
    }
    
    public boolean finishedStudies(){
        return(book==null && studentLibraryCard.expired());
    }
    
    public void study(){
        if(book==null){
            book = collegeLibrary.borrowBook(studentLibraryCard);
        }
        else if(!book.isFinished()){
            book.readNextChapter();
        }
        else{
            book.closeBook();
            collegeLibrary.returnTextBook(book);
            book = null;
        }
    }
    
    public void describe(){
        if(book==null){
            System.out.println("Student " + studentName + " does not have a book and " + studentLibraryCard.print()); 
        }
        else if(!book.isFinished()){
            System.out.println("Student " + studentName + " has a book " + book.print());
        }
        else{
            System.out.println("Student " + studentName + " has a book " + book.print());
            System.out.println("The book is finished!");
        }
    }
}
