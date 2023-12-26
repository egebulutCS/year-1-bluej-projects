
/**
 * Write a description of class TextBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBook
{
    // instance variables - replace the example below with your own
    private String title;
    private int chapter;
    private int chapterRead;

    /**
     * Constructor for objects of class TextBook
     */
    public TextBook(String bookTitle, int chapterBook)
    {
        // initialise instance variables
        title = bookTitle;
        chapter = chapterBook;
        chapterRead = 0;
    }

    public String getTitle()
    {
        return title;
    }

    public void readNextChapter()
    {
        if(chapterRead<chapter){
            chapterRead++;
        }
        else
        {
            System.out.println("You have already read the final chapter.");
        }
    }
    
    public boolean isFinished()
    {
        return (chapterRead==chapter);
    }
    
    public void closeBook()
    {
        chapterRead = 0;
    }
    
    public void describe()
    {
        int chaptersLeft = chapter - chapterRead;
        System.out.println(title + " with " + chaptersLeft + " chapters left to read.");
    }
    
    public String print(){
        String str = title + " with " + (chapter - chapterRead) + " chapters left.";
        return str;
    }
}
