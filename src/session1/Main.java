package session1;

import session1.sources.Animal;
import session1.sources.Cat;
import session1.sources.Dog;
import session1.sources.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("red", 13, "cheez", "Nic", "yxastui");
        System.out.println(cat.getClass());
        System.out.println(Cat.class);
        Zoo zoo = new Zoo("House Zoo");
        zoo.addAnimal(new Cat("white", 12, "milk", "vaska", "Siam"));
        zoo.addAnimal(new Dog("black", 12, "meet", "faks"));
        zoo.addAnimal(new Animal("hjhj", 12, "jhjhj"));

        System.out.println(zoo);
    }
}
