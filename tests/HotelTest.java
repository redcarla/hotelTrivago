import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    Hotel hotel1 = new Hotel();
    Client client1 = new Client("Ramon Brakels", "17-11-1997", "Bolsterlaand 23, 7876GA Valthermond");
    Room lux = new Luxury(2,2,false,23,99.00);
    

    @Test
    void getTotalCapacity()  {
        hotel1.addRoom(lux);
        assertEquals(hotel1.getTotalCapacity(), 2);

    }

    @Test
    void addRoom() {
        ArrayList<Room> rooms = new ArrayList<>();
        hotel1.addRoom(lux);
        rooms.add(lux);
        assertEquals(rooms, hotel1.rooms);
    }

    @Test
    void addReservation() throws RoomError {
        hotel1.addRoom(lux);
        Reservation res1 = new Reservation(1,client1,
                "12-01-2020", hotel1.rooms,"14-01-2020",
                false, true,1,0);
        hotel1.addReservation(res1);

    }

    @Test
    void addClient() {
        ArrayList<Client> clients = new ArrayList<>();
        hotel1.addClient(client1);
        clients.add(client1);
        assertEquals(clients, hotel1.clients);
    }

    @Test
    void tooManyPeopleError() throws RoomError{
        hotel1.addRoom(lux);
        try {
            Reservation res1 = new Reservation(1, client1,
                    "12-01-2020", hotel1.rooms, "14-01-2020",
                    false, true, 5, 0);
        } catch(RoomError err){
            assertEquals(err.getMessage(), "Too many people for the amount of rooms. Please add more rooms.");
        }
    }
}