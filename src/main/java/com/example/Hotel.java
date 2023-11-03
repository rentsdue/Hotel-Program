package main.java.com.example;
import java.util.ArrayList;

public class Hotel {
   private String hotelName;
   private ArrayList<Room> roomList;
   private ArrayList<Employee> employeeList;
   private ArrayList<Guest> guestList;
   
   public Hotel(String hotelName) {
		this.hotelName=hotelName;
		this.roomList= new ArrayList <Room>();
		this.employeeList= new ArrayList<Employee>();
		this.guestList= new ArrayList<Guest>();
   }

//Getters  
 
   public String getHotelName() {
		return this.hotelName;
   }

   public ArrayList<Room> getRoomList() {
		return this.roomList;
   }

   public ArrayList<Employee> getEmployeeList() {
		return this.employeeList;
   }

   public ArrayList<Guest> getGuestList() {
		return this.guestList;
   }

   	//Setters

   public void setHotelName(String newName) {
		this.hotelName=newName;
   }

   public void setRoomList(ArrayList<Room> newList) {
		this.roomList=newList;
   }

   public void setEmployeeList(ArrayList<Employee> newEmployeeList) {
		this.employeeList=newEmployeeList;
   }

   public void setGuestList(ArrayList<Guest> newGuestList) {
		this.guestList=newGuestList;
   }

   //Manipulate employees

   public void hireEmployee(ArrayList<Employee> employeeList, Person person) {
		employeeList.add((Employee) person);
   }

   public void fireEmployee(Employee employee) {
		employeeList.remove(employee);
   }

   public void affirmativeAction(ArrayList<Employee> employeeList, Employee employee) {
		if (employee.getRace()=="White" || employee.getRace()=="Asian") {
				fireEmployee(employee);
				System.out.println("Sorry, we fired you due to diversity quotas. LOL!");
			}
		}

   public void diversityHire(Person person) {
		if (person.getRace()=="Black") {
			hireEmployee(employeeList, person);
			System.out.println("Well done! Totally not racist lol");
		}
   }

   public boolean checkEmployee(Employee employee, ArrayList<Employee> employeeList) {
		if (employeeList.contains(employee)) {
			return true;
		} else {
			return false;
		}
   }

   public void addGuest(Guest guest) {
	this.guestList.add(guest);
	}

	public void removeGuest(Guest guest) {
		this.guestList.remove(guest);
	}

   //Booking

   public ArrayList<Room> findAvailableRooms() {
		ArrayList<Room> availableRooms= new ArrayList<Room>();
		for (Room room: roomList) {
			if (room.getOccupied()==false) {
				availableRooms.add(room);
			}
		}
	return availableRooms;
   }


   public boolean book(ArrayList<Guest> guests, double budget) {
		ArrayList<Room> affordableRooms= new ArrayList<Room>();
		ArrayList<Room> selectedRooms = this.findAvailableRooms(); 
		int noOfPpl=guests.size();
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
