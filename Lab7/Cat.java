public class Cat extends Animal{
    private String cat;
    private String name;
    private int age;
    private char gender;
    private String animal;
    
    public Cat() {
    }

    public Cat(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setCatName(String name) {
        this.name = name;
    }

    public String getcatName() {
        return name;
    }

    public void setCatAge(int age) {
        this.age = age;
    }

    public int getCatAge() {
        return age;
    }

    public void setCatGender(char gender) {
        this.gender = gender;
    }

    public char getCatGender() {
        return gender;
    }

    public String isCat() {
        if(animal == cat) {
           return "Cat has been vaccinated: " + getcatName() + " " + getCatAge() + " " + getCatGender();
        }
        else {
           return "Cat has not not been vaccinated, or you dont have a Cat";
        }
       }

    public String toString() {
        return "The name of your Cat is " + getcatName() + "," + " your Cat is " + getCatAge() + " Years old, " + " your cat is a " + getCatGender();
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void makeSound() {
        System.out.println("Meowwwwwwwwwwwwwwww");
    }
}
