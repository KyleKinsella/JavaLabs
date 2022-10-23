public class Savings {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();


        System.out.println("Saver1 -> Your unique number is: " + saver1.getunique_NumberSaver1());
        System.out.println(saver1.toStringSaver1());
        System.out.println(saver1.toStringAccountNum1());

        System.out.println("--------------------------------------------------------");

        System.out.println("Saver2 -> Your unique number is: " + saver2.getunique_NumberSaver2());
        System.out.println(saver2.toStringSaver2());
        System.out.println(saver2.toStringAccountNum2());

        System.out.println("--------------------------------------------------------");

        saver1.setAnnualInterestRate(4);
        saver1.getAnnualInterestRate();

        saver2.setAnnualInterestRate(4);
        saver2.getAnnualInterestRate();

        System.out.println("Value when 4 percent intrest is applied: " + saver1.getCalculateIntrestRateSaver1());
        System.out.println("Value when 4 percent intrest is applied: " + saver2.getCalculateIntrestRateSaver2());

        
        saver1.setAnnualInterestRate(5);
        saver1.getAnnualInterestRate();

        saver2.setAnnualInterestRate(5);
        saver2.getAnnualInterestRate();
        
      
        System.out.println("--------------------------------------------------------");
       
        System.out.println("Your new balance is " + saver1.getSavingsBalanceSaver1());
        System.out.println("Your new balance is " + saver2.getSavingsBalanceSaver2());

    }
}
