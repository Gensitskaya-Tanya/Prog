package otherHW;

/**
 * Created by ZaR on 25-Sep-16.
 */
public class CalcSumMultiThread{
    static private int threadNumber = Runtime.getRuntime().availableProcessors() * 2;
    public static long calcSum(int[] arr){
        int begin;
        int end;
        int finalSum = 0;
        CreateThread[] sumThread = new CreateThread[threadNumber];
        int size = arr.length/threadNumber;
        for(int i = 0; i<threadNumber;i++){
            begin = size*i;
            end = size*(i+1);
            if ((arr.length - end) < size) {
                end = arr.length;
            }
            sumThread[i] = new CreateThread(arr,begin,end);
        }

        for (int i = 0; i < sumThread.length; i++) {
            try{
                sumThread[i].getThr().join();
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }

        for (int i = 0; i < sumThread.length; i++) {
            finalSum += sumThread[i].getSum();
        }
        return finalSum;
    }

}