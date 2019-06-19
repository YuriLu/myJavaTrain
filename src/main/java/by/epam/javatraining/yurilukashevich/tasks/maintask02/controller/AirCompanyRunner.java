package by.epam.javatraining.yurilukashevich.tasks.maintask02.controller;

import by.epam.javatraining.yurilukashevich.tasks.maintask02.exception.FileMissingException;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.exception.IllegalDataException;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.fileparser.FileParser;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.aircompany.AirCompany;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.Plane;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.view.Printer;
import org.apache.log4j.Logger;
import java.io.File;
import java.util.List;

public class AirCompanyRunner {

    private static final Logger LOGGER = Logger.getLogger(AirCompanyRunner.class);
    private static final File file = new File(
            "./src/main/java/by/epam/javatraining/yurilukashevich/tasks/maintask02/input/input.txt");

    public static void main(String[] args) {

        List<Plane> planes = null;
        try {
            planes = FileParser.parseFile(file);
        } catch (FileMissingException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        } catch (IllegalDataException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }

        AirCompany airCompany = new AirCompany(planes);

        Printer.print("\nPassenger planes sorted by max passenger capacity:\n" + airCompany
                .getPassengerPlanesOrderedByMaxPassengerCapacity()
                .toString() + "\n");

        Printer.print("\nCargo planes sorted by max cargo capacity:\n" + airCompany
                .getCargoPlanesOrderedByMaxCargoCapacity()
                .toString() + "\n");

        airCompany.sortByMaxSpeed();
        Printer.print("\nPlanes sorted by max speed:\n" + airCompany.toString() + "\n");

        airCompany.sortByMaxDistance();
        Printer.print("\nPlanes sorted by max distance:\n" + airCompany.toString() + "\n");

        Printer.print("\nPlane with max speed:\n" + airCompany.getPlaneWithMaxSpeed().toString() + "\n");

        Printer.print("\nPlane with max distance:\n" + airCompany.getPlaneWithMaxDistance().toString() + "\n");
    }
}