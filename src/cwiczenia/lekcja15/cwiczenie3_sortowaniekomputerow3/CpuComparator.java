package cwiczenia.lekcja15.cwiczenie3_sortowaniekomputerow3;

import java.util.Comparator;

public class CpuComparator implements Comparator<Computer> {
    //komparatory były odporne na porównywanie wartości null
    @Override
    public int compare(Computer comp1, Computer comp2) {
        if (comp1 == null && comp2 == null) // jeżeli komputer1 i komputer2 jest nullem to uznajemy je za równe
            return 0;
        if (comp1 != null && comp2 == null) //null na początku, jeżeli komputer1 nie jest nullem a komputer2 jest nuullem to zwracamy wartość dodatnią
            return -1;
        // return 1; null na końcu
        if (comp1 == null && comp2 != null) //// null na początku, jeżeli komputer1  jest nullem a komputer2  nie jest nuullem to zwracamy wartość ujemną
            return 1;
        // return -1; null na końcu, po wytrukowaniu
        //zapis poniżej można standardowo zapisać://return Integer.compare(comp1.getCpu(), comp2.getCpu());
        if (comp1.getCpu() > comp2.getCpu())
            return 1;
        else if (comp1.getCpu() < comp2.getCpu())
            return -1;
        else
            return 0;
        //lub
        //return Integer.compare(comp1.getCpu(), comp2.getCpu());
    }
}
