package session3;

import java.util.Random;

public class MainClock {
    public static void main(String[] args) {
        Thread thr = new Thread(new ClockThread());
        thr.start();
        int number =0;
        Random rn = new Random();
        for (;number!=5; number = rn.nextInt(10)){
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        thr.interrupt();
        System.out.println("main - stop");
    }
}
