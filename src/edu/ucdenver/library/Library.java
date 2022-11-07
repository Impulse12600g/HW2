package edu.ucdenver.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

//stringvalueof
public class Library {
    private String name = "";
    private ArrayList<Book> book;
    private ArrayList<Author> author;

    public Library(String name) {
        this.name = name;
        book = new ArrayList<Book>();
        author = new ArrayList<Author>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param title
     * @param publicationDate
     * @param otherTitles
     * @param authorName
     * @param isbn
     * @param numbOfPages
     */
    public void addPrintedBook(String title, LocalDate publicationDate, String[] otherTitles, String authorName, String isbn, int numbOfPages) {
        /**
         *
         */


        //adds a new printed book to the library.
        // If the author is not in the library, it throws an illegal argument exception
        for (Author authors : author) {
            if (Objects.equals(authors.getName(), authorName)) {//IntelliJ put here
                PrintedBook newBook = new PrintedBook(title, publicationDate, otherTitles, authors, isbn, numbOfPages);//, numbOfPages);///FIXME
                book.add(newBook);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public void addEBook(String title, LocalDate publicationDate, String[] otherTitles, String authorName, String isbn, int numbOfWords, int wordsPerPage) {
        //analogous to addPrintedBook but for electronic books
        for (Author authors : author) {
            if (Objects.equals(authors.getName(), authorName)) {//IntelliJ put here
                EBook newBook = new EBook(title, publicationDate, otherTitles, authors, isbn, numbOfWords, wordsPerPage);//, numbOfPages);///FIXME
                book.add(newBook);
                return;
            }
        }
        throw new IllegalArgumentException();


    }

    public int size() {
        return 0;
    }

    public String printBooks() {
        //adds a new printed book to the library.
        // If the author is not in the library, it throws an illegal argument exception
       int i = 0;
        String print ="";
        i = book.size();
        for (Book book : book){
            int j=1;
            //print = print + (book.toString() + "");
            if (j != i){
                j++;
                print = print + (book.toString() + "");//newline to all but last

            }else{
                print = print + (book.toString() + "");
            }

        }

        return print;
    }

    public void addAuthor(String authorName) {
        //if there are no author with that name, adds a new one.
        // Throws an illegal argument exception otherwise.
        for (Author author : author) {
            if (author.getName().compareTo(authorName) == 0) {//IntelliJ put here
                throw new IllegalArgumentException();
            }
        }
        author.add(new Author(authorName));
    }

    public Author getAuthor(String authorName) {
        for (int i = 0; i < author.size(); i++) {
            if (author.get(i).getName().compareTo(authorName) == 0) {
                return author.get(i);
            }

        }
        //if author is not present
        throw new IllegalArgumentException();

        //return author.get();//////////
    }

    public String getname() {
        return name;
    }

    public String toString() {

        StringBuilder print; // page 612 for help here
        print = new StringBuilder("This is the " + getName() + " library.\n" + "==Author List==\n");
        //arrays print author list
        for (Author author : author) {//figure 7.24 as reference here
            print.append(author.toString()).append("\n");
        }
        //booklist
        print.append("==Book List==\n");
        for (Book book : book) {
            print.append(book.toString()).append(("\n"));
        }
        print.append("--o--\n");

        return print.toString();
    }
}
