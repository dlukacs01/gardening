package garden;

public class Main {
    public static void main(String[] args) {

        Flower yellow_flower = new Flower("yellow");
        Flower blue_flower = new Flower("blue");
        Tree purple_flower = new Tree("purple");
        Tree orange_flower = new Tree("orange");

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