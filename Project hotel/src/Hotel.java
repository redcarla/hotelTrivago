import java.util.ArrayList;
import java.util.Iterator;

public class Hotel {
    private ArrayList<Room> rooms = new ArrayList();
    private ArrayList<Client> clients = new ArrayList();

    public Hotel() {
    }

    public int getTotalCapacity() {
        Room r;
        int totalCapacity = 0;
        for (Iterator iterator1 = getRooms().iterator(); iterator1.hasNext(); totalCapacity += r.getMaxCapacity()) {
            r = (Room) iterator1.next();
        }
        return totalCapacity;
    }


    public void addRoom(Room newRoom) {
        this.getRooms().add(newRoom);
    }


    public void addClient(Client newClient) {
        this.getClients().add(newClient);
    }

    public double getRevenue(){
        double totalRevenue = 0.0;
        for(Client client : getClients()){
            totalRevenue += client.getRevenue();
        }
        return totalRevenue;
    }

    public double getRevenueForClient(Client inputClient){
        double clientRevenue = 0.0;
        for(Client client : getClients()){
            if(client == inputClient){
                clientRevenue = client.getRevenue();
            }
        }
        return clientRevenue;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
