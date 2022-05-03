package garden;

import java.util.ArrayList;

public class Garden {

    /* FIELDS */
    private ArrayList<Plant> plants;

    /* GETTERS & SETTERS */
    private int getWateringCount() {
        int i = 0;
        for (Plant plant : this.plants) {
            if(plant.needsWater()) {
                i++;
            }
        }
        return i;
    }

    /* CONSTRUCTOR */
    public Garden() {this.plants = new ArrayList<>();}

    /* CUSTOM */
    public void addPlant(Plant plant) {
        this.plants.add(plant);
    }

    public void water(int water) {
        for (Plant plant : this.plants) {
            plant.watering(water / this.getWateringCount());
        }
        this.print();
    }

    public void print() {
        for (Plant plant : this.plants) {
            System.out.println(plant.getStatus());
        }
        System.out.println(this.getWateringCount());
        System.out.println("------------------------------");
    }
}
