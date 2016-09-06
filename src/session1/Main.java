package session1;


public class Main {
    public static void main(String[] args) {
        //        Car carOne = new Car();
//        carOne.color = "Green";
//        carOne.year = 1992;
//        carOne.weight = 0.2;
//        carOne.weight=0.1;
//        Car carTwo = new Car("red", 0.1, 1234);
//        System.out.println(carTwo.toString());




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
