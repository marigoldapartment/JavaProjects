public class Factorialclass {
    public static void main(String[] args) {
        int m;
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial will be " + factorial);
    }
}
