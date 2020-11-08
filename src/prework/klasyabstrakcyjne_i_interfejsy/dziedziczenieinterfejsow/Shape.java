package prework.klasyabstrakcyjne_i_interfejsy.dziedziczenieinterfejsow;

public interface Shape {

    public static final double PI = 3.14; // public static final to jest domyślnie i nie trzeba zapisywać

    //jest to szablon metowd który będzie użyty w klasach reprezetujących figury

    // metody są domyślnie publiczne i abstrakcyjne
    double calculateArea();

    public double calculatePerimeter();
}
