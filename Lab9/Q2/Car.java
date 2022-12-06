public class Car extends RoadVehicle {

    int doors;
    int wheels;

    public Car(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

    public void setCarWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCarWheels() {
        return wheels;
    }

    public void setCarDoors(int doors) {
        this.doors = doors;
    } 

    public int getCarDoors() {
        return doors;
    }

    @Override
    public double calculateDuty() {
        // TODO Auto-generated method stub
        return wheels * 1.25;
    }
    
}
