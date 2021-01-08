package patternstar;

public class StarPattern2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = (4 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }

            System.out.println();

            for (int l = 5; l < 0; l--) {
                for (int m = (0 + 4); m <= 5; m++) {
                    System.out.println(" ");
                }
                for (int n = 0; n <= l; n++) {
                    System.out.println(" *");
                }
                System.out.println();
            }
        }
    }
}