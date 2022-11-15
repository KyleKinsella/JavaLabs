public class Student extends Person{
    private int numOfCources;
    private int[] grades;
    private String[] courses;

     //Inheritance
    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade(String string, int grade) {
        //addCourseGrade("Systems Analysis", 100);
        //addCourseGrade(string, grade);
    }

    public void printGrades() {
        //System.out.println("Here is your grades: " + Arrays.toString(grades));
    }

    public void averageGrade() {
      double a;
      double b;
      double average;

      a = 92;
      b = 68;

      average = a + b;

      average = average / 2;

      System.out.println("Your Average grade is -> " + average);
    }


    public int getAverageGrade() {
        return numOfCources;
    }

   public void loop() {
       int i;
       for(i=0;i<courses.length; i++) {
           
       }
   }

    public String toString() {
        return "Student: " + getName() + " <" + getAddress() + ">" + courses + " " + grades;
    }
}

    

