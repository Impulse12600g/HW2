package edu.ucdenver.library;

import java.time.LocalDate;

public abstract class Book {
    private String title ;
    private LocalDate publicationDate;
    private String[] otherTitles;
    private String isbn ;
    private Author author;

    public Book(String title, LocalDate publicationDate, String[] otherTitles, Author author, String isbn) {
        //called by author
        this.title = title;
        this.publicationDate = publicationDate;
        this.otherTitles = otherTitles;
        this.isbn = isbn;
        this.author = author;
    }
    public abstract int getNumPages();
    public String toString(){
        //StringBuilder print; // page 612 for help here
        String print = "Book: "+getTitle() + " (isbn:" + getISBN() +
                "), published on " + getPublicationDate() + " authored by " + getAuthor() + " with " +
                 getNumPages() + " pages and " + otherTitles.length + " other titles.\n";
        return print;
    }
    public String getTitle(){

        return title;
    }
    public void setTitle(String title){

        this.title = title;
    }
    public LocalDate getPublicationDate(){

        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate){
        this.publicationDate = publicationDate;
    }
    public String[] getOtherTitles(){
        return otherTitles;
    }
    public void setOtherTitles(String[] otherTitles){
        this.otherTitles = otherTitles;
    }
    public String getISBN(){
        return isbn;
    }
    public Author getAuthor(){
        return author;
    }

}
