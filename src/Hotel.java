import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hotel {

    ArrayList<Room> rooms;
    HashMap<Reservation, Client> clientRes; //do we still need the hashet and arraylist then?
    HashSet<Reservation> reservations;
    ArrayList<Client> clients;

    public Hotel(){
        rooms = new ArrayList<Room>();
        reservations = new HashSet<Reservation>();
        clients = new ArrayList<Client>();

    }
    public int getTotalCapacity(){return 0;}
    public void addRoom(Room newRoom){
        rooms.add(newRoom);
    }
    public void addReservation(Reservation newReservation){
        reservations.add(newReservation);
    }
    public void addClient(Client newClient){
        clients.add(newClient);
    }

}
