package Sorting;

public class HighAndLow {
    public static void main(String[] args) {
        int[] number = {10,70,40,50,30,90};

        int[] sorted = sorting(number);

        int min = sorted[0];

        int max = sorted[sorted.length -1];

        System.out.println("Diffrence in max and min number is : " + (max - min));
    }

    public static int[] sorting(int[] number){
        //char[] c = s.toCharArray();
        for(int i =0; i<number.length;i++){
            for(int j = i+1; j<number.length;j++){
                if(number[i]>number[j]){
                    int p = number[i];
                    number[i] = number[j];
                    number[j] = p;
                }
            }
        }
        return number;
    }
}
