package by.epam.javatraining.yurilukashevich.tasks.maintask02.fileparser;

import by.epam.javatraining.yurilukashevich.tasks.maintask02.exception.FileMissingException;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.exception.IllegalDataException;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.CargoPlane;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.PassengerPlane;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.Plane;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
    private static final Logger LOGGER = Logger.getLogger(FileParser.class);

    private static final String DELIMS = "[:]";
    private static final String TYPE_PASSENGER = "PASSENGER";
    private static final String TYPE_CARGO = "CARGO";

    public static List<Plane> parseFile(File file) throws FileMissingException, IllegalDataException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LOGGER.error("File not found! Please check the entered path");
            throw new FileMissingException(e);
        }
        scanner.useDelimiter(":\n");
        List<Plane> planesFromFile = new ArrayList<>();
        List<String> arrayOfStringsFromInput = new ArrayList<>();
        while(scanner.hasNextLine()) {
            arrayOfStringsFromInput.add(scanner.nextLine());
        }

        for (int i=0; i < arrayOfStringsFromInput.size(); i++) {
            String[] tokens = arrayOfStringsFromInput.get(i).split(DELIMS);
            String type = tokens[0];
            String planeModel = tokens[1];
            int maxSpeed= Integer.parseInt(tokens[2]);
            int maxDistance = Integer.parseInt(tokens[3]);
            int capacity = Integer.parseInt(tokens[4]);

            if ((!type.equals(TYPE_PASSENGER) || !type.equals(TYPE_CARGO))
                    && (maxSpeed < 0) && (maxDistance < 0) && (capacity < 0)) {
                LOGGER.error("Data in file is incorrect! Please check the file!");
                throw new IllegalDataException("Data in file is incorrect! Please check the file!");
            }

            if (type.equals(TYPE_PASSENGER)) {
                planesFromFile.add(new PassengerPlane(planeModel, maxSpeed, maxDistance, capacity));}
            else if (type.equals(TYPE_CARGO)) {
                planesFromFile.add(new CargoPlane(planeModel, maxSpeed, maxDistance, capacity));}
            else {planesFromFile.add(null);}
        }
        scanner.close();
        return planesFromFile;
    }
}



