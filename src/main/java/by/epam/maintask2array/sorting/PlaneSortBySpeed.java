package by.epam.maintask2array.sorting;

import by.epam.maintask2array.model.planes.Plane;
import java.util.Comparator;

public class PlaneSortBySpeed implements Comparator<Plane>{
    @Override
    public int compare(Plane o1, Plane o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
    }
}

/*Arrays.sort(aSoftware, new Comparator<Software>() {
    public int compare(Software s1, Software s2) {
        return s1.getSoftwareTitle().compareTo(s2.getSoftwareTitle());
    }
});
*/
