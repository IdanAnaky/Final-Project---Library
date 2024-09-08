package Library;

import javax.crypto.spec.PSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Book book1 = new Book("Yamaha", "R1", 1000);
        Book book2 = new Book("Idan", "the unconditional love for Motorcycle", 300);
        Book book3 = new Book("Suzuki", "Gsxr", 750);
        Book book4 = new Book("Ducati", "Monster", 900);
        Book book5 = new Book("Suzuki", "SV ", 650);
        Book book6 = new Book("Honda", "CBR ", 650);


        Shelf shelf = new Shelf();

        Shelf shelf1 = new Shelf();
        shelf1.addBooks(book1);
        shelf1.addBooks(book2);

        Shelf shelf2 = new Shelf();
        shelf2.addBooks(book3);
        shelf2.addBooks(book4);

        Shelf shelf3 = new Shelf();
        shelf3.addBooks(book5);
        shelf3.addBooks(book6);

        shelf1.replaceBooks();



        ArrayList<Shelf> shelves = new ArrayList<>();
        shelves.add(shelf1);
        shelves.add(shelf2);
        shelves.add(shelf3);

        Library library = new Library(shelves, new ArrayList<>());

        int choice = 0;

        while (choice != 6) {
            System.out.println("For adding a book - Press 1");
        System.out.println("For deleting a book - Press 2");
        System.out.println("For registering a new reader - Press 3");
        System.out.println("For removing a reader - Press 4");
        System.out.println("For searching books by author – Press ");
        System.out.println("For exit – Press 6");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Book detalis : Name, Author,Number of pages ");
                String bookName = input.next();
                String bookAuthor = input.next();
                int bookNumberOfPages = input.nextInt();
                library.addNewBook(new Book(bookName, bookAuthor, bookNumberOfPages));
                input.nextLine();

                break;

            case 2:
                System.out.println("Name of a book/books");
                String DeleteBook = input.next();
                library.deleteBook(DeleteBook);
                break;
            case 3:
                System.out.println("Name of the reader that you want to add please");
                String ReaderNane = input.next();
                int ReaderId = input.nextInt();
                library.registerReader(ReaderNane, ReaderId);
                break;

            case 4:
                System.out.println("Name of the reader that you want to remove please");
                String ReaderNameRemove = input.next();
                library.removeReader(ReaderNameRemove);
                break;

            case 5:
                System.out.println("Name of the author please");
                String AuthorName = input.next();
                ArrayList<String> booksOfAuthor = library.searchByAuthor(AuthorName);
                for (String title : booksOfAuthor) {
                    System.out.println(title);


                }
            case 6:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Wrong choice try again");
        }

        }




    }
}