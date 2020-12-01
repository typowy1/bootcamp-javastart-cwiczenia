package cwiczenia.lekcja4.triangle;

public class TriangleCheck {

    boolean isRightTriangle(Triangle triangle) {
        return Math.pow(triangle.getA(), 2) + Math.pow(triangle.getB(), 2) == Math.pow(triangle.getC(), 2) ||
//                lub taki zapis
                triangle.getA() * triangle.getA() + triangle.getC() * triangle.getC() == triangle.getB() * triangle.getB() ||
                triangle.getB() * triangle.getB() + triangle.getC() * triangle.getC() == triangle.getA() * triangle.getA();
        // trójkąt prostokątny twierdzenie pitagorasa a(2) * b(2) = c(2)
//        metoda jest dla wszystkich możliwosci  możliwości dla gdzie każdy
//        bok może być przyprostokątną i przeciwprostokątną
    }
}
