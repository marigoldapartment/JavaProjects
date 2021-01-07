package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {40, 10, 20, 87, 67};
        int min_index = 0;
        for (int i = 0; i < a.length; i++) {
            min_index = i;
            int c = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min_index] > a[j]) {
                    min_index = j;
                }
            }
            c = a[min_index];
            a[min_index] = a[i];
            a[i] = c;
        }

        System.out.println(Arrays.toString(a));

    }
}
