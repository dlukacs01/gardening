package garden;

public class Main {
    public static void main(String[] args) {

        Flower yellow_flower = new Flower("yellow");
        Flower blue_flower = new Flower("blue");
        Tree purple_flower = new Tree("purple");
        Tree orange_flower = new Tree("orange");

        Garden garden = new Garden();

        garden.addPlant(yellow_flower);
        garden.addPlant(blue_flower);
        garden.addPlant(purple_flower);
        garden.addPlant(orange_flower);

        garden.print();
        garden.water(40);
        garden.water(70);
    }
}