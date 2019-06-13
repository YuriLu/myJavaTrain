package by.epam.javatraining.yurilukashevich.lesson03.task01;

import by.epam.javatraining.yurilukashevich.lesson03.serviceModule.Printer;

public class EntryPoint {
    public static void main(String[] args) {

        double celsiusDegree = 45;
        double fahrenheitDegree = DegreeConverterLogic.convertCelsiusToFahrenheit(celsiusDegree);
        double rankinDegree = DegreeConverterLogic.convertFahrenheitToRankin(fahrenheitDegree);
        double kelvinDegree = DegreeConverterLogic.convertCelsiusToKelvin(celsiusDegree);

        Printer.print("\n" + celsiusDegree + " Celsius degrees = " + fahrenheitDegree
                + " Fahrenheit degrees = " + rankinDegree
                + " Rankin degrees = " + kelvinDegree + " Kelvin degrees\n");

        rankinDegree = 487;
        fahrenheitDegree = DegreeConverterLogic.convertRankinToFahrenheit(rankinDegree);
        celsiusDegree = DegreeConverterLogic.convertFahrenheitToCelsius(fahrenheitDegree);
        kelvinDegree = DegreeConverterLogic.convertFahrenheitToKelvin(fahrenheitDegree);

        Printer.print("\n" + rankinDegree + " Rankin degrees = " + fahrenheitDegree
                + " Fahrenheit degrees = " + celsiusDegree
                + " Celsius degrees = " + kelvinDegree + " Kelvin degrees\n");
    }
}
