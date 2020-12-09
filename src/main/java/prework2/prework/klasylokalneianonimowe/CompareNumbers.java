package prework2.prework.klasylokalneianonimowe;

public class CompareNumbers {

    //    Pozornie wygląda to tak, jakbyśmy utworzyli nowy obiekt typu BiggestNumber, ale przecież interfejsu nie można
//    inicjalizować słowem new. W rzeczywistości pomiędzy nawiasami klamrowymi {} umieszczone jest ciało klasy,
//    która nie posiada swojej nazwy (jest anonimowa). Ponieważ klasa ta implementuje interfejs BiggestNumber, to musi
//    przesłaniać wszystkie metody abstrakcyjne z interfejsu, czyli te, które nie są oznaczone jako domyślne. Zwróć także
//    uwagę na nietypowe zakończenie nawiasu klamrowego średnikiem, czego do tej pory jeszcze nie spotkaliśmy.
//            Metoda takeBiggest() ma zwrócić największą z liczb w tablicy, więc ją zaimplementujmy, a także zobaczmy
//    jak wygląda wykorzystanie takiej klasy w użytkowym kodzie.

    public static void main(String[] args) {

        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};
        BiggestNumber nc = new BiggestNumber() { // stworzenie klasy anonimowej klasa anonimowa jes miedzy nawiasami{}
            @Override
            public int takeBiggest(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("argument cannot be null");
                if (tab.length == 0)
                    throw new IllegalArgumentException("array has to have at least 1 value");

                int biggestNumber = tab[0];
                for (int i = 1; i < tab.length; i++) {
                    if (biggestNumber < tab[i]) {
                        biggestNumber = tab[i];
                    }
                }
                return biggestNumber;
            }
        };

        System.out.println("Największa z liczb to: " + nc.takeBiggest(tab));
    }

//    W metodzie takeBiggest() sprawdzamy najpierw, czy przekazany parametr (tablica) nie jest wartością null oraz, czy
//    zawiera chociaż 1 element. Jeśli nie, to rzucamy odpowiednio wyjątek NullPointerException lub
//    IllegalArgumentException. Jeżeli tablica ma przynajmniej 1 element, to w dalszej części kodu do zmiennej
//    biggestNumber przypisujemy pierwszy element tablicy, a następnie przechodzimy w pętli for przez jej wszystkie
//    elementy. Jeżeli kolejny element jest większy od wartości przypisanej do biggestNumber, to jest ona do tej
//    zmiennej przypisywana.
//    Po skończonej iteracji zwracamy największą z liczb.
//    Dzięki temu, że zaimplementowaliśmy anonimową klasę wewnętrzną, w dalszej części możemy wywoływać jej metody,
//    czyli np. takeBiggest(), która jak widać zwraca poprawną wartość:

//    Klasy anonimowe mogą być tworzone w taki sposób nie tylko na podstawie interfejsów, ale także na podstawie zwykłych
//    i abstrakcyjnych klas.
}


