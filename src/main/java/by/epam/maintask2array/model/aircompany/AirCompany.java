package by.epam.maintask2array.model.aircompany;

import by.epam.maintask2array.model.planes.CargoPlane;
import by.epam.maintask2array.model.planes.PassengerPlane;
import by.epam.maintask2array.model.planes.Plane;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * Class describes AirCompany.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public class AirCompany {
    private static final Logger LOGGER = Logger.getLogger(AirCompany.class);
    private static Plane[] planes;
    private static int length = planes.length;

    public AirCompany(Plane[] planes) {
        this.planes = planes;
    }

    public PassengerPlane[] getPassengerPlanes() {
        PassengerPlane[] passengerPlanes = new PassengerPlane[length];
        for (int i = 0; i < length; i++) {
            if (planes[i] instanceof PassengerPlane) {
                passengerPlanes[i] = (PassengerPlane) planes[i];
            }
        }
        return passengerPlanes;
    }

    public CargoPlane[] getCargoPlanes() {
        CargoPlane[] cargoPlanes = new CargoPlane[length];
        for (int i = 0; i < length; i++) {
            if (planes[i] instanceof CargoPlane) {
                cargoPlanes[i] = (CargoPlane) planes[i];
            }
        }
        return cargoPlanes;
    }

//    public void sortByMaxDistance() {
//        Collections.sort(planes, new Comparator<Plane>() {
//            public int compare(Plane planeFirst, Plane planeSecond) {
//                return planeFirst.getMaxDistance() - planeSecond.getMaxDistance();
//            }
//        });
//    }
//
//    public void sortByMaxSpeed() {
//        Collections.sort(planes, new Comparator<Plane>() {
//            public int compare(Plane planeFirst, Plane planeSecond) {
//                return planeFirst.getMaxSpeed() - planeSecond.getMaxSpeed();
//            }
//        });
//    }
//
//
//    public List<CargoPlane> getCargoPlanesOrderedByMaxCargoCapacity() {
//        List<CargoPlane> cargoPlanes = getCargoPlanes();
//        Collections.sort(cargoPlanes, new Comparator<CargoPlane>() {
//            public int compare(CargoPlane planeFirst, CargoPlane planeSecond) {
//                return planeFirst.getMaxCargoCapacity() - planeSecond.getMaxCargoCapacity();
//            }
//        });
//        return cargoPlanes;
//    }
//
//    public List<PassengerPlane> getPassengerPlanesOrderedByMaxPassengerCapacity() {
//        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
//        Collections.sort(passengerPlanes, new Comparator<PassengerPlane>() {
//            public int compare(PassengerPlane planeFirst, PassengerPlane planeSecond) {
//                return planeFirst.getMaxPassengerCapacity() - planeSecond.getMaxPassengerCapacity();
//            }
//        });
//        return passengerPlanes;
//    }
//
//    public Plane getPlaneWithMaxSpeed() {
//        Plane maxSpeedPlane = planes.get(0);
//        for (Plane plane : planes) {
//            if (plane.getMaxSpeed() > maxSpeedPlane.getMaxSpeed()) {
//                maxSpeedPlane = plane;
//            }
//        }
//        return maxSpeedPlane;
//    }
//
//    public Plane getPlaneWithMaxDistance() {
//        Plane maxDistancePlane = planes.get(0);
//        for (Plane plane : planes) {
//            if (plane.getMaxDistance() > maxDistancePlane.getMaxDistance()) {
//                maxDistancePlane = plane;
//            }
//        }
//        return maxDistancePlane;
//    }
//
//    public PassengerPlane getPlaneWithMaxPassengerCapacity() {
//        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
//        PassengerPlane maxPassengerCapacityPlane = passengerPlanes.get(0);
//        for (PassengerPlane passengerPlane : passengerPlanes) {
//            if (passengerPlane.getMaxPassengerCapacity() > maxPassengerCapacityPlane.getMaxPassengerCapacity()) {
//                maxPassengerCapacityPlane = passengerPlane;
//            }
//        }
//        return maxPassengerCapacityPlane;
//    }
//
//    public CargoPlane getPlaneWithMaxCargoCapacity() {
//        List<CargoPlane> cargoPlanes = getCargoPlanes();
//        CargoPlane maxCargoCapacityPlane = cargoPlanes.get(0);
//        for (CargoPlane cargoPlane : cargoPlanes) {
//            if (cargoPlane.getMaxCargoCapacity() > maxCargoCapacityPlane.getMaxCargoCapacity()) {
//                maxCargoCapacityPlane = cargoPlane;
//            }
//        }
//        return maxCargoCapacityPlane;
//    }


    @Override
    public String toString() {
        return "AirCompany{" + planes + "}";
    }
}
