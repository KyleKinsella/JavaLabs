package Q2;
import java.util.Scanner;

//import MyOutOfRangeException;
//import Verifier;

public class Verifier2 {
    

    MyOutOfRangeException range = new MyOutOfRangeException();


    public static void main(String[] args) {
        Verifier2 verify = new Verifier2();
        verify.verifyIntRange(0, 0, 0);    
    }


    public void verifyIntRange(int value, int low, int high) {
        if(value >= low && value <= high) {
            System.out.println(range);
        }
    }


    public void verifyPasswordStrength() {
        Scanner scan = new Scanner(System.in);
        String password;

        System.out.print("Enter a password: ");
        password = scan.nextLine();

        if(password.length() < 8) {
            MyInvalidPasswordException passwordException = new MyInvalidPasswordException();
            System.out.println(passwordException + "Password is not long enough, Try again");
           while(password.length() < 8) {
            System.out.print("Enter a password: ");
            password = scan.nextLine();
           }
        }
        else {
            System.out.println("Password is Strong");
        }
    }
}
