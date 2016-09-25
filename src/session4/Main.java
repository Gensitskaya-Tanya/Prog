package session4;

import java.text.SimpleDateFormat;

/**
 * Created by ZaR on 24-Sep-16.
 */
public class Main {
    public static void main(String[] args) {
        Action ac = new Action();
        SingleThread singleThread = new SingleThread("Push", ac, true);
        SingleThread singleThread2 = new SingleThread("Pull", ac, true);
        Thread t1 = new Thread(singleThread);
        Thread t2 = new Thread(singleThread2);

        t1.start();
        t2.start();
    }

}