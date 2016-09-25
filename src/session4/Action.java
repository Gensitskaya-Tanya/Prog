package session4;

/**
 * Created by ZaR on 24-Sep-16.
 */
public class Action {
    private boolean turn=true;


    public Action() {
    }

    public synchronized void printText(String text, boolean turnFromThread){
        for(;this.turn!=turnFromThread;){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(text + " ");
        this.turn=!this.turn;
        notify();
    }
}
