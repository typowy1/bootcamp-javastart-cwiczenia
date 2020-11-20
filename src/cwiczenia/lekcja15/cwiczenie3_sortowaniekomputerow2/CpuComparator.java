package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow2;

import java.util.Comparator;

public class CpuComparator implements Comparator<Computer> {
    // sortujemy rosnąco po cpu
    @Override
    public int compare(Computer comp1, Computer comp2) {
        if (comp1.getCpu() > comp2.getCpu())
            return 1;
        else if (comp1.getCpu() < comp2.getCpu())
            return -1;
        else
            return 0;
        //lub
        //rosnąca
        //return Integer.compare(comp1.getCpu(), comp2.getCpu());
        //malejąco
        //return -Integer.compare(comp1.getCpu(), comp2.getCpu());
    }
}
