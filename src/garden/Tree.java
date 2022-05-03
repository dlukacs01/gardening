package garden;

public class Tree extends Plant {

    public String getType() {
        return "tree";
    }

    public void needsWater() {
        if(this.waterAmount < 5) {
            this.needsWater = true;
        } else {
            this.needsWater = false;
        }
    }

    public void watering(int water) {
        this.waterAmount += 0.4 * water;
    }

    public Tree(String color) {
        super(color);
    }
}
