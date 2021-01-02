public class Findumberisprimeornot {
    public static void main(String[] args) {
        System.out.println(Findnumberisprimeornot(14));
    }

    private static int Findnumberisprimeornot(int end) {
        int j = 0;
        for (int i = 0; i <= end; i++) {
            if (i % 2 == 0) {
                j = j + 1;
            }
        }
        System.out.println("this is prime number");
        return j;
    }
}