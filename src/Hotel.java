//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList();
    HashSet<Reservation> reservations = new HashSet();
    ArrayList<Client> clients = new ArrayList();

    public Hotel() {
    }

    public int getTotalCapacity() {
        return 0;
    }

    public void addRoom(Room newRoom) {
        this.rooms.add(newRoom);
    }

    public void addReservation(Reservation newReservation) {
        this.reservations.add(newReservation);
    }

    public void addClient(Client newClient) {
        this.clients.add(newClient);
    }
}
