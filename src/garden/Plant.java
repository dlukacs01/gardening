package garden;

abstract class Plant {

    /* FIELDS */
    protected String color;
    protected double waterAmount;
    protected int amountToCheck;
    protected double percentValue;

    /* GETTERS & SETTERS */
    public abstract String getType();

    public String getStatus() {
        return "The "
                + this.color
                + " "
                + this.getType()
                + " "
                + (this.needsWater() ? "needs" : "doesnt need")
                + " water.";
    }

    /* CONSTRUCTOR */
    public Plant(String color) {
        this.color = color;
        this.waterAmount = 0;
    }

    /* CUSTOM */
    protected boolean needsWater() {
        if(this.waterAmount < this.amountToCheck) {
            return true;
        } else {
            return false;
        }
    }

    protected void watering(int water) {
        this.waterAmount += this.percentValue * water;
    }
}
