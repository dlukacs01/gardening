package garden;

public class Main {
    public static void main(String[] args) {

        Plant yellow_flower = new Flower("yellow", "flower", 0, true);
        Plant blue_flower = new Flower("blue", "flower", 0, true);
        Plant purple_flower = new Tree("purple", "tree", 0, true);
        Plant orange_flower = new Tree("orange", "tree", 0, true);

        Garden garden = new Garden();

        garden.plants.add(yellow_flower);
        garden.plants.add(blue_flower);
        garden.plants.add(purple_flower);
        garden.plants.add(orange_flower);

        garden.printStatus();
        garden.water(40);
        garden.water(70);
    }
}