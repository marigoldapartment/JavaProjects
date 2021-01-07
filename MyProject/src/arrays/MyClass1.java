package arrays;

public class MyClass1 {
    public static void main(String[] args) {
        int[] j = {10,20,50,87,67};
        for(int i = 0; i<j.length;i++){
            System.out.println(j[i]);
        }

        System.out.println("\n\n\n\n");

        for(int i = j.length-1; i>=0;i--){
            System.out.println(j[i]);
        }
    }
}
