package Library;

public class Book {



   private   String Author;

    private   String Title;
    private   int NumOFPages;

    Book(String author,String title, int numOFPages){
        this.Title=title;
        this.NumOFPages=numOFPages;
        this.Author=author;

    }
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public int getNumOFPages() {
        return NumOFPages;
    }

    public void setNumOFPages(int numOFPages) {
        this.NumOFPages = numOFPages;
    }
}
