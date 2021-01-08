package patternstar;

public class StarPattern3 {
    public static void main(String[] args) {
        for(int k =0; k<=5;k++) {
            for (int i = 4-k; i >= 0; i--) {
                System.out.print(" ");
            }

            for (int j = 0; j < k; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int a =0; a<=5;a++) {
            for (int b = 0; b <=a; b++) {
                System.out.print(" ");
            }

            for (int c= 4-a-1; c >=0; c--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
