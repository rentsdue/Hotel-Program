package main.java.com.example;

public class Employee extends Person {
    private String position;
    private String id;
    public Employee (int age, char gender, double height, String name, String race, double weight, String position, String id) {
        super(age, gender, height, name, race, weight);
        this.position=position;
        this.id=id;
    }

    public String getPosition() {
        return this.position;
    }

    public String getId() {
        return this.id;
    }

    public void setPosition(String newPosition) {
        this.position=newPosition;
    }

    public void setId(String newId) {
        this.id=newId;
    }
}
