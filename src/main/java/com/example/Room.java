package main.java.com.example;
import java.util.ArrayList;

public class Room {
    private int occupancy;
    private double price;
    private boolean occupied;
    private String name;
    private ArrayList<Guest> guestList;
    

    public Room(int occupancy, double price, boolean occupied, String name) {
        this.occupancy=occupancy;
        this.price=price;
        this.occupied=occupied;
        this.name=name;
        this.guestList= new ArrayList<Guest>();
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

    public ArrayList<Guest> getGuestList() {
        return this.guestList;
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

    public void setGuestList(ArrayList<Guest> a) {
        this.guestList=a;
    }

    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

}
