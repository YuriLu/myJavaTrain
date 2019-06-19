package by.epam.maintask2array.sorting;

import by.epam.maintask2array.model.planes.CargoPlane;
import java.util.Comparator;

/**
 * Class describes AirCompany.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public class PlaneSortByMaxCargoCapacity implements Comparator<CargoPlane>{

    @Override
    public int compare(CargoPlane o1, CargoPlane o2) {
        return o1.getMaxCargoCapacity() - o2.getMaxCargoCapacity();
    }
}