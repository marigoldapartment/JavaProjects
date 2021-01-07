package printnumber;

public class MyClass {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 12; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("");
            }
        }
    }
}