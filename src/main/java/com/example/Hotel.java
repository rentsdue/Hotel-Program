package main.java.com.example;
import java.util.ArrayList;

public class Hotel {
   private String hotelName;
   private ArrayList<Room> roomList;
   
   public Hotel(String hotelName) {
		this.hotelName=hotelName;
		this.roomList= new ArrayList <Room>();
   }

   public String getHotelName() {
		return this.hotelName;
   }

   public ArrayList<Room> getRoomList() {
		return this.roomList;
   }

   public void setHotelName(String newName) {
		this.hotelName=newName;
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

   public boolean book(int noOfPpl, double budget) {
		ArrayList<Room> affordableRooms= new ArrayList<Room>();
		ArrayList<Room> selectedRooms = this.findAvailableRooms(); 
		for (Room room: selectedRooms) {
			if (room.getPrice()<=budget) {
				affordableRooms.add(room);
			}
		}
	
		for (int i=0; i<affordableRooms.size(); i++) {
			for (int j=0; j<affordableRooms.size()-i-1; j++) {
				if (affordableRooms.get(j).getPrice()>affordableRooms.get(j+1).getPrice()) {
					Room temp= affordableRooms.get(j);
					affordableRooms.set(j, affordableRooms.get(j+1));
					affordableRooms.set(j+1, temp);
				}
			}
		}

		double remainingBudget=budget;
		ArrayList <Room> wantedRooms= new ArrayList<Room>();
		for (Room room: affordableRooms) {
			if (remainingBudget-room.getPrice()<=0 || noOfPpl<=0) {
				break;
			}
			remainingBudget -= room.getPrice();
			noOfPpl -= room.getOccupancy();
			wantedRooms.add(room);
		}

		for(Room room: wantedRooms) {
			room.setOccupied(true);
			System.out.println(room.getOccupancy());
			System.out.println(room.getOccupied());
			System.out.println(room.getPrice());
			System.out.println(room.getName());
		}

		if (remainingBudget>=0) {
			return true;
		} else {
			return false;
		}

   }

}
