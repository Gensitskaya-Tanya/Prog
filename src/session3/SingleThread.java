package session3;

/**
 * Created by ZaR on 17-Sep-16.
 */
public class SingleThread implements  Runnable{

    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+ " ->" + i);
        }
    }
}
