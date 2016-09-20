package session3;


import java.text.SimpleDateFormat;

public class ClockThread implements Runnable {
    private  SimpleDateFormat sdf;

    public  ClockThread(SimpleDateFormat sdf){
        this.sdf = sdf;
    }
    public ClockThread(){
        this.sdf = new SimpleDateFormat("hh:mm:ss");
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (; !t.isInterrupted();){
            System.out.println(sdf.format(System.currentTimeMillis()));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
