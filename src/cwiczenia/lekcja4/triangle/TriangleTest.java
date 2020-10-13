package cwiczenia.lekcja4.triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 4, 3);
        TriangleCheck triangleCheck = new TriangleCheck();
        boolean isRightTriangle = triangleCheck.isRightTriangle(triangle1);
        System.out.println("Trójkąt jest prostokątny? " + isRightTriangle);
    }
}
