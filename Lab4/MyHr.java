import java.util.Scanner;

public class MyHr {

    public static void main(String[] args) {
    
    office office = new office();
    address address = new address();
    employee emp = new employee();

    String employeeName;
    int employeeOfficeNum;
    String street;
    String city_town;
    String county;
    int i;
    String assigned; 

    int counter;

    String one,two,three;

    System.out.println("Enter your prefered choice: ");
    System.out.println("--------------------------");
    System.out.println("1. List all offices");
    System.out.println("2. Create a new employee record");
    System.out.println("3. List all employees");

    counter = 0;

            Scanner scan = new Scanner(System.in);

            counter = scan.nextInt();

            if(counter == 1) 
            {
                System.out.println("Below are all the Offices that we have at the moment: ");
                System.out.println(office.getOfficeNum());
                System.out.println(office.getOfficeNum2());
                System.out.println(office.getOfficeNum3());
            }
            if(counter == 2) 
            {
                for(i=1; i<6; i++) {

                System.out.println("Enter some information into the employee record" + " " + i);

                Scanner input = new Scanner(System.in);
                
                System.out.println("Enter Employee name: ");
                employeeName = input.nextLine();
            
                System.out.println("Enter Employee Office Number: ");    
                employeeOfficeNum = input.nextInt();
            
                one = address.toString();

                two = emp.toStringEmployeeTypeManager();

                three = emp.toStringCar();
                
                
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Employee Record -> " + i + " :");

                System.out.println("Employee name: " + employeeName + ", " + "Your office number -> " + employeeOfficeNum);
                System.out.println(one);
                System.out.println(two);
                System.out.println(three);

                System.out.println(office.getAssigned());
                System.out.println("----------------------------------------------------------------------");

                
                
            }
            }
            if(counter == 3) 
            {
                System.out.println(emp.getEmployeeTypeStaff());
                System.out.println(emp.getEmployeeTypeManager());
            }     
            else {
                System.out.println("Invalid input !");
            }
    }
}   