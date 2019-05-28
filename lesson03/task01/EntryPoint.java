package by.epam.training.yurilukashevich.lesson03.task01;

import by.epam.training.yurilukashevich.lesson03.serviceModule.Printer;

public class EntryPoint {
    public static void main(String[] args) {

        double celsiusDegree = 45;
        double fahrenheiteDegree = DegreeConverterLogic.convertCelsiusToFahrenheit(celsiusDegree);
        double rankinDegree = DegreeConverterLogic.convertFahrenheitToRankin(fahrenheiteDegree);
        double kelvinDegree = DegreeConverterLogic.convertCelsiusToKelvin(celsiusDegree);

        Printer.print("\n" + celsiusDegree + " Celsius degrees = " + fahrenheiteDegree
                + " Fahrenheit degrees = " + rankinDegree
                + " Rankin degrees = " + kelvinDegree + " Kelvin degrees\n");

        rankinDegree = 487;
        fahrenheiteDegree = DegreeConverterLogic.convertRankinToFahrenheit(rankinDegree);
        celsiusDegree = DegreeConverterLogic.convertFahrenheitToCelsius(fahrenheiteDegree);
        kelvinDegree = DegreeConverterLogic.convertFahrenheitToKelvin(fahrenheiteDegree);

        Printer.print("\n" + rankinDegree + " Rankin degrees = " + fahrenheiteDegree
                + " Fahrenheit degrees = " + celsiusDegree
                + " Celsius degrees = " + kelvinDegree + " Kelvin degrees\n");
    }
}
