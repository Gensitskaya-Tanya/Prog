package session4;

/**
 * Created by ZaR on 24-Sep-16.
 */
public class SingleThread implements  Runnable{
    private String text;
    private Action ac;
    private boolean turn;


    public SingleThread(String text, Action ac, boolean turn) {
        this.text = text;
        this.ac = ac;
        this.turn = turn;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ac.printText(text, turn);
        }
    }
}
