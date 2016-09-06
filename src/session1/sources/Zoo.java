package session1.sources;

public class Zoo {

    private static final int zooSize = 10;
    private static int animalCount = 0;
    private Animal[] animalArray = new Animal[zooSize];
    private String zooName;

    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    public void addAnimal(Animal animal) {
        if (animalCount <= zooSize) {
            animalArray[animalCount] = animal;
            animalCount++;
        } else {
            System.out.println("In the zoo, there are no free places.");
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += this.zooName + System.lineSeparator() + "///" + System.lineSeparator();
        for (Animal animal : animalArray) {
            if (animal != null) {
                res += animal + System.lineSeparator();
            }
        }
        return res;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

}
