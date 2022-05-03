package garden;

abstract class Plant {

    protected String color;
    protected double waterAmount;
    protected boolean needsWater;

    protected abstract void needsWater();
    protected abstract void watering(int water);

    public abstract String getType();

    public Plant(String color) {
        this.color = color;
        this.waterAmount = 0;
        this.needsWater = true;
    }
}
