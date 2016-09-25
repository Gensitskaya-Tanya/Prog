package otherHW.arrSum1;

import java.util.Arrays;

/**
 * Created by ZaR on 25-Sep-16.
 */
public class Main {

    public static void main(String[] args) {
        int [] arr = new int[100000000];
        long sum = 0;

        Arrays.fill(arr, 10);


        long time = System.currentTimeMillis();
        ArraySum threa1 = new  ArraySum(0, arr.length/4 - 1, arr);
        ArraySum threa2 = new ArraySum(arr.length/4, arr.length/2 -1, arr);
        ArraySum threa3 = new ArraySum(arr.length/2, arr.length*3/4 - 1, arr);
        ArraySum threa4 = new ArraySum(arr.length*3/4, arr.length - 1, arr);

        try{
            threa1.getThread().join();
            threa2.getThread().join();
            threa3.getThread().join();
            threa4.getThread().join();

        }catch (InterruptedException e){
            System.out.println(e);
        }
        sum = threa1.getSum() + threa2.getSum() + threa3.getSum() + threa4.getSum();
        System.out.println("Сумма массива - " + sum);
        System.out.println("Затраченное время - " + (System.currentTimeMillis() - time) + "мс");

        System.out.println("Простой алгоритм: ");

        time = System.currentTimeMillis();
        ArraySum th = new ArraySum(0, arr.length -1, arr);

        try{
            th.getThread().join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        sum = threa1.getSum() + threa2.getSum() + threa3.getSum() + threa4.getSum();
        System.out.println("Сумма массива - " + sum);
        System.out.println("Затраченное время - " + (System.currentTimeMillis() - time) + "мс");
    }

}
