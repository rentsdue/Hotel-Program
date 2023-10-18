package main.java.com.example;
import java.util.ArrayList;

public class Hotel {
   private String name;
   private ArrayList<Room> roomList;
   
   public Hotel(String name) {
		this.name=name;
		this.roomList= new ArrayList <Room>();
   }

   public String getName() {
		return this.name;
   }

   public ArrayList<Room> getRoomList() {
		return this.roomList;
   }

   public void setName(String newName) {
		this.name=newName;
   }

   public void setRoomList(ArrayList<Room> newList) {
		this.roomList=newList;
   }

   public ArrayList<Room> findAvailableRooms() {
		ArrayList<Room> availableRooms= new ArrayList<Room>();
		for (Room room: roomList) {
			if (room.getOccupied()==false) {
				availableRooms.add(room);
			}
		}
	return availableRooms;
   }

   public ArrayList<Room> book(int noOfPpl, double budget) {
		System.out.println(budget);
		ArrayList<Room> affordableRooms= new ArrayList<Room>();
		ArrayList<Room> selectedRooms = this.findAvailableRooms(); 
		for (Room room: selectedRooms) {
			if (room.getPrice()<=budget) {
				affordableRooms.add(room);
			}
		}
	return affordableRooms;
   }


}
