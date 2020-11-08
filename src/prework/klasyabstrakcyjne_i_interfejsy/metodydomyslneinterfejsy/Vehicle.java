package prework.klasyabstrakcyjne_i_interfejsy.metodydomyslneinterfejsy;

public interface Vehicle {
    default public int speedUp(int speed) {
        return speed++;
    }
//    metody nie niszczą projektu to znaczy żę dodająć tą metodę do interfejsu nie musimy implementować tej metody do klas które dziedziczą
}
