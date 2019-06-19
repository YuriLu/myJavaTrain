package by.epam.maintask2array.model.planes;

import java.util.Objects;

/**
 * Class describes Cargo Planes.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public class CargoPlane extends Plane {
    private int maxCargoCapacity;

    public CargoPlane(String planeModel, int maxSpeed, int maxDistance, int maxCargoCapacity) {
        super(planeModel, maxSpeed, maxDistance);
        this.maxCargoCapacity = maxCargoCapacity;
    }

    public int getMaxCargoCapacity() {return maxCargoCapacity;}

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", maxCargoCapacity=" + maxCargoCapacity +
                "}\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) {return false;}
        CargoPlane plane = (CargoPlane) o;
        return maxCargoCapacity == plane.maxCargoCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxCargoCapacity);
    }
}
