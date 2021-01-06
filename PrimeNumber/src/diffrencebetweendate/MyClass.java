package diffrencebetweendate;

public class MyClass {
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        d1.setDay(20);
        d1.setMonth(2);
        d1.setYear(1996);

        MyDate d2 = new MyDate();
        d2.setDay(23);
        d2.setMonth(3);
        d2.setYear(2004);

        System.out.println(diffrenceBetweenDates(d1, d2));
    }

    private static int diffrenceBetweenDates(MyDate d1, MyDate d2) {
        MyDate startYear = null;
        MyDate endYear = null;
        if (d1.getYear() > d2.getYear()) {
            endYear = d1;
            startYear = d2;
        } else if(d1.getYear() == d2.getYear()){



        }else {
            endYear = d2;
            startYear = d1;
        }

        int yearsdays = diffrenceDaysBetweenYear(startYear.getYear(), endYear.getYear());

        int noOfDaysInStartYear = totalStartDays(startYear.getDay(), startYear.getMonth(), startYear.getYear());

        int noOfDaysInEndYear = totalEndDays(endYear.getDay(),endYear.getMonth(), endYear.getYear());

        return yearsdays+noOfDaysInStartYear+noOfDaysInEndYear;
    }

    private static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int totalEndDays(int day,int month, int year) {
        int days = 0;
        boolean check = checkLeapYear(year);
        for (int i = 1; i <= month - 1; i++) {
            if (i >= 1 && i <= 7) {
                if (i % 2 == 0) {
                    if (i == 2 && check) {
                        if(i==month){
                            days = days + day;
                        }else {
                            days = days + 29;
                        }
                    } else if (i == 2 && check == false) {
                        if(i==month){
                            days = days + day;
                        }else {
                            days = days + 28;
                        }
                    } else {
                        if(i==month){
                            days = days + day;
                        }else {
                            days = days + 30;
                        }
                    }
                } else {
                    if(i==month){
                        days = days + day;
                    }else {
                        days = days + 31;
                    }
                }
            } else {

                if (i % 2 == 0) {
                    if(i==month){
                        days = days + day;
                    }else {
                        days = days + 31;
                    }
                } else {
                    if(i==month){
                        days = days + day;
                    }else {
                        days = days + 30;
                    }
                }
            }
        }
        return days;

    }

    private static int totalStartDays(int day, int month, int year) {
        int days = 0;
        boolean check = checkLeapYear(year);
        for (int i = month; i <= 12; i++) {
            if (i >= 1 && i <= 7) {
                if (i % 2 == 0) {
                    if (i == 2 && check) {
                        if (i == month) {
                            days = days + (29 - day);
                        } else {
                            days = days + 29;
                        }
                    } else if (i == 2 && check == false) {
                        if (i == month) {
                            days = days + (28 - day);
                        } else {
                            days = days + 28;
                        }
                    } else {
                        if (i == month) {
                            days = days + (30 - day);
                        }else {
                            days = days + 30;
                        }
                    }
                } else {
                    if (i == month) {
                        days = days + (31 - day);
                    }else {
                        days = days + 31;
                    }
                }
            } else {

                if (i % 2 == 0) {
                    if (i == month) {
                        days = days +(31 - day);
                    }else {
                        days = days + 31;
                    }
                } else {
                    if (i == month) {
                        days = days +(30 - day);
                    }else {
                        days = days + 30;
                    }
                }
            }
        }
        return days;
    }



    /*private static int diffrenceDaysBetweenYear(int startYear, int endYear) {
        int countLeapYear = 0;
        for (int i = startYear + 1; i < endYear; i++) {
            if (i % 400 == 0) {
                countLeapYear++;
            } else if (i % 4 == 0) {
                countLeapYear++;
            }
        }

        int diffrenceInYear = (endYear - startYear-1);
        int nonLeapYearCount = diffrenceInYear - countLeapYear;

        int totaldays = ((nonLeapYearCount * 365) + (countLeapYear * 366));
    }*/

    private static int diffrenceDaysBetweenYear(int startYear, int endYear) {
        int totalDays = 0;
        for (int i = startYear + 1; i < endYear; i++) {
            if (i % 400 == 0) {
                totalDays = totalDays + 366;
            } else if (i % 100 == 0) {
                totalDays = totalDays + 365;
            } else if (i % 4 == 0) {
                totalDays = totalDays + 366;
            } else {
                totalDays = totalDays + 365;
            }
        }

        return totalDays;
    }
}
