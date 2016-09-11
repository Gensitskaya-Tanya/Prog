package session2;

import java.io.File;
import java.util.Arrays;

/**
 * Created by ZaR on 10-Sep-16.
 */
public class Main2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "black", 3, "giam");
        Cat cat2 = new Cat("Haska", "klack", 1, "liam");
        Cat cat3 = new Cat("Kaseka", "llack", 7, "hiam");
        Cat cat4 = new Cat("Laskeaee", "hlack", 3, "liam");
        Cat cat5 = new Cat("Raskaeeeeee", "wlack", 3, "riam");


        Cat [] catArray = {cat1,cat2,cat3,cat4,cat5};
//        Arrays.sort(catArray, (a,b)->a.getName().compareTo(b.getName()));


        Arrays.sort(catArray, (a,b)->a.getName().length()-b.getName().length());

        Arrays.sort(catArray, (a,b)->(a.getName().length()-b.getName().length())==0 ? a.getAge() - b.getAge(): a.getName().length() - b.getName().length());
        for(Cat cat: catArray){
            System.out.println(cat);
        }


//        CatController catController = new CatController();
//
//        catController.saveCat(new CatsToCVS(new File("Vaska.txt")), cat1);
//
//        Cat catTwo = catController.loadCat(new CatsToCVS(new File("Vaska.txt")));
//        System.out.println(catTwo);




    }

}
