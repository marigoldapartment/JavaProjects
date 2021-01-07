public class FindLeapYear {
    public static void main(String[] args) {
        int meraNumber = 2000;
        if (meraNumber % 400 == 0) {
            System.out.println(meraNumber + " is a leap year.");
        } else if (meraNumber % 100 == 0) {
            System.out.println(meraNumber + " is not a leap year.");
        } else if (meraNumber % 4 == 0) {
            System.out.println(meraNumber + " is a leap year.");
        } else {
            System.out.println(meraNumber + " is not a leap year.");
        }


    }
}
