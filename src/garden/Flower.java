package garden;

public class Flower extends Plant {

    public void needsWater() {
        if(this.waterAmount < 5) {
            this.needsWater = true;
        } else {
            this.needsWater = false;
        }
    }

    public void watering(int water) {
        this.waterAmount += 0.75 * water;
    }

    public Flower(String color, String type, double waterAmount, boolean needsWater) {
        super(color, type, waterAmount, needsWater);
    }
}
