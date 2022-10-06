public class HotelRoom {
    public int roomNumber;
    private String roomType;

    private int vacant = 0;
    private int occupied = 1;
    private double rate;

    private boolean Occ;

    public HotelRoom() { 
        setRoomNumber(0);
        setRoomType("");
    }


    //Q3
    public HotelRoom(int roomNumber, int Occupied, double rate, String roomType) {
        setRoomNumber(0);
        setOccupied(1);
        setRate(0);
        setRoomType("");
    }


    public void setRoomNum(int number) {
        roomNumber = number;

        //roomA = occupied;
        //rate = 100.0;
    }


    public void setroomNum(int roomB) {
        setRoomNumber(201);
        setRoomType("Double bed.");

        //roomB = vacant;
        //rate = 80.0;
    }

   

    //Setter
    public void setRoomType(String RoomType) {
        this.roomType = RoomType;
    }


    //Setter
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    } 


   
    //Getter
    public int getRoomNumber() {
        return roomNumber;
    }


     //Getter
     public String getRoomType() {
        return roomType;
    }









   
    

    //Rate setter
    public double getRate(double Rate) {
        return Rate;
    }


    public void setRate(double Rate) {
        this.rate = rate;
    }




    //Occupied setter
    public int getOccupied(int occupied) {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }



    //Vacant setter
    public int getVacant(int Vacant) {
        return Vacant;
    }

    public void setVacant(int Vacant) {
        this.vacant = vacant;
    }




    //Setter
    public void setisOccupied(int occupied) {
        this.occupied = occupied;
    }


    //Getter
    public int getisOccupied(int occupied) {
        return occupied;
    } 

   /*  
    if(getisOccupied == getVacant) {
        getOccupied(occupied);
        System.out.println("True");
    }
    else {
        getVacant(vacant);
        System.out.println("False");
    } 
    
    */

}//}