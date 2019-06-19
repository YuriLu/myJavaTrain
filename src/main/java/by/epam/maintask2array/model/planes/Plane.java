package by.epam.maintask2array.model.planes;

import java.util.Objects;

/**
 * Class describes Planes.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public abstract class Plane {
    private String planeModel;
    private int maxSpeed;
    private int maxDistance;

    public Plane(String planeModel, int maxSpeed, int maxDistance) {
        this.planeModel = planeModel;
        this.maxSpeed = maxSpeed;
        this.maxDistance = maxDistance;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model=" + planeModel + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxDistance +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) {
            return false;
        }
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                maxDistance == plane.maxDistance &&
                Objects.equals(planeModel, plane.planeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, maxSpeed, maxDistance);
    }
}
