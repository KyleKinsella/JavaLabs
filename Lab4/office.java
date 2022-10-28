public class office {

    static int room_Numbers = 3;
    private int office_record1;
    private int office_record2;
    private int office_record3;
    private int assigned;

    public office() {

    }

    public void setOfficeNum(int office_record1) {
        this.office_record1 = office_record1;
    }

    public int getOfficeNum() {
        room_Numbers = 100;
        return room_Numbers;
    }

    public void setOfficeNum2(int office_record2) {
        this.office_record2 = office_record2;
    }

    public int getOfficeNum2() {
        setOfficeNum2(101);
        return office_record2;
    }



    public void setOfficeNum3(int office_record3) {
        this.office_record3 = office_record3;
    }

    public int getOfficeNum3() {
        setOfficeNum3(102);
        return office_record3;
    }


    public void setAssigned(int assigned) {
        this.assigned = assigned;
    } 

    public int getAssigned() {
        int max_employee;

        max_employee = 2;

        if(assigned <= max_employee) {
            System.out.println("Maximum 2 people in an office !");
        }
        
        return max_employee;
    } 
}
