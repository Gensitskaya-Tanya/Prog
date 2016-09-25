package otherHW;

/**
 * Created by ZaR on 25-Sep-16.
 */
public class CreateThread implements Runnable {

    private int[] arr;
    private int begin;
    private int end;
    private Thread thr;
    private long res;

    public CreateThread(int[] arr, int begin, int end) {
        super();
        this.arr = arr;
        this.begin = begin;
        this.end = end;
        thr = new Thread(this);
        thr.start();
    }

    public Thread getThr() {
        return thr;
    }

    @Override
    public void run() {
        sum(arr, begin, end);

    }

    private long sum(int[] arr, int start, int end) {
        for (int i = begin; i < end; i++) {
            res = res + arr[i];
        }
        return res;
    }

    public long getSum() {
        return res;
    }

}
