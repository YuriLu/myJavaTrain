package by.epam.javatraining.yurilukashevich.lesson05.addUnit.model;

public class DateLogic {

    public static String getNextDay(int day, int month, int year) {

        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPTEMBER = 9;
        final int OCTOBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;

        boolean longMonth = month == JANUARY || month == MARCH || month == MAY || month == JULY
                || month == AUGUST || month == OCTOBER;
        boolean shortMonth = month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER;
        boolean february = month == FEBRUARY;
        boolean december = month == DECEMBER;
        boolean leapYear = (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) || (year % 4 == 0 && year % 100 != 0);
        String result = "Incorrect input";

        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year >= 0) {
            if (day == 31) {
                if (december) {
                    day = 1;
                    month = 1;
                    year += 1;
                } else if (longMonth) {
                    day = 1;
                    month += 1;
                } else {
                    return result;
                }
            } else if (day == 30) {
                if (february) {
                    return result;
                } else if (shortMonth) {
                    day = 1;
                    month += 1;
                }
            } else if (day == 29 && february) {
                if (leapYear) {
                    day = 1;
                    month += 1;
                } else {
                    return result;
                }
            } else if (day == 28 && february) {
                if (!leapYear) {
                    day = 1;
                    month += 1;
                } else {
                    day += 1;
                }
            } else {
                day += 1;
            }
            result = "Next day is: " + day + "." + month + "." + year;
        }
        return result;
    }
}
