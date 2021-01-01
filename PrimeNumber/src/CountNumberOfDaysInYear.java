public class CountNumberOfDaysInYear {
    public static void main(String[] args) {
        System.out.println(countDays(2000));
    }

    public static int countDays(int year) {
        boolean check = false;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            check = true;
        }

        int days = 0;
        for (int i = 1; i <= 12; i++) {
            if (i >= 1 && i <= 7) {

                if (i % 2 == 0) {
                    if (i == 2 && check) {
                        days = days + 29;
                    } else if (i == 2 && check == false) {
                        days = days + 28;
                    } else {
                        days = days + 30;
                    }
                } else {
                    days = days + 31;
                }
            } else {

                if (i % 2 == 0) {
                    days = days + 31;
                } else {
                    days = days + 30;
                }
            }
        }
        return days;
    }
}
