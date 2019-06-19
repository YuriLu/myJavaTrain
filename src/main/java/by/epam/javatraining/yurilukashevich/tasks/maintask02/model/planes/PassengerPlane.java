package by.epam.javatraining.yurilukashevich.tasks.maintask02.model.planes;

import java.util.Objects;

/**
 * Class describes Passenger Planes.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public class PassengerPlane extends Plane {
    private int maxPassengerCapacity;

    public PassengerPlane(String planeModel, int maxSpeed, int maxDistance, int maxPassengerCapacity) {
        super(planeModel, maxSpeed, maxDistance);
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public int getMaxPassengerCapacity() {return maxPassengerCapacity;}

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", maxPassengerCapacity=" + maxPassengerCapacity +
                "}\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) {return false;}
        PassengerPlane plane = (PassengerPlane) o;
        return maxPassengerCapacity == plane.maxPassengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxPassengerCapacity);
    }
}
