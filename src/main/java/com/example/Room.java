package main.java.com.example;

public class Room {
    private int occupancy;
    private double price;
    private boolean occupied;
    private String name;

    public Room(int occupancy, double price, boolean occupied, String name) {
        this.occupancy=occupancy;
        this.price=price;
        this.occupied=occupied;
        this.name=name;
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

    public String getName() {
        return this.name;
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

    public void setName(String newName) {
        this.name=newName;
    }
}
