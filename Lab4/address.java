import java.util.Scanner;

public class address {
    private String City_Town;
    private String street;
    private String country;

    public address() {
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Street: ");
        street = scan.nextLine();

        return street;
    }


    public void setCity_Town(String City_Town) {
        this.City_Town = City_Town;
    }

    public String getCity_Town() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your City/Town: ");
        City_Town = scan.nextLine();

        return City_Town;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Country: ");
        country = scan.nextLine();

        return country;
    }

    public String toString() {
        return "You are on street " + getStreet() + " Your City/Town is " + getCity_Town() + " country you are in at the moment is " + getCountry();
    }
    
}
    