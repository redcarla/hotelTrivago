import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room lux = new Luxury(4,true,1);
    Room delux = new Deluxe(3,false, 3);
    Room honeymoon = new Honeymoon(2,true,21);
    Room presidential = new Presidential(2,false,4);
    Room standard = new Standard(2,true,59);

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


        assertEquals(18.0f,lux.getSize());
        assertEquals(15.0f,delux.getSize());
        assertEquals(20.0f,honeymoon.getSize());
        assertEquals(100.0f,presidential.getSize());
        assertEquals(12.0f,standard.getSize());
    }



    @Test
    void setAvailable() {
        lux.setAvailable(false);
        delux.setAvailable(true);
        honeymoon.setAvailable(false);
        presidential.setAvailable(true);
        standard.setAvailable(false);

        assertEquals(false,lux.isAvailable());
        assertEquals(true,delux.isAvailable());
        assertEquals(false,honeymoon.isAvailable());
        assertEquals(true,presidential.isAvailable());
        assertEquals(false,standard.isAvailable());
    }

    @Test
    void getRoomNum() {
    }

    @Test
    void setRoomNum() {
        lux.setRoomNum(2);
        delux.setRoomNum(4);
        honeymoon.setRoomNum(6);
        presidential.setRoomNum(7);
        standard.setRoomNum(8);

        assertEquals(2,lux.getRoomNum());
        assertEquals(4,delux.getRoomNum());
        assertEquals(6,honeymoon.getRoomNum());
        assertEquals(7,presidential.getRoomNum());
        assertEquals(8,standard.getRoomNum());
    }

    @Test
    void getPricePerNight() {
    }

    @Test
    void setPricePerNight() {

        assertEquals(300.0,lux.getPricePerNight());
        assertEquals(200.0,delux.getPricePerNight());
        assertEquals(500.0,honeymoon.getPricePerNight());
        assertEquals(1000.0,presidential.getPricePerNight());
        assertEquals(100.0,standard.getPricePerNight());
    }
}