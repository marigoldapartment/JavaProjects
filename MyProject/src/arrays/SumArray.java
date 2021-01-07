package arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] j = {10, 40, 20, 87, 67};
        int sum = 0;
        for(int i = 0 ; i<j.length;i++){
            sum = sum + j[i];
        }

        System.out.println(sum);

    }
}
