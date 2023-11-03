package main.java.com.example;

public class Guest extends Person {
    private String guestId;
    private boolean breakfast;
    private boolean membership;
    private int luggages;
    public Guest(int age, char gender, double height, String name, String race, double weight, String guestId, boolean breakfast, boolean membership, int luggages) {
        super(age, gender, height, name, race, weight);
        this.guestId=guestId;
        this.breakfast=breakfast;
        this.membership=membership;
        this.luggages=luggages;
    }

    public String getGuestId() {
        return this.guestId;
    }

    public boolean getBreakfast() {
        return this.breakfast;
    }

    public boolean getMembership() {
        return this.membership;
    }
    
    public int getLuggages() {
        return this.luggages;
    }

    public void setGuestId(String newId) {
        this.guestId=newId;
    }

    public void setBreakfast(boolean newBreakfast) {
        this.breakfast=newBreakfast;
    }

    public void setMembership(boolean newMembership) {
        this.membership=newMembership;
    }
    
    public void setLuggages(int newLuggages) {
        this.luggages=newLuggages;
    }

    public void orderBreakfast() {
        this.breakfast=true;
    }

    public void makeMembership() {
        this.membership=true;
    }
}
