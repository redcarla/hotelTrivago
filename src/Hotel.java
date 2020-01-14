//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList();
    HashSet<Reservation> reservations = new HashSet();
    ArrayList<Client> clients = new ArrayList();

    public Hotel() {
    }

    public int getTotalCapacity() {
        Room r;
        int totalCapacity = 0;
        for (Iterator iterator1 = rooms.iterator(); iterator1.hasNext(); totalCapacity += r.getMaxCapacity()) {
            r = (Room) iterator1.next();
        }
        return totalCapacity;
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
