
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    Room lux = new Luxury(3,false,1);
    Hotel Trivago = new Hotel();
    Reservation res1;
    Client client1 = new Client("Ramon Brakels", "17-11-1997", "Bolsterlaan 23, 7876GA Valthermond");

    @BeforeEach
    void beforeEachMethod() {
        Trivago.addRoom(lux);

        try {
            res1 = new Reservation(1,
                    "12-01-2020", Trivago.getRooms(), "14-01-2020",
                    false, true, 3, 0);
        } catch (RoomException roomError) {
            roomError.printStackTrace();
        }

    }

    @Test
    void setReservationNum() {
        res1.setReservationNum(2);
        assertEquals(2,res1.getReservationNum());
    }

    @Test
    void setStartDate() {
        res1.setStartDate("12-12-2019");
        assertEquals("12-12-2019", res1.getStartDate());
    }

    @Test
    void getEndDate() {
    }

    @Test
    void setEndDate() {
        res1.setEndDate("15-12-2019");
        assertEquals("15-12-2019", res1.getEndDate());
    }

    @Test
    void isBreakfast() {
        res1.setBreakfast(true);
        assertEquals(true, res1.isBreakfast());
    }


    @Test
    void isInsurance() {
        res1.setInsurance(false);
        assertEquals(false, res1.isInsurance());
    }


    @Test
    void setNoOfAdults() {
        res1.setNoOfAdults(2);
        assertEquals(2, res1.getNoOfAdults());
    }

    @Test
    void setNoOfChildren() {
        res1.setNoOfChildren(1);
        assertEquals(1, res1.getNoOfChildren());
    }

    @Test
    void getRevenue() {
        assertEquals(600.0,res1.getRevenue());
    }
}