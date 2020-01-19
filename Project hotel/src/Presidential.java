public class Presidential extends Room {

    public static final float SIZE = 100.0f;
    public static final double PRICE = 1000.0;

    public Presidential(int maxCapacity, boolean available, int roomNum) {
        super(maxCapacity, available, roomNum);
    }
    public double getPricePerNight(){
        return PRICE;
    }
    public float getSize(){
        return SIZE;
    }

}
