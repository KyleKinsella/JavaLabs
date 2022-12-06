public class RoadDriver {

    public static void main(String[] args) {
        
        Car V1 = new Car(4, 4);
        HGV V2 = new HGV(18,2);

        System.out.println("Car -> " + "Car has " + V1.getCarWheels() + " wheels" + ", " + "Car has " + V1.getCarDoors() + " doors.");

        System.out.println("HGV -> " + "HGV has " + V2.getHGVWheels() + " wheels" + ", " + "HGV has " + V2.getHGVDoors() + " doors.");

        System.out.println("--------------------------------------------------------");

        System.out.println("Below are the import duty prices for each road vechicle:");
        System.out.println("Car Import Duty: " + V1.calculateDuty());
        System.out.println("HGV Import Duty: " + V2.calculateDuty());

        System.out.println("--------------------------------------------------------");
    }
}
