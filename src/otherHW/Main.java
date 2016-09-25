package otherHW;

import java.util.Random;

/**
 * Created by ZaR on 25-Sep-16.
 */
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = new int[200000001];
        Random rd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10);
        }

        long stWork = System.currentTimeMillis();
        long sum = Sum.sum(arr);
        long endWork = System.currentTimeMillis();
        System.out.println(endWork - stWork +" ms - " + sum + " - Static method");

        stWork = System.currentTimeMillis();
        sum = CalcSumMultiThread.calcSum(arr);
        endWork = System.currentTimeMillis();
        System.out.println(endWork - stWork +" ms -" + sum + " - MultiThread method" );
    }

}
