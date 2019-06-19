package by.epam.maintask2array.sorting;

import by.epam.maintask2array.model.planes.PassengerPlane;
import java.util.Comparator;

/**
 * Class describes AirCompany.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public class PlaneSortByMaxPassengerCapacity implements Comparator<PassengerPlane>{

    @Override
    public int compare(PassengerPlane o1, PassengerPlane o2) {
        return o1.getMaxPassengerCapacity() - o2.getMaxPassengerCapacity();
    }
}