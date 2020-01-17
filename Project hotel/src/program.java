import java.util.ArrayList;

public class program {
    private static ArrayList<Room> rooms;

    public program() {
    }

    public static void main(String[] args) throws RoomException {
        rooms = new ArrayList();
        Luxury b = new Luxury(1, 1.0F, false, 10, 10.0D);
        Luxury c = new Luxury(3, 3.0F, false, 20, 5.0D);
        rooms.add(b);
        rooms.add(c);

        //try {
         //   new Reservation(1, "11-11-2020", rooms, "11-12-2020", false, true, 5, 0);
        //} catch (RoomError var4) {
         //   System.out.println(var4.getMessage());
        //}

    }
}
