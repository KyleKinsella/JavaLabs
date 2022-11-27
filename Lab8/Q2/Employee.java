package Q2;

public class Employee extends Person{
    
    private String name;
    private double annual_salary;

    public Employee(String name, double annual_salary) {
        super(name);

        this.name = name;
        this.annual_salary = annual_salary;
    }

    public void serAnnualSalary(double annual_salary) {
        this.annual_salary = annual_salary;
    }


    public double getAnnualSalary() {
        return annual_salary;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub

        return "An employee with a salary of : " + getAnnualSalary();
    }


}
