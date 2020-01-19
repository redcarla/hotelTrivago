import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Reservation implements Revenue {
    private int reservationNum;
    private String startDate;
    private String endDate;
    private boolean breakfast;
    private boolean insurance;
    private ArrayList<Room> rooms;
    private int noOfAdults;
    private int noOfChildren;

    public Reservation(int reservationNum, String startDate, ArrayList<Room> rooms, String endDate, boolean breakfast, boolean insurance, int noOfAdults, int noOfChildren) throws RoomException {
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
        for(Iterator iterator1 = rooms.iterator(); iterator1.hasNext(); totalCapacity += r.getMaxCapacity()) {
            r = (Room)iterator1.next();
        }

        if (totalCapacity < this.noOfAdults + this.noOfChildren) {
            throw new RoomException("Too many people for the amount of rooms. Please add more rooms.");
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
        int totalPrice = 0;
        for(Room room : rooms){
            totalPrice += room.getPricePerNight();
        }
        return totalPrice * daysDifference();
    }

    public float daysDifference(){
        SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
        float days = 0.0f;
        try {
            Date date1 = myFormat.parse(this.startDate);
            Date date2 = myFormat.parse(this.endDate);
            long diff = date2.getTime() - date1.getTime();
            days = (diff / (1000*60*60*24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}
