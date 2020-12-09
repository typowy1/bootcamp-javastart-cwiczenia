package prework2.prework.struktury_sterujace_if_switch.struktura_if;

public class Test {
    public static void main(String[] args) {

        int x = 10;
        int y = 50;

//        instrukcje zagnieżdżone
        // jeżeli w kodzie pojawiają się zagnieżdżone instrukcje if to znaczy ze da się to zapisać lepiej, np możemy
        // wydzielić ify do osobnych metod, tak jak to ma miejsce w klasie Operators

        Operators operators = new Operators();
        operators.compareNumbers(x, y);

//        if(x > y){
//            if(x > 0){
//                System.out.println(x + " jest większe od " + y);
//            }else {
//                System.out.println(x + " jest większe od " + y + ", ale mniejsze od 0");
//            }
//        }else {
//            System.out.println(x + " nie jest większy od " + y);
//        }

//        if (x > y && x > 0){ // x > 0 liczba dodatnia
//            System.out.println(x + " jest większe od " + y);
//        }else {
//            System.out.println(x + " nie jest większy od " + y + ", lub " + x + " jest mniejszy od 0");
//        }
    }
}
