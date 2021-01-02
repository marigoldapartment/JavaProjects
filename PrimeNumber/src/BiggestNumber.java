public class BiggestNumber {
    public static void main(String[] args) {
        System.out.println(biggestNumber(21, 17, 9));
    }

    private static int biggestNumber(int i, int j, int k) {
        if (i > j && i > k) {
            return i;
        } else if (j > i && j > k) {
            return j;
        } else {
            return k;
        }
    }

}
