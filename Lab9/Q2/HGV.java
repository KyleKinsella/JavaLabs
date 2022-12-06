public class HGV extends RoadVehicle{

    int doors;
    int wheels;

    public HGV(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

    public void setHGVWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getHGVWheels() {
        return wheels;
    }

    public void setHGVDoors(int doors) {
        this.doors = doors;
    } 

    public int getHGVDoors() {
        return doors;
    }
    @Override
    public double calculateDuty() {
        // TODO Auto-generated method stub
        return wheels * 1.25;
    }
    
}
