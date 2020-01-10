import java.util.ArrayList;

public class Reservation implements Revenue{
    int reservationNum;
    String startDate;
    String endDate;
    boolean breakfast;
    boolean insurance;
    ArrayList<Room> rooms;
    int noOfAdults;
    int noOfChildren;

    public Reservation(int reservationNum, String startDate, String endDate, boolean breakfast, boolean insurance, int noOfAdults, int noOfChildren){
        this.reservationNum = reservationNum;
        this.startDate = startDate;
        this.endDate = endDate;
        this.breakfast = breakfast;
        this.insurance = insurance;
        rooms = new ArrayList<Room>();
        this.noOfAdults = noOfAdults;
        this.noOfChildren = noOfChildren;

    }

    public int getReservationNum() {
        return reservationNum;
    }

    public void setReservationNum(int reservationNum) {
        this.reservationNum = reservationNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public int getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    @Override
    public double getRevenue() {
        return 0;
    }
}
