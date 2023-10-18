package main.java.com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Sets up hotel with rooms
        Hotel pitbull= new Hotel("APCSA");
        Room economyRoom= new Room(2, 420, false);
        Room deluxeRoom= new Room (2, 6900, false);
        Room theBestRoom= new Room (2, 123456789, false);
        ArrayList <Room> theBestList= new ArrayList<Room>();

       //Adds the rooms to the hotel//
        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theBestRoom);
        pitbull.setRoomList(theBestList);

        //Printing stuff to make sure it works
        System.out.println(pitbull.getName());
        for (Room room: pitbull.getRoomList()) {
            System.out.println(room.getOccupancy());
            System.out.println(room.getPrice());
            System.out.println(room.getOccupied());
        }
        
        pitbull.book(3, 2000);
    }
}


