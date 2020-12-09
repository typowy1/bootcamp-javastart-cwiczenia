package prework2.prework.klasyabstrakcyjne_i_interfejsy.dziedziczenieinterfejsow;

public interface Boat {

    public default void printName() {
        System.out.print("Boat");
    }
}
