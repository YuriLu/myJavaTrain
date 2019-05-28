package by.epam.training.yurilukashevich.lesson03.task01;

public class DegreeConverterLogic {
    public static double convertCelsiusToFahrenheit(double celsiusDegree) {
        return 9 / 5.0 * celsiusDegree + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheiteDegree) {
        return 5 / 9.0 * (fahrenheiteDegree - 32);
    }

    public static double convertCelsiusToKelvin(double celsiusDegree) {
        return celsiusDegree + 273.15;
    }

    public static double convertFahrenheitToKelvin(double fahrenheiteDegree) {
        return (fahrenheiteDegree - 32) * 5 / 9.0 + 273.15;
    }

    public static double convertRankinToFahrenheit(double rankinDegree) {
        return rankinDegree - 459.67;
    }

    public static double convertFahrenheitToRankin(double fahrenheiteDegree) {
        return fahrenheiteDegree + 459.67;
    }
}