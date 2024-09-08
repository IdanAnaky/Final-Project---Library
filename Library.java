package Library;

import java.util.ArrayList;

public class Library {
    ArrayList<Shelf> shelves;
    ArrayList<Reader> readers;

    public Library(ArrayList<Shelf> shelves, ArrayList<Reader> readers) {
        this.shelves = shelves;
        this.readers = readers;
    }

    Boolean isTherePlaceForNewBook() {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull()) {
                return true;
            }

        }
        return false;
    }

    void addNewBook(Book newbook) {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull()) {
                shelf.addBooks(newbook);
                return;
            }
        }
        System.out.println("No more room");
    }


    void deleteBook(String bookTitle) {
        for (Shelf shelf : shelves) {  // עוברים על כל המדפים בספריה
            for (Book book : shelf.getBooks()) { // עוברים על כל הספרים במדף
                if (book.getTitle().equals(bookTitle)) {  // בודקים אם שם הספר תואם את הכותרת שהתקבלה
                    shelf.removeBook(book);
                    System.out.println("The book" + bookTitle + "has been deleted" );
                    return;
                }
            }

        }
    }


    void registerReader(String name, int id) {
        for (Reader reader : readers) { // עובר על כל הקוראים ברשימה
            if (reader.getName().equals(name) || reader.getId() == id) { // בודק אם השם או ה-id כבר קיימים
                System.out.println("Reader already exists");
                return;
            }
        }
        Reader newReader = new Reader(id, name);  // יצירת אובייקט Reader חדש
        readers.add(newReader);
        System.out.println("new reader has been added");
    }


    void removeReader(String name) {
        for (Reader reader : readers) {
            if (reader.getName().equals(name)) {
                readers.remove(reader);
                System.out.println("Reader has been removed");
                return;
            }

        }

    }


    ArrayList<String> searchByAuthor(String author){
        ArrayList<String>bookTitleByAuthor= new ArrayList<>();// רשימה לאחסון כותרים שנמצאו
        for (Shelf shelf: shelves){// עובר על כל המדפים בספריה
            for (Book book :shelf.getBooks()){ // עובר על כל הספרים במדף
                if (book.getAuthor().equals(author)) {
                    bookTitleByAuthor.add(book.getTitle());
                }

            }
        }
        return bookTitleByAuthor;
    }


}

