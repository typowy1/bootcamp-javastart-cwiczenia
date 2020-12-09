package prework2.prework.static_slowo;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 185.5);
        Human eve = new Human("Eve", 167.5);

        double avgHeight = (adam.getHeight() + eve.getHeight()) / 2;
        Human.avgHeight = avgHeight;

        System.out.println("Pierwsi ludzie na Ziemi: ");
        System.out.println(adam.getName() + " " + adam.getHeight() + "cm");
        System.out.println(eve.getName() + " " + eve.getHeight() + "cm");

        System.out.println("Średni wzrost: ");
        //      System.out.println(adam.avgHeight);
        //       System.out.println(eve.avgHeight);
        // nie jest to dobra praktyka odwoływać się do statycznego pola przez
        // referencje ogiektu, odwołujemy isę przez klasę
        System.out.println(Human.avgHeight);
    }
}
