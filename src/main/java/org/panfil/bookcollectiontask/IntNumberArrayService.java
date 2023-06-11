package org.panfil.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class IntNumberArrayService {
    public static void main(String[] args) {
        Book book1984 = new Book("1984", "George O. ");
        Book bookBuyology = new Book("Buyology", "Martin L. ");
        Book oameniiBook = new Book("Oamenii Fericiti nu lucreaza si Beau Cafea ", "Martin L.");
        Book ionBook = new Book("Ion", "Liviu Rebreanu ");

        Library classicLibrary = new Library("Librarius");

        classicLibrary.addBook(bookBuyology);
        classicLibrary.addBook(oameniiBook);
        classicLibrary.addBook(bookBuyology, ionBook);

        classicLibrary.printAllTheBooks();


        System.out.println("1. Numarul de carti este: " + classicLibrary.returnNumberOfBooks());

        classicLibrary.removeBook(3);

        classicLibrary.removeBook(book1984);
        System.out.println("2 .Numarul de carti dupa stergere este: " + classicLibrary.returnNumberOfBooks());

        classicLibrary.removeBook("Buyology");

        System.out.println("3. Numarul de carti dupa stergere este " + classicLibrary.returnNumberOfBooks());

        classicLibrary.printAllTheBooks();


        Library literaLibrary = new Library("Litera");

        literaLibrary.addBook(ionBook, ionBook);
        literaLibrary.addBook(book1984, bookBuyology);
        literaLibrary.addBook(oameniiBook);

        System.out.println(literaLibrary.returnNumberOfBooks());

        Map<String, Library> librariesNetwork = new HashMap<>();

        librariesNetwork.put("str. Arborilor 22", classicLibrary);
        librariesNetwork.put("str. Gr. Vieru 14", literaLibrary);

        librariesNetwork.get("str. Gr. Vieru 14").addBook(ionBook);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();
        librariesNetwork.get("str. Arborilor 22").addBook(ionBook);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();

        librariesNetwork.get("str. Arborilor 22").addAnotherListOfBooksIntoTheLibraryList(literaLibrary.getBookList());
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();
    }
}