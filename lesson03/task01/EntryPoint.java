package lesson03.task01;

import lesson03.serviceModule.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        double celsiusDegree;
        double fahrenheiteDegree;
        double kelvinDegree;
        double rankinDegree;

        celsiusDegree = 45;
        fahrenheiteDegree = DegreeConverterLogic.convertCelsiusToFahrenheit(celsiusDegree);
        rankinDegree = DegreeConverterLogic.convertFahrenheitToRankin(fahrenheiteDegree);
        kelvinDegree = DegreeConverterLogic.convertCelsiusToKelvin(celsiusDegree);

        Printer.print("\n" + celsiusDegree + " Celsius degrees = " + fahrenheiteDegree + " Fahrenheit degrees = "
                + rankinDegree + " Rankin degrees = " + kelvinDegree + " Kelvin degrees");

        rankinDegree = 487;
        fahrenheiteDegree = DegreeConverterLogic.convertRankinToFahrenheit(rankinDegree);
        celsiusDegree = DegreeConverterLogic.convertFahrenheitToCelsius(fahrenheiteDegree);
        kelvinDegree = DegreeConverterLogic.convertFahrenheitToKelvin(fahrenheiteDegree);

        Printer.print("\n" + rankinDegree + " Rankin degrees = " + fahrenheiteDegree + " Fahrenheit degrees = "
                + celsiusDegree + " Celsius degrees = " + kelvinDegree + " Kelvin degrees");
    }

}
