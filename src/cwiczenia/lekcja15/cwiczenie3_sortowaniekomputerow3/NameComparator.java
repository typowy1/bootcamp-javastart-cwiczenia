package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow3;

import java.util.Comparator;

public class NameComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer comp1, Computer comp2) {
        if (comp1 == null && comp2 == null)
            return 0;
        if (comp1 != null && comp2 == null)
            return -1;
        if (comp1 == null && comp2 != null)
            return 1;
        if (comp1.getName() == null && comp2.getName() == null)
            return 0;
        if (comp1.getName() == null)
            return -1;
        return comp1.getName().compareTo(comp2.getName());
    }
}
