import java.util.ArrayList;

public class Farmer {
    private final ArrayList<Flower> flowers = new ArrayList<>();
    private int fieldSize = 100;
    private Farm farm = new Farm();
    private int money = 100;

    public void addFlower(Flower flower) {
        if (flower.getNeededArea() <= fieldSize) {
            flowers.add(flower);
            fieldSize -= (int) flower.getNeededArea();
        }
    }

    public void harvestFlower(Flower flower) {
        if (flowers.contains(flower)) {
            flowers.remove(flower);
            fieldSize += (int) flower.getNeededArea();
        }
    }

    public void waterFlower(Flower flower) {
        if (flowers.contains(flower)) {
            flower.setChanceOfGrowth(flower.getChanceOfGrowth() * 0.9);
            if (flower.getChanceOfGrowth() < 0.5) {
                harvestFlower(flower);
            }
        }

    }

    public void addAnimal(Animal animal) {
        farm.addAnimal(animal);
    }

    public void removeAnimal(Animal animal) {
        farm.removeAnimal(animal);
    }

}
