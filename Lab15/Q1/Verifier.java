public class Verifier {
    

    MyOutOfRangeException range = new MyOutOfRangeException();


    public static void main(String[] args) {
        Verifier verify = new Verifier();
        verify.verifyIntRange(0, 0, 0);    
    }


    public void verifyIntRange(int value, int low, int high) {
        if(value >= low && value <= high) {
            System.out.println(range);
        }
    }
}
