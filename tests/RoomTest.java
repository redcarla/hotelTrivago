import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    Room lux = new Luxury(4,2,true,1,99.00);
    Room delux = new Deluxe(3,2,false,1,79.00);
    Room honeymoon = new Honeymoon(2,2,true,1,219.00);
    Room presidential = new Presidential(2,2,false,1,199.00);
    Room standard = new Standard(2,2,true,1,59.00);



    @Test
    void setMaxCapacity() {
        lux.setMaxCapacity(3);
        delux.setMaxCapacity(2);
        honeymoon.setMaxCapacity(2);
        presidential.setMaxCapacity(3);
        standard.setMaxCapacity(3);

        assertEquals(3,lux.getMaxCapacity());
        assertEquals(2,delux.getMaxCapacity());
        assertEquals(2,honeymoon.getMaxCapacity());
        assertEquals(3,presidential.getMaxCapacity());
        assertEquals(3,standard.getMaxCapacity());
    }


    @Test
    void getSize() {
        lux.setSize(14.8f);
        delux.setSize(9.2f);
        honeymoon.setSize(9.9f);
        presidential.setSize(50.2f);
        standard.setSize(8.2f);

        assertEquals(14.8f,lux.getSize());
        assertEquals(9.2f,delux.getSize());
        assertEquals(9.9f,honeymoon.getSize());
        assertEquals(50.2f,presidential.getSize());
        assertEquals(8.2f,standard.getSize());
    }



    @Test
    void isAvailable() {
    }

    @Test
    void setAvailable() {
    }

    @Test
    void getRoomNum() {
    }

    @Test
    void setRoomNum() {
    }

    @Test
    void getPricePerNight() {
    }

    @Test
    void setPricePerNight() {
    }
}