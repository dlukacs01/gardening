package garden;

import java.util.ArrayList;

public class Garden {

    public ArrayList<Plant> plants;
    private int wateringCount;

    private void wateringCount() {
        for (Plant plant : plants) {
            if(plant.needsWater) {
                wateringCount++;
            }
        }
    }

    public void water(int water) {
        this.wateringCount();
        for (Plant plant : plants) {
            plant.watering(water / wateringCount);
            plant.needsWater();
        }
        this.printStatus();
    }

    public void printStatus() {
        for (Plant plant : plants) {
            System.out.println(
                    "The "
                    + plant.color
                    + " "
                    + plant.getType()
                    + " "
                    + (plant.needsWater ? "needs" : "doesnt need")
                    + " water"
            );
        }
        System.out.println("------------------------------");
    }

    public Garden() {
        this.wateringCount = 0;
        this.plants = new ArrayList<>();
    }
}
