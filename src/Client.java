//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;

public class Client implements Revenue {
    String clientName;
    String dateOfBirth;
    String address;
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
        return 0.0D;
    }
}
