public class Luxury extends Room {

    public static final float SIZE = 18.0f;
    public static final double PRICE = 300.0;

    public Luxury(int maxCapacity, boolean available, int roomNum) {
        super(maxCapacity,available, roomNum);
    }
    public double getPricePerNight(){
        return PRICE;
    }
    public float getSize(){
        return SIZE;
    }
}
