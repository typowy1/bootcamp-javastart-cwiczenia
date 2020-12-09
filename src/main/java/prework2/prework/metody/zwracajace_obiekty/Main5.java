package prework2.prework.metody.zwracajace_obiekty;

public class Main5 {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car5 car6 = factory.createCar(); // twożymy zmienną typu Car i przypisujemy do niej wartość z zwracanej metody createCar
        // żeby nie powielać tego kodu dla każdego samochodu stwrzymy klase factory a w niej metode zwracającą obiekt
        car6.showInfo();
    }
}
