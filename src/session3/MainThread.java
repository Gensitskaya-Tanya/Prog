package session3;

/**
 * Created by ZaR on 17-Sep-16.
 */
public class MainThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingleThread());
        Thread thread2 = new Thread(new SingleThread());
        Thread thread3 = new Thread(new SingleThread());

        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(Thread.currentThread().getName()+ "-> stop");
    }
}
