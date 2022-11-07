package edu.ucdenver.library;
import java.lang.Object;
import java.time.LocalDate;

public class EBook extends Book {
    private int numberOfWords;
    private int wordsPerPage;


    public EBook(String title, LocalDate publicationDate, String[] otherTitles, Author author, String isbn, int numberOfWords, int wordsPerPage){
        //this.title = title;
        super(title, publicationDate, otherTitles, author, isbn);
        this.wordsPerPage = wordsPerPage;
        this.numberOfWords= numberOfWords;

    }

    public void setWordsPerPage(int wordsPerPage) {
        this.wordsPerPage = wordsPerPage;
    }

    public int getNumPages(){
        int words = 0;
        if (numberOfWords != 0 && wordsPerPage != 0) {// if one is 0 you cant divide
             words = (numberOfWords / wordsPerPage);
        }
        return words;
    }
    public String toString(){
        return "Electronic-" + super.toString() ;
    }
}
