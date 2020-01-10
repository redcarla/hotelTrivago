import java.util.ArrayList;

public class Client implements Revenue{
    String clientName;
    String dateOfBirth; //need to change this in class diagram
    String address;
    ArrayList<Reservation> reservations;

    public Client(String clientName, String dateOfBirth, String address){
    this.clientName = clientName;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    reservations = new ArrayList<Reservation>();
    }

    public void addReservation(Reservation newReservation){
        reservations.add(newReservation);
    }
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public double getRevenue() {
        return 0;
    }
}
