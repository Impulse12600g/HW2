package edu.ucdenver.library;

import java.time.LocalDate;

public class PrintedBook extends Book{
    private int numPages;

    /**
     * help from fig 9.8 for this method
     * @param title
     * @param publicationDate
     * @param otherTitles
     * @param author
     * @param isbn
     * @param numPages
     */
    public PrintedBook(String title, LocalDate publicationDate, String[] otherTitles, Author author, String isbn, int numPages){
        super(title, publicationDate, otherTitles, author, isbn);
        this.numPages = numPages;
        //this.title = title;

    }

    public LocalDate getPublicationDate() {
        return super.getPublicationDate();
    }
    @Override
    public int getNumPages(){
        return numPages;
    }

    public String toString(){
        return "Printed-" + super.toString() ;//+ book.toString();
    }
}
