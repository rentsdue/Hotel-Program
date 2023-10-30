package main.java.com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Sets up hotel with rooms
        Hotel pitbull= new Hotel("APCSA");
        Room economyRoom= new Room(2, 420, false, "Economy Room");
        Room blancoRoom= new Room (2, 1999, false, "Blanco Room");
        Room deluxeRoom= new Room (2, 6900, false, "Deluxe Room");
        Room theBestRoom= new Room (2, 690000, false, "The Best Room");
        Room negroRoom= new Room (2, 1000, false, "Negro Room");
        Room gaeRoom= new Room(2, 1500, false, "Happy Room");
        Room zRoom= new Room(2, 1001, false, "Z Room");
        ArrayList <Room> theBestList= new ArrayList<Room>();

       //Adds the rooms to the hotel//
        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theBestRoom);
        theBestList.add(negroRoom);
        theBestList.add(blancoRoom);
        theBestList.add(gaeRoom);
        theBestList.add(zRoom);
        pitbull.setRoomList(theBestList);

        //Printing stuff to make sure it works
        System.out.println(pitbull.book(8, 10000));


    }
}


