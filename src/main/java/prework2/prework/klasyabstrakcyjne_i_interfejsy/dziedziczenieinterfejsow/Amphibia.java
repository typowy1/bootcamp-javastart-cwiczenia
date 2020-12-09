package prework2.prework.klasyabstrakcyjne_i_interfejsy.dziedziczenieinterfejsow;

public class Amphibia implements Car, Boat {

    @Override // rozwiązaniem problemu dziedziczenia tej samej metody z dwóch różnych interfejsów jest jej nadpisanie
    // @Override i odwołać sie do nich przez słowo suuper
    public void printName() {

        System.out.println("Amphibia");
        System.out.print("Amfibia to trochę ");
        Car.super.printName();
        System.out.print(" a trochę ");
        Boat.super.printName();

        //odwołanie się do metod domyślnych z interfejsów

        Car.super.printName();
        Boat.super.printName();
    }
}
