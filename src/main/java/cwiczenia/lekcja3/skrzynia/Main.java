package cwiczenia.lekcja3.skrzynia;

public class Main {
    public static void main(String[] args) {
        Chest chest1 = new Chest(50, 100, 40);
        Chest chest2 = new Chest(70, 90, 50);
        double chest1VolumeFromMethod = chest1.volume(chest1.height, chest1.length, chest1.width);
        double chest1Volume = chest1.height * chest1.length * chest1.width;

        double chest2VolumeFromMethod = chest2.volume(chest2.height, chest2.length, chest2.width);
        double chest2Volume = chest2.height * chest2.length * chest2.width;

        System.out.println("Wymiary skrzyni");
        System.out.println("Wysokość: " + chest1.height + "cm , długość: " + chest1.length + "cm , szerokosć: "
                + chest1.width + "cm");

        System.out.println("Objętość skrzyni1: " + chest1Volume + "cm(3)");
        System.out.println("Objętość skrzyni1: " + chest1VolumeFromMethod + "cm(3)");

        System.out.println("Objętość skrzyni2: " + chest2Volume + "cm(3)");
        System.out.println("Objętość skrzyni2: " + chest2VolumeFromMethod + "cm(3)");

    }
}
