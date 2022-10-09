public class Hotel {
    public static void main(String[] args) {
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        //Q3
        HotelRoom roomC = new HotelRoom();
        roomC.setRoomNumber(202);
        roomC.setVacant(0);
        roomC.setRate(90.0);
        roomC.setRoomType("Single bed,");


        roomA.setRoomNumber(200);
        roomA.setRoomType("Single bed,");
        roomA.setOccupied(1);
        roomA.setRate(100.0);
        
        //RoomA
        System.out.println("Your room number is " + roomA.getRoomNumber() + " it is a " + roomA.getRoomType() + 
        " it is currently " + roomA.getOccupied(1) + " (Occupied) "+ " the rate charged is " + roomA.getRate(100.0));


        roomB.setRoomNumber(201);
        roomB.setRoomType("Double bed,");
        roomB.setVacant(0);
        roomB.setRate(80.0);

        //RoomB
        System.out.println("Your room number is " + roomB.getRoomNumber() + " it is a " + roomB.getRoomType() 
        + " it is currently " + roomB.getVacant(0) + " (Non-Occupied) " + " the rate charged is " + roomB.getRate(80.0) + " the room is " + roomB.getVacant(0) + " = " + false); // called roomB.isOccupied() method but returned true!

        //Q4
        if(roomB.isOccupied()) {
            System.out.println("RoomB is " + roomB.isOccupied() + " = " + roomB.getOccupied(1));
        }
        else {
            System.out.println("RoomB is currently " + roomB.getVacant(0));
            roomB.setOccupied(1);
            System.out.println("RoomB is now " + roomB.isOccupied() + " = " + roomB.getOccupied(1));
        }

        //RoomC
        System.out.println("Your room number is " + roomC.getRoomNumber() + " it is a " + roomC.getRoomType() 
        + " it is currently " + roomC.getVacant(0) + " (Non-Occupied) " + " the rate charged is " + roomC.getRate(90.0));
    }
}
