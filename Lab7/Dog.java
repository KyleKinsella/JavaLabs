public class Dog extends Animal {
    private String dog;
    private String breed;
    private int age;
    private char gender;
    private String animal;

    public Dog() {
    }

    public Dog(String breed, int age, char gender) {
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setDogAge(int age) {
        this.age = age;
    }

    public int getDogAge() {
        return age;
    }

    public void setDogGender(char gender) {
        this.gender = gender;
    }

    public char getDogGender() {
        return gender;
    }

    public String isDog() { 
        if(animal == dog) {
           return "Dog has been vaccinated: " + getBreed() + " " + getDogAge() + "  " + getDogGender();
        }
        else {
           return "Dog has not been vaccinated, or you dont have a Dog";
        }
       }

    public String toString() {
        return "Your Dogs breed is a " + getBreed() + "," + " your Dog is " + getDogAge() + " Years old," + " your Dogs gender is " + getDogGender();
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void makeSound() {
        System.out.println("Wofffffffffffffff");
    }
}
