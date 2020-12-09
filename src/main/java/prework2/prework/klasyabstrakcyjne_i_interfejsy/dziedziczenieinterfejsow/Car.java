package prework2.prework.klasyabstrakcyjne_i_interfejsy.dziedziczenieinterfejsow;

public interface Car {

    public default void printName() {
        System.out.print("Car");
    }
}
