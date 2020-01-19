

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client512 = new Client("Carla Redmond","09-11-1996", "Bargeres");
    Hotel Trivago = new Hotel();
    Room lux = new Luxury(3,false,50);

    @Test
    void addReservation() throws RoomException {
        Trivago.addRoom(lux);
        Reservation res1 = new Reservation(1,
                "12-01-2020", Trivago.getRooms(), "14-01-2020",
                false, true, 3, 0);
        client512.addReservation(res1);
        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(res1);
        assertEquals(client512.reservations, reservations);
    }

    @Test
    void getClientName() {
        assertEquals("Carla Redmond", client512.getClientName());
    }

    @Test
    void setClientName() {
        client512.setClientName("Ramon Brakels");
        assertEquals("Ramon Brakels", client512.getClientName());
    }

    @Test
    void getDateOfBirth() {
        assertEquals("09-11-1996", client512.getDateOfBirth());
    }

    @Test
    void setDateOfBirth() {
        client512.setDateOfBirth("17-11-1997");
        assertEquals("17-11-1997", client512.getDateOfBirth());
    }

    @Test
    void getAddress() {
        client512.setAddress("Valthermond");
        assertEquals("Valthermond", client512.getAddress());
    }

    @Test
    void getRevenue() {
    }
}