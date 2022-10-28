import java.util.Scanner;

public class employee {
    private int EmployeeStaff;
    private int EmployeeManger;
    private String EmployeeTypeStaff;
    private String EmployeeTypeManager;
    private String carColor;
    private String carBrand;
    private String check;
    private String assigned;

    public employee() {
        
    }

    public void setEmployeeStaff(int EmployeeStaff) {
        this.EmployeeStaff = EmployeeStaff;
    }

    public int getEmployeeStaff() {
        setEmployeeStaff(1000);
        return EmployeeStaff;
    }

    public void setEmployeeManager(int EmployeeManger) {
        this.EmployeeManger = EmployeeManger;
    }

    public int getEmployeeManager() {
        setEmployeeManager(2000);
        return EmployeeManger;
    }


    public void setEmployeeTypeStaff(String EmployeeTypeStaff) {
        this.EmployeeTypeStaff = EmployeeTypeStaff;
    }

    public String getEmployeeTypeStaff() {
        setEmployeeTypeStaff("Staff");
        return EmployeeTypeStaff;
    }


    public void setEmployeeTypeManager(String EmployeeTypeManager) {
        this.EmployeeTypeManager = EmployeeTypeManager;
    }

    public String getEmployeeTypeManager() {
        setEmployeeTypeManager("Manager");
        return EmployeeTypeManager;
    }


    public void setIfCheck(String check) {
        this.check = check;
    }

    public String getIfCheck() {
        if(getEmployeeTypeManager() == "Manager") {
            System.out.println(toStringCar());
            assigned = getEmployeeTypeManager();
            
            assigned = assigned + new employee();
        }
        return "These are the types of Employees we have: ";
    }




    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What color is your car? ");
        carColor = scan.nextLine();

        return carColor;
    }


    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What brand is your car? ");
        carBrand = scan.nextLine();
        
        return carBrand;
    }



    public String toStringEmployeeTypeStaff() {
        getEmployeeTypeStaff();
        return "Your Employee number is " + getEmployeeStaff() + " You are currently a " + getEmployeeTypeStaff();
    }

    public String toStringEmployeeTypeManager() {
        setEmployeeTypeManager(EmployeeTypeManager);
        return "Your Employee number is " + getEmployeeManager() + " You are currently a " + getEmployeeTypeManager();
    }
    
    public String toStringCar() {
        return "You have a " + getCarColor() + " car" + " and it is a " + getCarBrand();
    }
}
