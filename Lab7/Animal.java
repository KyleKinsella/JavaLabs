public class Animal {

    private String age;
    private char gender;

    public Animal() {
        
    }

    public void setAge(String age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void makeSound() {
        System.out.println("A generic animal sound");
    }
}
