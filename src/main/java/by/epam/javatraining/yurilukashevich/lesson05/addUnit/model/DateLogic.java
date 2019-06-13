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

    public static final int MAX_DAY_LONG_MONTH = 31;
    public static final int MAX_DAY_SHORT_MONTH = 30;
    public static final int MAX_DAY_FEBRUARY_FOR_LEAP_YEAR = 29;
    public static final int MAX_DAY_FEBRUARY = 28;
    public static final int MONTH_IN_YEAR = 12;

    public static String checkNextDay(int day, int month, int year) {
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

        if (day > 0 && day <= MAX_DAY_LONG_MONTH && month > 0 && month <= MONTH_IN_YEAR && year >= 0) {
            if (day == MAX_DAY_LONG_MONTH) {
                if (december) {
                    nextMonth = 1;
                    year += 1;
                } else if (!longMonth) {
                    return result;
                }
            } else if (day == MAX_DAY_SHORT_MONTH) {
                if (!shortMonth) {
                    nextMonth = month;
                } else if (february) {
                    return result;
                }
            } else if (day == MAX_DAY_FEBRUARY_FOR_LEAP_YEAR && february) {
                if (!leapYear) {
                    return result;
                }
            } else if (day == MAX_DAY_FEBRUARY && february) {
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
