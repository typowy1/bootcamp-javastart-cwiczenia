package cwiczenia.lekcja3.skrzynia;

public class Chest {
    double height; // wysokość
    double length; //długosć
    double width; // szerokość

    Chest(double h, double l, double w) {
        height = h;
        length = l;
        width = w;
    }

    double volume(double h, double l, double w) {
        height = h;
        length = l;
        width = w;
        double chestVolume = height * length * width;
        return chestVolume;
    }
}
