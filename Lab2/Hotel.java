public class Hotel {
    public static void main(String[] args) {
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        HotelRoom roomC = new HotelRoom();
        roomC.setRoomNumber(202);
        roomC.setVacant(0);
        roomC.setRate(90.0);
        roomC.setRoomType("Single bed,");





        roomA.setRoomNumber(200);
        roomA.setRoomType("Single bed,");


        roomA.setOccupied(1);
        roomA.setRate(100.0);
        System.out.println("Your room number is " + roomA.getRoomNumber() + " it is a " + roomA.getRoomType() + 
        " it is currently " + roomA.getOccupied(1) + " (Occupied) "+ " the rate charged is " + roomA.getRate(100.0));


        roomB.setRoomNumber(201);
        roomB.setRoomType("Double bed,");

        roomB.setVacant(0);
        roomB.setRate(80.0);
        System.out.println("Your room number is " + roomB.getRoomNumber() + " it is a " + roomB.getRoomType() 
        + " it is currently " + roomB.getVacant(0) + " (Non-Occupied) " + " the rate charged is " + roomB.getRate(80.0));
       
        

        System.out.println("Your room number is " + roomC.getRoomNumber() + " it is a " + roomC.getRoomType() 
        + " it is currently " + roomC.getVacant(0) + " (Non-Occupied) " + " the rate charged is " + roomC.getRate(90.0));

        /*
         roomA.getRoomNumber1() + " and it is a " + roomA.getRoomType());        //+ " Rate charged " + roomA.getRate(100.0));

        roomB.getRoomType();
        System.out.println("Your room number is " + roomB.getRoomNumber+ " and it is a " + roomB.getRoomType());           //+ " Rate charged " + roomB.getRate(200.0));
         */
    }
}
