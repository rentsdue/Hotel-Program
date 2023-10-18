package main.java.com.example;

public class Room {
    private int occupancy;
    private double price;
    private boolean occupied;

    public Room(int occupancy, double price, boolean occupied) {
        this.occupancy=occupancy;
        this.price=price;
        this.occupied=occupied;
    }

    public int getOccupancy() {
        return this.occupancy;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getOccupied() {
        return this.occupied;
    }

    public void setOccupancy(int newOccupancy) {
        this.occupancy=newOccupancy;
    }

    public void setPrice(int newPrice) {
        this.price=newPrice;
    }

    public void setOccupied(boolean newOccupied) {
        this.occupied=newOccupied;
    }
}
