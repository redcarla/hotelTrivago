abstract class Room implements Revenue {
    int maxCapacity;
    float size;
    boolean available;
    int roomNum;
    double pricePerNight;


    public Room(int maxCapacity, float size, boolean available, int roomNum, double pricePerNight){

        this.maxCapacity = maxCapacity;
        this.size = size;
        this.available = available;
        this.roomNum = roomNum;
        this.pricePerNight = pricePerNight;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

}
