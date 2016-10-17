package session2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ZaR on 10-Sep-16.
 */
public class Main {
    public static void main(String[] args) {
        int [] a = generateArray();
        int [] b = generateArray();
        int [] c = generateArray();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        sumArray(a, b ,c);
        System.out.println("Sum = " + getOneArraySum(a) + getOneArraySum(b) + getOneArraySum(c));

    }

    static int [] generateArray(){
        Random rn = new Random();
        int[] array = new int [10+rn.nextInt(10)];
        for (int i=0; i<array.length; i++){
            array[i] = rn.nextInt();
        }
        return array;
    }
//    static int sumArray (int [] a, int [] b, int []c){
//        int sum = 0;
//        for(int i=0; i<a.length || i<b.length || i<c.length; i++){
//            try {
//              sum = sum+1;
//                int num.txt = a[i];
//            }
//            catch (IndexOutOfBoundsException e){
//
//            }
//            try {
//                sum = sum+1;
//                int num.txt = b[i];
//            }
//            catch (IndexOutOfBoundsException e){
//
//            }
//            try {
//                sum = sum+1;
//                int num.txt = c[i];
//            }
//            catch (IndexOutOfBoundsException e){
//
//            }
//
//        }
//        return sum;
//    }

    static int sumArray (int [] a, int [] b, int []c) {

        int sum = 0;
        for (int i =0, err = 0; err!=3; i++){
            err = 0;
            try{
                sum+=a[i];
            }
            catch(IndexOutOfBoundsException e){
                err++;
            }
            try{
                sum+=b[i];
            }
            catch(IndexOutOfBoundsException e){
                err++;
            }
            try{
                sum+=c[i];
            }
            catch(IndexOutOfBoundsException e){
                err++;
            }
        }
        return sum;
    }

    static int getOneArraySum(int [] a){

       return 1;
    }
}
