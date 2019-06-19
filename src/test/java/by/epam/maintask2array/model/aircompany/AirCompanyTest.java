//package by.epam.maintask2array.model.aircompany;
//
//import by.epam.maintask2array.exception.FileMissingException;
//import by.epam.maintask2array.exception.IllegalDataException;
//import by.epam.maintask2array.fileparser.FileDataParser;
//import by.epam.maintask2array.model.aircompany.AirCompany;
//import by.epam.maintask2array.model.planes.CargoPlane;
//import by.epam.maintask2array.model.planes.PassengerPlane;
//import by.epam.maintask2array.model.planes.Plane;
//import org.apache.log4j.Logger;
//import org.junit.Test;
//
//import java.io.File;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class AirCompanyTest {
//    private static final Logger LOGGER = Logger.getLogger(AirCompanyTest.class);
//
//    private static final File file = new File(
//            "./src/main/java/by/epam/javatraining/yurilukashevich/tasks/maintask02/input/input.txt");
//    private static Plane[] planes;
//
//    static {
//        try {
//            planes = FileDataParser.parseFile(file);
//        } catch (FileMissingException e) {
//            LOGGER.error("File not found!");
//            e.printStackTrace();
//        } catch (IllegalDataException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static AirCompany airCompany = new AirCompany(planes);
//
//    private static Plane expectedPlaneWithMaxPassengersCapacity = new PassengerPlane("Boeing-747", 380, 36100, 500);
//    private static Plane expectedPlaneWithMaxSpeed = new PassengerPlane("Boeing-787", 4380, 86100, 100);
//    private static Plane expectedPlaneWithMaxCargoCapacity = new CargoPlane("MegaCarrier", 180, 6100, 149876);
//
//
//    @Test
//    public void testGetPassengerPlanes() {
//    }
//
//    @Test
//    public void testGetCargoPlanes() {
//    }
//
//    @Test
//    public void testSortByMaxDistance() {
//    }
//
//    @Test
//    public void testSortByMaxSpeed() {
//    }
//
//
//    @Test
//    public void testGetPassengerPlanesOrderedByMaxPassengerCapacity() {
//    }
//
//    @Test
//    public void testGetPlaneWithMaxPassengerCapacity() {
//        PassengerPlane actualPlaneWithMaxPassengerCapacity = airCompany.getPlaneWithMaxPassengerCapacity();
//        assertEquals(expectedPlaneWithMaxPassengersCapacity, actualPlaneWithMaxPassengerCapacity);
//    }
//
//    @Test
//    public void testGetPlaneWithMaxCargoCapacity() {
//        CargoPlane actualPlaneWithMaxCargoCapacity = airCompany.getPlaneWithMaxCargoCapacity();
//        assertEquals(expectedPlaneWithMaxCargoCapacity, actualPlaneWithMaxCargoCapacity);
//    }
//
//    @Test
//    public void testGetPlaneWithMaxSpeed() {
//        Plane actualPlaneWithMaxSpeed = airCompany.getPlaneWithMaxSpeed();
//        assertEquals(expectedPlaneWithMaxSpeed, actualPlaneWithMaxSpeed);
//    }
//
//    @Test
//    public void testGetCargoPlanesOrderedByMaxCargoCapacity() {
//        List<CargoPlane> cargoPlanes = airCompany.getCargoPlanesOrderedByMaxCargoCapacity();
//
//        boolean nextPlaneMaxCargoCapacityIsHigherThanCurrent = true;
//        for (int i = 0; i < cargoPlanes.size() - 1; i++) {
//            CargoPlane currentPlane = cargoPlanes.get(i);
//            CargoPlane nextPlane = cargoPlanes.get(i + 1);
//            if (currentPlane.getMaxCargoCapacity() > nextPlane.getMaxCargoCapacity()) {
//                nextPlaneMaxCargoCapacityIsHigherThanCurrent = false;
//                break;
//            }
//        }
//        assertTrue(nextPlaneMaxCargoCapacityIsHigherThanCurrent);
//    }
//}