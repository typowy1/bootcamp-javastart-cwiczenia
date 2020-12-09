package prework2.prework.metody.zwracajace_obiekty;

public class Factory {
    // żeby nie powielać tego kodu dla każdego samochodu stwrzymy klase factory a w niej metode zwracającą obiekt
    Car5 createCar() {
        System.out.println("Podaj nazwę samochodu");
        String name = "Audi A4";
        System.out.println("Czy włączyć światła");
        boolean lights = true;
        System.out.println("Poziom paliwa");
        int fuel = 15;
        System.out.println("Czy samochód jest sprawny");
        boolean isBroken = false;
        Car5 car5 = new Car5(name, lights, null, fuel, isBroken);
        return car5;
    }

}
