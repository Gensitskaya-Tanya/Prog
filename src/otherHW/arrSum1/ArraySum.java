package otherHW.arrSum1;

public class ArraySum implements Runnable {
    private int [] arr;
    private int start;
    private int end;
    private Thread thread;
    private int  sum;

    public ArraySum( int start, int end,  int [] arr) {
        super();
        this.arr = arr;
        this.start = start;
        this.end = end;
        thread = new Thread(this);
        thread.start();
    }


    public ArraySum() {
        super();
    }


    @Override
    public void run() {
        for(int i = start; i < end; i++){
            sum += arr[i];
        }

    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }



}
