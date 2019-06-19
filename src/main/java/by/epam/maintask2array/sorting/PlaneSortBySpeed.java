package by.epam.maintask2array.sorting;

import by.epam.maintask2array.model.planes.Plane;
import java.util.Comparator;

public class PlaneSortBySpeed implements Comparator<Plane>{
    @Override
    public int compare(Plane o1, Plane o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
    }
}