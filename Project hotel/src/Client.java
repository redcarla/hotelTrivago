import java.util.ArrayList;

public class Client implements Revenue {
    private String clientName;
    private String dateOfBirth;
    private String address;
    ArrayList<Reservation> reservations;

    public Client(String clientName, String dateOfBirth, String address) {
        this.clientName = clientName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.reservations = new ArrayList();
    }

    public void addReservation(Reservation newReservation) {
        this.reservations.add(newReservation);
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public double getRevenue() {
        int totalPrice = 0;
        for(Reservation reservation : reservations){
            totalPrice += reservation.getRevenue();
        }
        return totalPrice;
    }
}
