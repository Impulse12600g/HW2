package edu.ucdenver.libraryapp;

import edu.ucdenver.library.Library;
import java.time.LocalDate;

public class MyLibraryApp {


    /**
     * This is a sample program that will use the Library.
     */
    public static void main(String[] args) {
        Library myLibrary = new Library("My Auraria Library");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(myLibrary);
        System.out.println("<<<<<<<<<<<<<<<<<<");

        try {
            myLibrary.addAuthor("John Grisham");
        }
        catch (IllegalArgumentException ie){ System.out.println("ERROR:"+ie); }

        try {
            myLibrary.addAuthor("David Baldacci");
        }
        catch (IllegalArgumentException ie){ System.out.println("ERROR:"+ie); }

        try {
            myLibrary.addAuthor("John Grisham");
        }
        catch (IllegalArgumentException ie){ System.out.println("ERROR:"+ie); }

        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(myLibrary);
        System.out.println("<<<<<<<<<<<<<<<<<<");

        try{
            String[] titles = {"The Guardians: A Novel","Guardians","Guardianes"};
            myLibrary.addPrintedBook("The Guardians", LocalDate.of(2019,10,15),titles,
                    "John Grisham", "isbn 123", 120 );
        }catch (IllegalArgumentException ie){ System.out.println("ERROR:"+ie); }

        try{
            String[] titles = {"b1","book 1","the title of book 1"};
            myLibrary.addPrintedBook("Book 1", LocalDate.of(2000,1,1),titles,
                    "Al. Baker", "isbn 2", 200 );
        }catch (IllegalArgumentException ie){ System.out.println("ERROR:"+ie); }

        try{
            String[] titles = {"Camino Winds","Winds","The last one"};
            myLibrary.addEBook("Camino Winds", LocalDate.of(2020,4,28),titles,
                    "John Grisham", "isbn 234", 500, 50 );
        }catch (IllegalArgumentException ie){ System.out.println("ERROR:"+ie); }
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(myLibrary);
        System.out.println("<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println("Books on the library:");
        System.out.println(myLibrary.printBooks());
        System.out.println("<<<<<<<<<<<<<<<<<<");
    }
}