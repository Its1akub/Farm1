import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals = new ArrayList<>();
    private int maxSize = 10;
    private int actualSize;

    public int getActualSize() {
        return actualSize;
    }

    public void setActualSize(int actualSize) {
        if (actualSize<=maxSize){
            this.actualSize = actualSize;
        }
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            if (countSize(true)<=actualSize){
                animals.add(animal);
            }else if (countSize(false)<=actualSize){
                animals.add(animal);
            }
        }
    }
    private int countSize(boolean isSmall) {
        int count = 0;
        for (Animal animal : animals) {
            if (isSmall &&animal.getSize() == Size.SMALL) {
                count++;
            } else if (!isSmall && animal.getSize() == Size.BIG) {
                count++;
            }
        }
        return count;
    }

    public void removeAnimal(Animal animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
        }
    }


}
