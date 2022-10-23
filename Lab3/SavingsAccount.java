public class SavingsAccount {
    

    private int unique_Number1;
    private int unique_Number2;
    static double annualIntrestRate;
    private double SavingsBalance1;
    private double SavingsBalance2;
    private int AccountNum1;
    private int AccountNum2;
    private double intrestRate;
    private double calculateIntrestRateSaver1;
    private double calculateIntrestRateSaver2;
    private double calculate;
    private double add;
    static double modify_Intrest_Rate;


    public SavingsAccount() {
        getunique_NumberSaver1();
        getunique_NumberSaver2();
    }
        

    public void setUnique_NumberSaver1(int unique_Number1) {
        this.unique_Number1 = unique_Number1;
    }

    public int getunique_NumberSaver1() {
        setUnique_NumberSaver1(1000);
        
        return unique_Number1;
    }

    public void setSavingsBalanceSaver1(int SavingsBalance1) {
        this.SavingsBalance1 = SavingsBalance1;
    }


    public double getSavingsBalanceSaver1() {
        setSavingsBalanceSaver1(2000);
        return SavingsBalance1;
    }


    public void setunique_NumberSaver2(int unique_Number2) {
        this.unique_Number2 = unique_Number2;
    }

    public int getunique_NumberSaver2() {
        setunique_NumberSaver2(2000);

        return unique_Number2;
    }

    public void setSavingBalanceSaver2(int SavingsBalance2) {
        this.SavingsBalance2 = SavingsBalance2;
    }

    public Double getSavingsBalanceSaver2() {
        setSavingBalanceSaver2(3000);
        return SavingsBalance2;
    }





    public void setAccountNum1(int AccountNum1) {
        this.AccountNum1 = AccountNum1;
    }

    public int getAccountNum1() {
        setAccountNum1(0);
        AccountNum1++;
        return AccountNum1;
    }


    public void setAccountNum2(int AccountNum2) {
        this.AccountNum2 = AccountNum2;
    }

    public int getAccountNum2() {
        setAccountNum2(1);
        AccountNum2++;
        return AccountNum2;
    }


    
    public void setAnnualInterestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public double getAnnualInterestRate() {
        return intrestRate;
    }




    //method to calculate intrest !

    public void setCalculateIntrestRate(double calculateIntrestRateSaver1) {
        this.calculateIntrestRateSaver1 = calculateIntrestRateSaver1;
    }

    public double getCalculateIntrestRateSaver1() {

        calculate = getSavingsBalanceSaver1() * getAnnualInterestRate() /12;

        add = getAnnualInterestRate() + getSavingsBalanceSaver1();

        getmodifyInterestRate();

        System.out.println(calculate);
        System.out.println(add);

        return calculateIntrestRateSaver1;
    }




    public double getCalculateIntrestRateSaver2() {

        calculate = getSavingsBalanceSaver2() * getAnnualInterestRate() /12;

        add = getAnnualInterestRate() + getSavingsBalanceSaver2();

        getmodifyInterestRate();

        System.out.println(calculate);
        System.out.println(add);

        return calculateIntrestRateSaver2;
    }

    public void setmodifyInterestRate(double modify_Intrest_Rate) {
        this.modify_Intrest_Rate = modify_Intrest_Rate;
    }

    public double getmodifyInterestRate() {

        setAnnualInterestRate(6.10);

        return modify_Intrest_Rate;
    }


    public String toStringSaver1() {
        return "You currently have this much in your deposit account: " + getSavingsBalanceSaver1();
    }

    public String toStringSaver2() {
        return "You currently have this much in your deposit account: " + getSavingsBalanceSaver2();
    }
    

    public String toStringAccountNum1() {
        return "Your account number is: " + getAccountNum1();
    }

    public String toStringAccountNum2() {
        return "Your account number is: " + getAccountNum2();
    }
}
