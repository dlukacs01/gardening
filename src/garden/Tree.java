package garden;

public class Tree extends Plant {

    /* GETTERS & SETTERS */
    public String getType() {
        return "tree";
    }

    /* CONSTRUCTOR */
    public Tree(String color) {
        super(color);
        this.amountToCheck = 10;
        this.percentValue = 0.4;
    }
}
