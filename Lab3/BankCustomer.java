import java.util.Scanner;

public class BankCustomer {

    private String name;
    private String address;
    private int SavAccounts;
    private int balance;


    public BankCustomer() {
        
    }

    public BankCustomer(String name, String address) {
       this.name = name;
       this.address = address;
       SavAccounts++;
    }


    public void setAddAccount(int SavAccounts) {
        this.SavAccounts = SavAccounts;
    } 

    public int getAddAccount() {
        return SavAccounts;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {

        int addUp;
        int first_Sav_Account;
        int second_Sav_Account;
        int third_Sav_Account;
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter ammount in your First Savings Accounts: ");
        first_Sav_Account = scan.nextInt();
                
        System.out.print("Enter ammount in your Second Savings Accounts: ");
        second_Sav_Account = scan.nextInt();

        System.out.print("Enter ammount in your Third Savings Accounts: ");
        third_Sav_Account = scan.nextInt();

        addUp = first_Sav_Account + second_Sav_Account + third_Sav_Account;

        System.out.println("You have this much in your savings: " + addUp);

        System.out.println("---------------------------------");

        System.out.println("You have this much in your First Savings account " + first_Sav_Account);
        System.out.println("You have this much in your Second Savings account " + second_Sav_Account);
        System.out.println("You have this much in your Third Savings account " + third_Sav_Account);

        System.out.println("---------------------------------");
        
        System.out.println("Your total Savings is:");
        return addUp;
    }
}
