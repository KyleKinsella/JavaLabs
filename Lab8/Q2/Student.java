package Q2;

public class Student extends Person{

    private String name;
    private String course;

    public Student(String name, String course) {
        super(name);

        this.name = name;
        this.course = course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }


    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "A student studying : " + getCourse();
    }

}

