public class HotelRoom {
    public int roomNumber;
    private String roomType;
    private int vacant = 0;
    private int occupied = 1;
    private double rate;

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


    //Setter RoomNum
    public void setRoomNum(int number) {
        roomNumber = number;
    }

    //Setter RoomType
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



     //Rate Setter
     public void setRate(double Rate) {
        this.rate = rate;
    }

    //Rate Getter
    public double getRate(double Rate) {
        return Rate;
    }


    //Setter
    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

    //Getter
    public int getOccupied(int occupied) {
        return occupied;
    }


    //Setter 
    public void setVacant(int Vacant) {
        this.vacant = vacant;
    }


    //Getter
    public int getVacant(int Vacant) {
        return Vacant;
    }

    
    //Setter
    public void setisOccupied(int occupied) {
        this.occupied = occupied;
    }

    //Getter
    public int getisOccupied(int occupied) {
        return occupied;
    } 




    public boolean isOccupied() {
        if(occupied == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}