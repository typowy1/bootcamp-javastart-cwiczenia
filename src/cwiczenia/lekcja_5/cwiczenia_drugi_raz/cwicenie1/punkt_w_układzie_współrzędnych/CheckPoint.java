package cwiczenia.lekcja_5.cwiczenia_drugi_raz.cwicenie1.punkt_w_układzie_współrzędnych;

public class CheckPoint {

    public String pointPosition(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            return "1";

        } else if (point.getX() < 0 && point.getY() > 0) {
            return "2";

        } else if (point.getX() < 0 && point.getY() < 0) {
            return "3";

        } else if (point.getX() > 0 && point.getY() < 0) {
            return "4";
        }
        return null; // null po to bo wartość może też być po środku przestrzeni, a mamy pokazać w której ćwiartce jest
    }
}
