

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client1 = new Client("Carla Redmond","09-11-1996", "Bargeres");
    Hotel hotel1 = new Hotel();
    Room lux = new Luxury(3,2,false,1,99.00);

    @Test
    void addReservation() throws RoomError {
        hotel1.addRoom(lux);
        Reservation res1 = new Reservation(1,
                "12-01-2020", hotel1.rooms, "14-01-2020",
                false, true, 3, 0);
        client1.addReservation(res1);
        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(res1);
        assertEquals(client1.reservations, reservations);
    }

    @Test
    void getClientName() {
        assertEquals("Carla Redmond", client1.getClientName());
    }

    @Test
    void setClientName() {
        client1.setClientName("Ramon Brakels");
        assertEquals("Ramon Brakels", client1.getClientName());
    }

    @Test
    void getDateOfBirth() {
        assertEquals("09-11-1996", client1.getDateOfBirth());
    }

    @Test
    void setDateOfBirth() {
        client1.setDateOfBirth("17-11-1997");
        assertEquals("17-11-1997", client1.getDateOfBirth());
    }

    @Test
    void getAddress() {
        client1.setAddress("Valthermond");
        assertEquals("Valthermond", client1.getAddress());
    }

    /**
     * @// TODO: 15/01/2020 MAKE GETREVENUE IN HOTEL.
     *
     */
    @Test
    void getRevenue() {
    }
}