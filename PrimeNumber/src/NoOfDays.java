public class NoOfDays {
    public static void main(String[] args) {
        System.out.println(noOfDays(12));
    }

    public static int noOfDays(int month) {
        if (month % 2 == 0) {
            if (month == 2) {
                return 29;
            } else {
                return 30;
            }
        } else {
            return 31;
        }
    }


    public static int noOfDaysWithoutInnerIf(int month) {
        if (month % 2 == 0 && month == 2) {
            return 29;
        } else if (month % 2 == 0 && month != 2) {
            return 30;
        } else {
            return 31;
        }
    }

    public static int noOfDaysSubhashWay(int month) {
        if (month == 2) {
            return 29;
        }

        if (month % 2 == 0) {
            return 30;
        } else {
            return 31;
        }
    }

    /*else if (month % 2 != 0) {
        return 31;
    }*/
}
