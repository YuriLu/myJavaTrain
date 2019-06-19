package by.epam.javatraining.yurilukashevich.tasks.maintask02.model.aircompany;

import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.CargoPlane;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.PassengerPlane;
import by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes.Plane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class describes AirCompany.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public class AirCompany {

    private List<Plane> planes;

    public AirCompany(List<Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<CargoPlane> getCargoPlanes() {
        List<CargoPlane> cargoPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof CargoPlane) {
                cargoPlanes.add((CargoPlane) plane);
            }
        }
        return cargoPlanes;
    }

    public void sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane planeFirst, Plane planeSecond) {
                return planeFirst.getMaxDistance() - planeSecond.getMaxDistance();
            }
        });
    }

    public void sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane planeFirst, Plane planeSecond) {
                return planeFirst.getMaxSpeed() - planeSecond.getMaxSpeed();
            }
        });
    }


    public List<CargoPlane> getCargoPlanesOrderedByMaxCargoCapacity() {
        List<CargoPlane> cargoPlanes = getCargoPlanes();
        Collections.sort(cargoPlanes, new Comparator<CargoPlane>() {
            public int compare(CargoPlane planeFirst, CargoPlane planeSecond) {
                return planeFirst.getMaxCargoCapacity() - planeSecond.getMaxCargoCapacity();
            }
        });
        return cargoPlanes;
    }

    public List<PassengerPlane> getPassengerPlanesOrderedByMaxPassengerCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        Collections.sort(passengerPlanes, new Comparator<PassengerPlane>() {
            public int compare(PassengerPlane planeFirst, PassengerPlane planeSecond) {
                return planeFirst.getMaxPassengerCapacity() - planeSecond.getMaxPassengerCapacity();
            }
        });
        return passengerPlanes;
    }

    public Plane getPlaneWithMaxSpeed() {
        Plane maxSpeedPlane = planes.get(0);
        for (Plane plane : planes) {
            if (plane.getMaxSpeed() > maxSpeedPlane.getMaxSpeed()) {
                maxSpeedPlane = plane;
            }
        }
        return maxSpeedPlane;
    }

    public Plane getPlaneWithMaxDistance() {
        Plane maxDistancePlane = planes.get(0);
        for (Plane plane : planes) {
            if (plane.getMaxDistance() > maxDistancePlane.getMaxDistance()) {
                maxDistancePlane = plane;
            }
        }
        return maxDistancePlane;
    }

    public PassengerPlane getPlaneWithMaxPassengerCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane maxPassengerCapacityPlane = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getMaxPassengerCapacity() > maxPassengerCapacityPlane.getMaxPassengerCapacity()) {
                maxPassengerCapacityPlane = passengerPlane;
            }
        }
        return maxPassengerCapacityPlane;
    }

    public CargoPlane getPlaneWithMaxCargoCapacity() {
        List<CargoPlane> cargoPlanes = getCargoPlanes();
        CargoPlane maxCargoCapacityPlane = cargoPlanes.get(0);
        for (CargoPlane cargoPlane : cargoPlanes) {
            if (cargoPlane.getMaxCargoCapacity() > maxCargoCapacityPlane.getMaxCargoCapacity()) {
                maxCargoCapacityPlane = cargoPlane;
            }
        }
        return maxCargoCapacityPlane;
    }


    @Override
    public String toString() {
        return "AirCompany{" + planes + "}";
    }
}
