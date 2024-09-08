package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelf {

    ArrayList<Book> books = new ArrayList<>(5);
    boolean isShelfFull = false;

    public boolean isShelfFull() {
        if (books.size() == 5){
        return true;
        }
        return false;
    }


    //setter
    void addBooks(Book book) {
        if (!isShelfFull()) {
            books.add(book);
            System.out.println("The book has been added.");

            if (books.size() == 5) {
                isShelfFull = true;
                System.out.println("The Shelf is Full.");

            }
        }

    }

    void replaceBooks() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number between 1-5");
        int x = input.nextInt() - 1;
        System.out.println("Enter second number between 1-5");
        int y = input.nextInt() - 1;

// בודק שהאינדקסים בתוך הטווח המתאים (0-4)
        if ( x < 0 || x >= 5 || y < 0 || y >= 5) {
            System.out.println("Invalid number. Please try again.");
            return;
        }

        if (x >= books.size() || y >= books.size() || books.get(x) == null || books.get(y) == null) {
            System.out.println("cannot make the swap.");
            return;
        }

        Book swap = books.get(x);
        books.set(x, books.get(y));
        books.set(y, swap);
        System.out.println("The books have benn swap " );
    }


    void removeBook(Book book) {
        books.remove(book);


    }

     ArrayList<Book> getBooks() {
    return books;


    }
}
