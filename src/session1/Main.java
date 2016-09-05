package session1;

/**
 * Created by ZaR on 03-Sep-16.
 */
public class Main {
    public static void main(String[] args) {
    Zoo zoo = new Zoo("House Zoo");
        zoo.addAnimal(new Cat("white", 12,"milk", "vaska", "Siam"));

        System.out.println(zoo);
    }
}
