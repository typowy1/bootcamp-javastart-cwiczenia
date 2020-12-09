package prework2.prework.klasyabstrakcyjne_i_interfejsy.dziedziczenieinterfejsow;

public class ShapeCalculator {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rect = new Rectangle(5, 10);

        System.out.println("Pole koła: " + circle.calculateArea());
        System.out.println("Obwód prostokąta: " + rect.calculatePerimeter());

//        Pamiętaj jednak, że nadal masz dostęp wyłącznie do metod dostępnych w typie referencji, więc jeśli chcesz
//        odwoływać się do metod getA(), czy getR() z klas Rectangle lub Circle, to niezbędne będzie wcześniejsze rzutowanie na konkretny typ.

        ((Circle) circle).getR();
        ((Rectangle) rect).getA();

//        Jeśli pojawia się u ciebie jednak potrzeba rzutowania, to rozważ zrezygnowanie z deklarowania zmiennej jako typu
//    ogólniejszego (Shape) i użyj po prostu od razu typów Circle lub Rectangle.
    }
}
