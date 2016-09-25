package session4;


import java.lang.reflect.Field;

/**
 * Created by ZaR on 24-Sep-16.
 */
public class MainCat {
    public static void main(String[] args) {
        Cat cat = new Cat("vaska", 3, "blackt");
        Class classCat = cat.getClass();
        System.out.println(cat);
        try {
            Field file = classCat.getDeclaredField("name");
            file.setAccessible(true);
            try {
                file.set(cat, "kuzia");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println(cat);
    }
}
