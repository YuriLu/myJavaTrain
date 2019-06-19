package by.epam.maintask2array.sorting;

import by.epam.maintask2array.model.planes.PassengerPlane;
import by.epam.maintask2array.model.planes.Plane;
import java.util.Comparator;

/**
 * Class describes AirCompany.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

//public class PlaneSortByMax implements Comparator<PassengerPlane>{
//
//    @Override
//    public int compare(PassengerPlane o1, PassengerPlane o2) {
//        return o1.getMaxPassengerCapacity() - o2.getMaxPassengerCapacity();
//    }
//}
//
//
//
//
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
//}
