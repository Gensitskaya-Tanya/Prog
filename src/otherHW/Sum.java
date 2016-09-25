package otherHW;

/**
 * Created by ZaR on 25-Sep-16.
 */
public class Sum {
    public static int sum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i];
        }

        return res;

    }
}