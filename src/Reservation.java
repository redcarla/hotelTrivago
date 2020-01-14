//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class Reservation implements Revenue {
    int reservationNum;
    String startDate;
    String endDate;
    boolean breakfast;
    boolean insurance;
    ArrayList<Room> rooms;
    int noOfAdults;
    int noOfChildren;

    public Reservation(int reservationNum, String startDate, ArrayList<Room> rooms, String endDate, boolean breakfast, boolean insurance, int noOfAdults, int noOfChildren) throws RoomError {
        this.reservationNum = reservationNum;
        this.startDate = startDate;
        this.endDate = endDate;
        this.breakfast = breakfast;
        this.insurance = insurance;
        this.rooms = rooms;
        this.noOfAdults = noOfAdults;
        this.noOfChildren = noOfChildren;
        int totalCapacity = 0;

        Room r;
        for(Iterator var10 = rooms.iterator(); var10.hasNext(); totalCapacity += r.getMaxCapacity()) {
            r = (Room)var10.next();
        }

        if (totalCapacity < this.noOfAdults + this.noOfChildren) {
            throw new RoomError("Too many people for the amount of rooms. Please add more rooms.");
        }
    }

    public int getReservationNum() {
        return this.reservationNum;
    }

    public void setReservationNum(int reservationNum) {
        this.reservationNum = reservationNum;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isBreakfast() {
        return this.breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isInsurance() {
        return this.insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public int getNoOfAdults() {
        return this.noOfAdults;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public int getNoOfChildren() {
        return this.noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public double getRevenue() {
        return 0.0D;
    }
}
