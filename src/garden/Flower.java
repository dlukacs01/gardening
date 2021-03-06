package garden;

public class Flower extends Plant {

    /* GETTERS & SETTERS */
    public String getType() {
        return "flower";
    }

    /* CONSTRUCTOR */
    public Flower(String color) {
        super(color);
        this.amountToCheck = 5;
        this.percentValue = 0.75;
    }
}
