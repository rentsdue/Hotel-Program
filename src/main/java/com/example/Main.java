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
        ArrayList <Employee> pitbullEmployees= new ArrayList<Employee>();
        ArrayList <Guest> pitbullGuests= new ArrayList<Guest>();

        //People
        Person bradLong=new Person(22, 'M', 180, "Brad Lin", "Asian", 70);
        Employee mitch=new Employee(55, 'M', 190, "Mitchell", "White", 69, "Entry-level", "MH-2233");
        Employee powell=new Employee(69, 'M', 200, "Powell", "Black", 1111, "CEO", "PC-69420");
        Employee neige= new Employee(444, 'F', 1234, "Wowkie", "Asian", 123, "Entry-level", "NG-1234");
        Employee max= new Employee(100, 'M', 123, "White", "Max", 122, "CEO", "MM-1231");
        Guest alex= new Guest(30, 'M', 180, "Alexander", "White", 69, "AK-47", false, false, 7);
        Guest ivan= new Guest(30, 'M', 20, "Ivan Perez", "Mexican", 70, "IP-69420", false, false, 88);
        Guest teresa= new Guest(420, 'F', 100, "Teresa", "Asian", 123, "TT-4200", false, false, 100);
        Guest maoZedong= new Guest(69, 'M', 700, "Mao Zedong", "Asian", 1188, "MZ-1949", false, false, 0);
        Guest ambatukam= new Guest(11, 'M', 223, "Ambatukam", "Black", 333, "ABTK-2456", false, false, 12);
        Guest putaMadre= new Guest(12, 'F', 223, "Puta Madre", "Mexican", 235, "PM-1200", false, false, 1);

       //Adds the rooms to the hotel//
        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theBestRoom);
        theBestList.add(negroRoom);
        theBestList.add(blancoRoom);
        theBestList.add(gaeRoom);
        theBestList.add(zRoom);
        pitbull.setRoomList(theBestList);
        pitbull.setEmployeeList(pitbullEmployees);
        pitbull.setGuestList(pitbullGuests);

        //Getter and setter test
        System.out.println(bradLong.getRace());
        System.out.println(mitch.getId());
        alex.makeMembership();
        System.out.println(alex.getMembership());

        //Employee test
        pitbull.diversityHire(powell);
        pitbull.hireEmployee(pitbullEmployees, neige);
        pitbull.hireEmployee(pitbullEmployees, mitch);
        pitbull.affirmativeAction(pitbullEmployees, max);
        System.out.println(pitbull.checkEmployee(powell, pitbullEmployees));
        System.out.println(pitbull.checkEmployee(max, pitbullEmployees));
        for (Employee employee: pitbullEmployees) {
            System.out.println("Employee name: " + employee.getName());
        }

        //Guest test
        pitbullGuests.add(alex);
        pitbullGuests.add(ivan);
        pitbullGuests.add(teresa);
        pitbullGuests.add(maoZedong);
        pitbullGuests.add(ambatukam);
        pitbullGuests.add(putaMadre);
        for (Guest guest: pitbullGuests) {
            System.out.println(guest.getName()+" "+ guest.getRace());
        }
        pitbull.book(pitbullGuests, 11000);
        
    }
}


