package by.epam.javatraining.yurilukashevich.lesson05.addUnit.model;

public class DateLogic {

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;
    public static final int DIVIDER_FOR_LEAP_YEAR_400 = 400;
    public static final int DIVIDER_FOR_LEAP_YEAR_100 = 100;
    public static final int DIVIDER_FOR_LEAP_YEAR_4 = 4;

    public static String getNextDay(int day, int month, int year) {
        int nextDay = 1;
        int nextMonth = month + 1;
        String result = "Incorrect input";
        boolean longMonth = month == JANUARY || month == MARCH || month == MAY || month == JULY
                || month == AUGUST || month == OCTOBER;
        boolean shortMonth = month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER;
        boolean february = month == FEBRUARY;
        boolean december = month == DECEMBER;
        boolean leapYear = (year % DIVIDER_FOR_LEAP_YEAR_400 == 0 && year % DIVIDER_FOR_LEAP_YEAR_100 == 0
                && year % DIVIDER_FOR_LEAP_YEAR_4 == 0) || (year % DIVIDER_FOR_LEAP_YEAR_4 == 0
                && year % DIVIDER_FOR_LEAP_YEAR_100 != 0);

        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year >= 0) {
            if (day == 31) {
                if (december) {
                    nextMonth = 1;
                    year += 1;
                } else if (!longMonth) {
                    return result;
                }
            } else if (day == 30) {
                if (!shortMonth) {
                    nextMonth = month;
                } else if (february) {
                    return result;
                }
            } else if (day == 29 && february) {
                if (!leapYear) {
                    return result;
                }
            } else if (day == 28 && february) {
                if (leapYear) {
                    nextDay = day + 1;
                    nextMonth = month;
                }
            } else {
                nextDay = day + 1;
            }
            result = "Next day is: " + nextDay + "." + nextMonth + "." + year;
        }
        return result;
    }
}
