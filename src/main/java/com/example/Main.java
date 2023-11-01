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

        //People
        Person bradLong=new Person(22, 'M', 180, "Brad Lin", "Asian", 70);
        Employee mitch=new Employee(55, 'M', 190, "Mitchell", "White", 69, "Entry-level", "MH-2233");
        Employee powell=new Employee(69, 'M', 200, "Powell", "Black", 1111, "CEO", "PC-69420");
        Employee neige= new Employee(444, 'F', 1234, "Wowkie", "Asian", 123, "Entry-level", "NG-1234");
        Employee max= new Employee(100, 'M', 123, "White", "Max", 122, "CEO", "MM-1231");

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

        //Printing stuff to make sure it works
        System.out.println(pitbull.book(8, 10000));
        System.out.println(bradLong.getRace());
        System.out.println(mitch.getId());
        pitbull.diversityHire(powell);
        pitbull.hireEmployee(pitbullEmployees, neige);
        pitbull.hireEmployee(pitbullEmployees, mitch);
        pitbull.affirmativeAction(pitbullEmployees, max);
        System.out.println(pitbull.checkEmployee(powell, pitbullEmployees));
        System.out.println(pitbull.checkEmployee(max, pitbullEmployees));
        for (Employee employee: pitbullEmployees) {
            System.out.println("Employee name: " + employee.getName());
        }

    }
}


