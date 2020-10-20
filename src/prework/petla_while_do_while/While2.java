package prework.petla_while_do_while;

public class While2 {
    // petla bez końca
    public static void main(String[] args) {

//        while
//        while (true){// dopóki ten warunek jest prawdziwy wykonuj to co jest w srodku
//            System.out.println("Bez końca!");
//        }


        //   powtarzamy 5 razy
//        int i = 0;
//        while (i < 5){
//            System.out.println("Ciało Pętli " + i);
//            i++; // bez tego pętla będzie szłą bez końca, ponieważ na stałe przypisana jest wartosć 0 i petla sprawdza to
        // i cały czas jest 0, a dzieki i++ to zwiększa licznik o 1 za kazdym przejściem, dopóki nie osiągnie 4 to
        // będzie diałać
        // żeby doszo do 5 to musi być <=
//    }
//        System.out.println("Koniec programu");// osiągneło 5 więc nastąpiło wyjście z pętli i wykonały się instrukcje
        // poza pętlą

//        do while
        // jeżeli użytkownik wprowadza wartość i chcemy decydować czy on ma podawać ja jeszcze raz czy nie
        // wykonuj w ciele pętli dopóki i jest mniejsze

        int i = 0;
        do {
            System.out.println("Ciało Pętli " + i);
            i++;
        } while (i < 5);
        System.out.println("Koniec programu");

    }
}
