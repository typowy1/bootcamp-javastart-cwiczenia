package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1.punkt_w_układzie_współrzędnych;

public class PunktTest {
    public static void main(String[] args) {

        //Napisz program, w którym wczytasz współrzędne punktu w przestrzeni (X, Y)
        // a następnie wyświetlisz na ekranie informację mówiącą o tym, w której ćwiartce układu się on znajduje.
        Point point1 = new Point(3, 5);
        Point point2 = new Point(-1, 5);
        Point point3 = new Point(3, -6);
        Point point4 = new Point(-9, -6);
        Point point5 = new Point(0, 0);

        CheckPoint checkPoint = new CheckPoint();

        String quater1 = checkPoint.pointPosition(point1);
        String quater2 = checkPoint.pointPosition(point2);
        String quater3 = checkPoint.pointPosition(point3);
        String quater4 = checkPoint.pointPosition(point4);
        String quater5 = checkPoint.pointPosition(point5);

        if (quater5 != null) {// dlaczego tak poniewaz Point może też = się 0 i będzie po srodku przestrzeni
            // a nie w cwiartce
            System.out.println("Punkt " + point5.getX() + ", " + point5.getY() + " leży w "
                    + quater5 + " ćwiartce układu współrzędnych.");
        } else {
            System.out.println("Leży gdzieś po środku");
        }
    }
}
