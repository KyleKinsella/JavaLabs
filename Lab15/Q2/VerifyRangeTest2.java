package Q2;

import java.util.Scanner;

public class VerifyRangeTest2 {


    public static void main(String[] args) {
        VerifyRangeTest2 number = new VerifyRangeTest2();
        number.checkInput();

        Verifier2 verify2 = new Verifier2();
        verify2.verifyPasswordStrength();
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
                Verifier2 verify = new Verifier2();
                verify.verifyIntRange(0, 0, 0);
                System.out.println("Number " + number + " is not in range !!");
            }
    }
}
