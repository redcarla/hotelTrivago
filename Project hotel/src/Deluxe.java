public class Deluxe extends Room {
    public static final float SIZE = 15.0f;
    public static final double PRICE = 200.0;
    public Deluxe(int maxCapacity, boolean available, int roomNum) {
        super(maxCapacity, available, roomNum);
    }

    public double getPricePerNight(){
        return PRICE;
    }
    public float getSize(){
        return SIZE;
    }
}
