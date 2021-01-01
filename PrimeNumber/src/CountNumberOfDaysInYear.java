public class CountNumberOfDaysInYear {
    public static void main(String[] args) {
        System.out.println(countDays(1965));
    }

    private static int countDays(int i) {
      if(i%4==0&&i%100==0&&i%400==0) {
          System.out.println("this is leap year");
      }
        else
      {
          System.out.println("this is not a leap year");
      }

    }
}
