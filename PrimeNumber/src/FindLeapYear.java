public class FindLeapYear {
    public static void main(String[] args) {
        int meraNumber = 2100;
        if (meraNumber % 4 == 0 && meraNumber % 100 == 0 && meraNumber % 400 == 0) {
            System.out.println("this is leap year");
        } else {
            System.out.println("not a leap year");
        }


    }
}
