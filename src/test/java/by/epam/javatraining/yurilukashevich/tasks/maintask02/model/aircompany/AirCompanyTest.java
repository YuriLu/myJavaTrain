package by.epam.javatraining.yurilukashevich.tasks.maintask02.model.aircompany;

import by.epam.javatraining.yurilukashevich.tasks.maintask02.exception.FileMissingException;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.exception.IllegalDataException;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.fileparser.FileParser;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.CargoPlane;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.PassengerPlane;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.Plane;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

public class AirCompanyTest {
    private static final Logger LOGGER = Logger.getLogger(AirCompanyTest.class);

    private static final File file = new File(
            "./src/main/java/by/epam/javatraining/yurilukashevich/tasks/maintask02/input/input.txt");
    private static List<Plane> planes;
    private static AirCompany airCompany = new AirCompany(planes);

    private static Plane expectedPlaneWithMaxPassengersCapacity
            = new PassengerPlane("Boeing-747", 380, 36100, 500);
    private static Plane expectedPlaneWithMaxSpeed
            = new PassengerPlane("Boeing-787", 4380, 86100, 100);
    private static Plane expectedPlaneWithMaxCargoCapacity
            = new CargoPlane("MegaCarrier", 180, 6100, 149876);

    @BeforeClass
    public static void setUp() {
        try {
            planes = FileParser.parseFile(file);
        } catch (FileMissingException e) {
            LOGGER.error("File not found!");
            e.printStackTrace();
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = airCompany.getPassengerPlanes();
        PassengerPlane[] expectedPassengerPlanesArray = (PassengerPlane[]) passengerPlanes.toArray();
        List<PassengerPlane> actualPassengerPlanes = airCompany.getPassengerPlanes();
        PassengerPlane[] actualPassengerPlanesArray = (PassengerPlane[]) actualPassengerPlanes.toArray();
        assertArrayEquals(expectedPassengerPlanesArray, actualPassengerPlanesArray);
    }

    @Test
    public void testGetCargoPlanes() {
    }

    @Test
    public void testSortByMaxDistance() {
    }

    @Test
    public void testSortByMaxSpeed() {
        airCompany.sortByMaxSpeed();
        AirCompany expectedSortByMaxSpeedPlanes = airCompany;
        airCompany.sortByMaxSpeed();
        AirCompany actualSortByMaxSpeedPlanes = airCompany;
        assertEquals(expectedSortByMaxSpeedPlanes, actualSortByMaxSpeedPlanes);
    }


    @Test
    public void testGetPassengerPlanesOrderedByMaxPassengerCapacity() {
    }

    @Test
    public void testGetPlaneWithMaxPassengerCapacity() {
        PassengerPlane actualPlaneWithMaxPassengerCapacity = airCompany.getPlaneWithMaxPassengerCapacity();
        assertEquals(expectedPlaneWithMaxPassengersCapacity, actualPlaneWithMaxPassengerCapacity);
    }

    @Test
    public void testGetPlaneWithMaxCargoCapacity() {
        CargoPlane actualPlaneWithMaxCargoCapacity = airCompany.getPlaneWithMaxCargoCapacity();
        assertEquals(expectedPlaneWithMaxCargoCapacity, actualPlaneWithMaxCargoCapacity);
    }

    @Test
    public void testGetPlaneWithMaxSpeed() {
        Plane actualPlaneWithMaxSpeed = airCompany.getPlaneWithMaxSpeed();
        assertEquals(expectedPlaneWithMaxSpeed, actualPlaneWithMaxSpeed);
    }

    @Test
    public void testGetCargoPlanesOrderedByMaxCargoCapacity() {
        List<CargoPlane> cargoPlanes = airCompany.getCargoPlanesOrderedByMaxCargoCapacity();

        boolean nextPlaneMaxCargoCapacityIsHigherThanCurrent = true;
        for (int i = 0; i < cargoPlanes.size() - 1; i++) {
            CargoPlane currentPlane = cargoPlanes.get(i);
            CargoPlane nextPlane = cargoPlanes.get(i + 1);
            if (currentPlane.getMaxCargoCapacity() > nextPlane.getMaxCargoCapacity()) {
                nextPlaneMaxCargoCapacityIsHigherThanCurrent = false;
                break;
            }
        }
        assertTrue(nextPlaneMaxCargoCapacityIsHigherThanCurrent);
    }
}