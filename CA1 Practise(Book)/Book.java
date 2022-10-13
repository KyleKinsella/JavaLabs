public class Book {
    private String Book_name;
    private String Author;
    private String Genre;
    static int ISBN;
    private char status;
    private int bookNum;
    private char borrow;


    public Book() {
        setISBN(1);
        bookNum = ISBN;
        ISBN++;

        //getStatus();
        //getBorrow();
    }

    public Book(String book_name, String Author, String genre) {
        setBookName("");
        setAuthor("");
        setISBN(0);
        setbookNum(ISBN);
        //setStatus('A');
        //setBorrow('B');
    } 

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }


    public void setBookName(String book_name) {
        this.Book_name = Book_name;
    }

    public String getBookName() {
        return Book_name;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void setStatus(char status) {
        this.status = status;

        //setStatus('A');
    }

    public char getStatus() {
        return status;
    }

    public void setbookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public int getbookNum() {
        return bookNum;
    }




    public void setBorrow(char borrow) {
        this.borrow = borrow;

        //setBorrow('B');
    }

    public char getBorrow() {
        return borrow;
    }

    public String toStringAvailable(){
        return "This item is Available: " + getStatus();
    }

    public String toStringBorrow() {
        return "Borrow";    // + getBorrow();
    }
}