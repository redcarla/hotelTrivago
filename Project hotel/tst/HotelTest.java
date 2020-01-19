import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    Hotel Trivago = new Hotel();
    Client client512 = new Client("Ramon Brakels", "17-11-1997", "Bolsterlaan 23, 7876GA Valthermond");
    Room lux = new Luxury(2,true,23);
    Reservation res1;


    @Test
    void getTotalCapacity()  {
        Trivago.addRoom(lux);
        assertEquals(Trivago.getTotalCapacity(), 2);
    }

    @Test
    void addRoom() {
        ArrayList<Room> rooms = new ArrayList<>();
        Trivago.addRoom(lux);
        rooms.add(lux);
        assertEquals(rooms, Trivago.getRooms());
    }


    @Test
    void addClient() {
        ArrayList<Client> clients = new ArrayList<>();
        Trivago.addClient(client512);
        clients.add(client512);
        assertEquals(clients, Trivago.getClients());
    }

    @Test
    void tooManyPeopleError() throws RoomException {
        Trivago.addRoom(lux);
        try {
            res1 = new Reservation(1,
                    "12-01-2020", Trivago.getRooms(), "14-01-2020",
                    false, true, 5, 0);
        } catch(RoomException err){
            assertEquals(err.getMessage(), "Too many people for the amount of rooms. Please add more rooms.");
        }
    }

    @Test
    void getRevenue(){
        Trivago.addRoom(lux);
        try {
            res1 = new Reservation(1,
                    "12-01-2020", Trivago.getRooms(), "14-01-2020",
                    false, true, 1, 0);
        } catch(RoomException err){
            assertEquals(err.getMessage(), "Too many people for the amount of rooms. Please add more rooms.");
        }
        client512.addReservation(res1);
        Trivago.addClient(client512);
        assertEquals(600.0, Trivago.getRevenue());
    }

    @Test
    void getRevenueForClient(){
        Trivago.addRoom(lux);
        try {
            res1 = new Reservation(1,
                    "12-01-2020", Trivago.getRooms(), "14-01-2020",
                    false, true, 1, 0);
        } catch(RoomException err){
            System.out.println(err.getMessage());
        }
        client512.addReservation(res1);
        Trivago.addClient(client512);
        assertEquals(600.0, Trivago.getRevenueForClient(client512));
    }
}