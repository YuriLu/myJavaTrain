package by.epam.maintask2array.fileparser;

import by.epam.maintask2array.exception.FileMissingException;
import by.epam.maintask2array.exception.IllegalDataException;
import by.epam.maintask2array.model.planes.CargoPlane;
import by.epam.maintask2array.model.planes.PassengerPlane;
import by.epam.maintask2array.model.planes.Plane;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDataParser {
    private static final Logger LOGGER = Logger.getLogger(FileDataParser.class);


    private static Plane[] planes;

    private static final int DEFAULT_SIZE = 10;
    private static final int MAX_SIZE = 1_000_000_000;
    private static int elementsInArray;
    private static int capacity;
    private static String[] stringDataArray;

    private static final String DELIMS = "[:]";
    private static final String TYPE_PASSENGER = "PASSENGER";
    private static final String TYPE_CARGO = "CARGO";


    public static Plane[] parseFile(File file) throws FileMissingException, IllegalDataException {
        String[] dataArray = getDataArray(file);

        int size = dataArray.length;
        planes = new Plane[size];

        for (int i = 0; i < size; i++) {
            String[] tokens = dataArray[i].split(DELIMS);
            String type = tokens[0];
            String planeModel = tokens[1];
            int maxSpeed = Integer.parseInt(tokens[2]);
            int maxDistance = Integer.parseInt(tokens[3]);
            int capacity = Integer.parseInt(tokens[4]);

            if ((!type.equals(TYPE_PASSENGER) || !type.equals(TYPE_CARGO))
                    && (maxSpeed < 0) && (maxDistance < 0) && (capacity < 0)) {
                LOGGER.error("Data in file is incorrect! Please check the file!");
                throw new IllegalDataException("Data in file is incorrect! Please check the file!");
            }

            if (type.equals(TYPE_PASSENGER)) {
                planes[i] = new PassengerPlane(planeModel, maxSpeed, maxDistance, capacity);
            } else if (type.equals(TYPE_CARGO)) {
                planes[i] = new CargoPlane(planeModel, maxSpeed, maxDistance, capacity);
            }
        }
        return planes;
    }

    private static String[] getDataArray(File file) throws FileMissingException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LOGGER.error("File not found! Please check the entered path");
            throw new FileMissingException(e);
        }
        scanner.useDelimiter(":\n");

        capacity = DEFAULT_SIZE;
        stringDataArray = new String[capacity];
        elementsInArray = 0;

        while (scanner.hasNextLine()) {
            add(stringDataArray, scanner.nextLine());
        }
        scanner.close();
        return stringDataArray;
    }

    private static void add(String[] stringDataArray, String element) {
        if (elementsInArray == capacity) {
            increaseArray();
        }
        stringDataArray[elementsInArray] = element;
        LOGGER.info("Added new String to stringDataArray at position " + elementsInArray);
        elementsInArray++;
    }

    private static void increaseArray() {
        if (capacity > MAX_SIZE / 3) {
            LOGGER.warn("Max value has reached for Array capacity");
            return;
        }
        int newSize = capacity * 2 + 10;
        String[] newArray = new String[newSize];
        for (int i = 0; i < elementsInArray; i++) {
            newArray[i] = stringDataArray[i];
        }
        stringDataArray = newArray;
        LOGGER.info("Set new size for array " + newSize);
    }
}