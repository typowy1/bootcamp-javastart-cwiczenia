package prework.metody.nic_nie_zwraca_przyjmuje_obiekt_wykonuje_na_nim_operacje;

public class Main3 {
    public static void main(String[] args) {
        Engine3 engine1 = new Engine3(200);
        Car3 car4 = new Car3("Audi a4", false, engine1, 20); // światła wyłaczone

        car4.broken = true; // zepsuty samochód
        //chcemy naprawic go więc tu trzeba stworzyć osobną klasę która będzie odpowiadała za diagnostykę, naprawę itd
        // klase Mechanic
        car4.showInfo();
        System.out.println("Czy samochód jest zepsuty " + car4.broken);
        Mechanic mechanic = new Mechanic();
        mechanic.fixCar(car4); // tu odnosimy się do samochodu który chcemy bnaprawić car1 jest zepsuty
        System.out.println("Czy samochód jest zepsuty " + car4.broken);
    }
}
