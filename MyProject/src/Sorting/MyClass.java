package Sorting;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        int[] number = {3,1,5,4,6};
        for (int i = 0; i <= number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if(number[i]>number[j]){
                    int c = 0;
                    c = number[i];
                    number[i] = number[j];
                    number[j] = c;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}


