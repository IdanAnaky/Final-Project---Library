package Library;

import java.util.ArrayList;

public class Reader {

    private int Id;

     private String Name;

    ArrayList<String> books;


    Reader(int id,String name) {
        this.Id=id;
        this.Name=name;
        this.books = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    void readBook(String bookTitle){
        this.books.add(bookTitle);

    }


}
