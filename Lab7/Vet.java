public class Vet extends Dog{
    
    private String vaccinate;
    private String name;
    private String Animal;

    public Vet() {
        
    }

    public Vet(String name) {
        this.name = name;
    }

    public String getVetName() {
        return name;
    }

    public void setVaccinate(String Animal) {
        setVaccinate(Animal);
        //this.vaccinate = vaccinate;
        this.Animal = Animal;
    }

    public String getVaccinate() {
        System.out.println("Your dog and cat have been vaccinated ! ");
        return vaccinate;
    }

    public String toString() {
        return "Vets name is " + getVetName() + " is vaccinating ";
    }
}


