import java.util.Scanner;

public class VerifyRangeTest {

    public static void main(String[] args) {
        VerifyRangeTest number = new VerifyRangeTest();
        number.checkInput();
    }

    public void checkInput() {
            Scanner scan = new Scanner(System.in);

            int number;

            System.out.print("Enter an integer: ");
            number = scan.nextInt();

            if(number >= 1 && number <= 100) {
                System.out.println("Number " + number + " is in range!!!");
            }
            else {
                Verifier verify = new Verifier();
                verify.verifyIntRange(0, 0, 0);
                System.out.println("Number " + number + " is not in range !!");
            }
    }
}
