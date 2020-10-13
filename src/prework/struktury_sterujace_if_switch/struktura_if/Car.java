package prework.struktury_sterujace_if_switch.struktura_if;

public class Car {
    private String name;
    private double fuel;// paliwo
    private boolean checkEngine;// czy silnik jest sprawny, kontrolka się nie świeci
    private boolean engineOn;// czy silnik jest włączony

    public Car(String name, double fuel, boolean checkEngine, boolean engineOn) {
        this.name = name;
        this.fuel = fuel;
        this.checkEngine = checkEngine; //fals = sprawny, czyli kontrolka się nie świeci, nie wystąpiła żadna usterka, true = zepsuty, wystąpiła usterka
        this.engineOn = engineOn;
    }

    boolean isEngineOk() { // jeżeli kontrolka się świeci to zwracamy że silnik jest sprawny
        if (!checkEngine) { // if (checkEngine == false) - bez uproszczenia
            return true;
        } else {
            return false;
        }
    } // można łatwiej Intellij podświetlił if i wskazał krótszą metode, poniżej

    boolean isEngineOk2() {
        return !checkEngine;
    }

    void startEngine() {// problem pojawia się wtedy jak silnik nie działa, bo wtedy nie powinno dać uruchomić się silnika
        // i dajemy zabespieczenie w postaci if, jesli silnik nie działa to nie możesz właczyć silnika
        if (checkEngine == false) { // lub zapis taki if(!checkEngine) to jest to samo
            engineOn = true;
        } else {
            System.out.println("Silnik nie dziala!");
        }
    }

    void showStatus() {
        System.out.println(name + ", fuel: " + fuel + ", checkEngine: " + checkEngine + ", engineOn: " + engineOn);
    }

}
