package cwiczenia.lekcja2;

public class InkrementacjaDoNaprawy {

    public static void main(String[] args) {
        int number = 10;
        System.out.println(++number + "+" + number + "=" + (number + number));
        System.out.println(++number + number);
        System.out.println(number + number++);
        System.out.println(++number + number--);
        System.out.println(--number);
        //pozbyłbym się wszystkich nawiasów oprócz (number + number)
        //nie ma sensu dodawac nawiasów do samej inkrementacji
    }
}
