package garden;

abstract class Plant {

    protected String color;
    protected String type;
    protected double waterAmount;

    protected boolean needsWater;

    protected abstract void needsWater();
    protected abstract void watering(int water);

    public Plant(String color, String type, double waterAmount, boolean needsWater) {
        this.color = color;
        this.type = type;
        this.waterAmount = waterAmount;
        this.needsWater = needsWater;
    }
}
