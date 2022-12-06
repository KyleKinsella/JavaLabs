import java.util.Arrays;

public class LibraryDriver {
    
    public static void main(String[] args) {
        
        LibraryItem[] products = new LibraryItem[5];

        Book B1 = new Book("Jk rowling", "Harry Potter", 200);
        products[0] = B1;

        //String[] book1 = {"Author " + B1.getAuthor() + " title " + B1.getTitle() + "Number of pages in book " + B1.getNumPages()};

        CD cd1 = new CD("The killers", "Mr Brightside", 20);
        products[1] = cd1;

        
        String[] bookArr = {"Book Author: " + B1.getAuthor() + ", " + " Book Title: " + B1.getTitle() + ", " + " Number of pages in book: " + B1.getNumPages()};
         
        System.out.println(("Book -> " + Arrays.toString(bookArr)));

        System.out.println("Book Author: " + B1.getAuthor());
        System.out.println("Book Title: " + B1.getTitle());
        System.out.println("Number of pages in the book: " + B1.getNumPages());

         
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        String[] cdArr = {"Cd Band: " + cd1.getBand() + ", " + " Cd title: " + cd1.getTitle()+ ", " + " Amount of tracks on the Cd: " + cd1.getNumTracks()};
         

        System.out.println("Cd -> " + Arrays.toString(cdArr));

        System.out.println("Band Name: " + cd1.getBand());
        System.out.println("Cd Title: " + cd1.getTitle());
        System.out.println("Number of tracks on the CD: " + cd1.getNumTracks());

 
        System.out.println("------------------------------------");
        
        System.out.println("Below are the Loan item prices:");
        System.out.println("Book -> " + B1.calculatePrice());
        System.out.println("Cd -> " + cd1.calculatePrice());
        
        System.out.println("------------------------------------");
    }
}
