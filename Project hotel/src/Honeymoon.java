public class Honeymoon extends Room {
    public static final float SIZE = 20.0f;
    public static final double PRICE = 500.0;
    public Honeymoon(int maxCapacity, boolean available, int roomNum) {
        super(maxCapacity,available, roomNum);
    }
    public double getPricePerNight(){
        return PRICE;
    }
    public float getSize(){
        return SIZE;
    }

}
