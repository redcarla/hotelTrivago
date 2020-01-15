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
        lux.setPricePerNight(200.0);
        delux.setPricePerNight(150.0);
        honeymoon.setPricePerNight(280.0);
        presidential.setPricePerNight(500.0);
        standard.setPricePerNight(100.0);

        assertEquals(200.0,lux.getPricePerNight());
        assertEquals(150.0,delux.getPricePerNight());
        assertEquals(280.0,honeymoon.getPricePerNight());
        assertEquals(500.0,presidential.getPricePerNight());
        assertEquals(100.0,standard.getPricePerNight());
    }
}