public class Book extends LibraryItem{

    private String author;
    private String title;
    private int numPages;

    public Book(String author, String title, int numPages) {
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    } 

    public String getTitle() {
        return title;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    } 

    public int getNumPages() {
        return numPages;
    }

    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        return numPages * 1.5;
    }
}
