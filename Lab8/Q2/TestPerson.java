package Q2;

import java.util.Arrays;

public class TestPerson 
{

    public static void main(String[] args) 
    {
        Person people[] = new Person[2];

        Student s1 = new Student("Adam", "Drawing");
        people[0] = s1;

        String[] student1 = {"Name = " + s1.getName() , "Course = " + s1.getDescription()};

        System.out.println("Student 1 = " + Arrays.toString(student1));
     


        Employee e1 = new Employee("Mary", 40000.5);
        people[1] = e1;

        String[] employee1 = {e1.getName()};
        double[] employee = {e1.getAnnualSalary()};
    
        System.out.println("Employee 1 name = " + Arrays.toString(employee1));
        System.out.println("Employee 1 Salary = " + Arrays.toString(employee));

        System.out.println("--------------------------------------------------");

        System.out.println("Student 1 information = " + Arrays.toString(student1));
        System.out.println("Employee 1 information = " +  Arrays.toString(employee1) +  Arrays.toString(employee));






        //System.out.println(people[0]);

        //System.out.println(people[1]);


        /* 
        System.out.println(people[0].s1.getName());
        System.out.println(people[0].s1.getDescription());

        System.out.println(people[1].e1.getName());
        System.out.println(people[1].e1.getDescription());
        */


        //System.out.println(s1.getName());
        //System.out.println(s1.getDescription());

        //System.out.println(e1.getName());
        //System.out.println(e1.getDescription());
    }    
    
}


    

  
