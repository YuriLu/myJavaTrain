package by.epam.maintask2array.controller;

import by.epam.maintask2array.exception.FileMissingException;
import by.epam.maintask2array.exception.IllegalDataException;
import by.epam.maintask2array.fileparser.FileDataParser;
import by.epam.maintask2array.model.aircompany.AirCompany;
import by.epam.maintask2array.model.planes.Plane;
import by.epam.maintask2array.view.Printer;

import org.apache.log4j.Logger;

import java.io.File;

public class AirCompanyRunner {

    private static final Logger LOGGER = Logger.getLogger(AirCompanyRunner.class);
    private static final File file = new File(
            "./src/main/java/by/epam/maintask2array/input/input.txt");

    public static void main(String[] args) {
        Plane[] planes = new Plane[0];
        try {
            planes = FileDataParser.parseFile(file);
        } catch (FileMissingException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        } catch (IllegalDataException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }

        AirCompany airCompany = new AirCompany(planes);

//        Printer.print("\nPassenger planes sorted by max passenger capacity:\n" + airCompany
//                .getPassengerPlanesOrderedByMaxPassengerCapacity()
//                .toString() + "\n");
//
//        Printer.print("\nCargo planes sorted by max cargo capacity:\n" + airCompany
//                .getCargoPlanesOrderedByMaxCargoCapacity()
//                .toString() + "\n");
//
//        airCompany.sortByMaxSpeed();
//        Printer.print("\nPlanes sorted by max speed:\n" + airCompany.toString() + "\n");
//
//        airCompany.sortByMaxDistance();
//        Printer.print("\nPlanes sorted by max distance:\n" + airCompany.toString() + "\n");
//
//        Printer.print("\nPlane with max speed:\n" + airCompany.getPlaneWithMaxSpeed().toString() + "\n");
//
//        Printer.print("\nPlane with max distance:\n" + airCompany.getPlaneWithMaxDistance().toString() + "\n");

        Plane[] pass = airCompany.getPassengerPlanes();
        Printer.print(pass.toString());
    }
}