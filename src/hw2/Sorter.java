package hw2;

import java.util.Arrays;

/**
 * Created by Tanya on 16.09.2016.
 */
public class Sorter {
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 8, 1, 2, 6, 7, 9};
		for(int i = arr.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
		System.out.println(Arrays.toString(arr));

		String a = "z";
		String b = "b";
		System.out.println(a.compareTo(b));
	}
}
