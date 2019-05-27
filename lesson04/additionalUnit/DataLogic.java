package lesson04.additionalUnit;

public class DataLogic {

    //19
    public static void dataConverter(int size) {
        double kilobytes = size / 1024.00;
        double megabytes = kilobytes / 1024;

        System.out.printf("in KiloBytes = %.2f", kilobytes);
        System.out.printf("\nin MegaBytes = %.2f\n", megabytes);
    }

    //20
    public static void distanceConverter(int distance) {

        double meters = distance / 100.00;
        double kilometers = meters / 1000;

        System.out.printf("in meters = %.2f", meters);
        System.out.printf("\nin kilometers = %.2f\n", kilometers);
    }
}
