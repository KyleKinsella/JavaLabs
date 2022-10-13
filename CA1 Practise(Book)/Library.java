import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        String book_name;
        String Author;
        String Genre;
        int i;

        for(i =0; i<3; i++) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Book name: " + i +" : ");
        book_name = scan.nextLine();

        System.out.print("Enter an Author: " + i +" : ");
        Author = scan.nextLine();

        System.out.print("Enter a book genre: " + i +" : ");
        Genre = scan.nextLine();

        //System.out.println(book_name + ", " + Author + " , " + Genre);             //"Book you entered: " + book_name + "Author you entered: " + Author + "Book genre you entered: " + Genre);
        
        Book borrow = new Book(book_name, Author, Genre);

       
        
        borrow.setStatus('A');
        System.out.println(borrow.toStringAvailable());

        borrow.setBorrow('B');
        System.out.println("Is available to " + borrow.getBorrow());
        System.out.println("This item is not available to " + borrow.toStringBorrow() + " at the moment! ");


        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("This is Book " + i + " : " + " Book name -> " + book_name + "  " + " Author -> " + Author + "  " + " Genre -> " + Genre);
        borrow.getBookName();
        borrow.getAuthor();
        borrow.getGenre(); 
        }    
    } 
}
    










//}


/*   
            if(borrow.getStatus() == 'A') {
                System.out.println("This item is " + borrow.getStatus());
                System.out.println("---------------------------------------");
            }
            else {
                //if(borrow.getBorrow() == 'B') {
                    System.out.println("This item is available to " + borrow.getBorrow()); 
                //}
            }
            
*/