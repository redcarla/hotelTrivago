abstract class Room {
    private int maxCapacity;
    private boolean available;
    private int roomNum;

    public Room(int maxCapacity, boolean available, int roomNum) {
        this.maxCapacity = maxCapacity;
        this.available = available;
        this.roomNum = roomNum;

    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getRoomNum() {
        return this.roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public abstract double getPricePerNight();
    public abstract float getSize();
}

