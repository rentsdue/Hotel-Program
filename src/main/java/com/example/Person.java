package main.java.com.example;

public class Person {
    private int age;
    private char gender;
    private double height;
    private String name;
    private String race;
    private double weight;

    public Person(int age, char gender, double height, String name, String race, double weight) {
        this.age=age;
        this.gender=gender;
        this.height=height;
        this.name=name;
        this.race=race;
        this.weight=weight;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public double getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setAge(int newAge) {
        this.age=newAge;
    }

    public void setGender(char newGender) {
        this.gender=newGender;
    }

    public void setHeight(double newHeight) {
        this.height=newHeight;
    }

    public void setName(String newName) {
        this.name=newName;
    }

    public void setRace(String newRace) {
        this.race=newRace;
    }

    public void setWeight(double newWeight) {
        this.weight=newWeight;
    }
}