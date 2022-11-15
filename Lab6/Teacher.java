public class Teacher extends Student{

    //Inheritance
    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if(addCourse()) {
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean removeCourse(String course) {
        if(removeCourse()) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toStringTeacher() {
        return "Teacher: " + getName() + " <" + getAddress() + ">";
    }

    public boolean addCourse() {
        return true;
    }

    public boolean removeCourse() {
        return true;
    }
}