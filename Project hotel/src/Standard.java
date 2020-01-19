public class Standard extends Room {
    public static final float SIZE = 12.0f;
    public static final double PRICE = 100.0;
    public Standard(int maxCapacity,  boolean available, int roomNum) {
        super(maxCapacity, available, roomNum);
    }
    public double getPricePerNight(){
        return PRICE;
    }
    public float getSize(){
        return SIZE;
    }

}
