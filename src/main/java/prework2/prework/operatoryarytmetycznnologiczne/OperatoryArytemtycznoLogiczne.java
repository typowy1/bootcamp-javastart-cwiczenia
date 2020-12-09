package prework2.prework.operatoryarytmetycznnologiczne;

public class OperatoryArytemtycznoLogiczne {
    public static void main(String[] args) {
//        Promocja typu, następuje do typu ogólnijszego
//        3 * 5 = 16,5 dlatego że int zostanie zamieniony na double

//        Konwersja rozszeżająca
    //    double number =(double)5; // zmienamy typ wartości typu liczbowego na typ o większym zakresie
   //     double number2 = 5; //konwersja niejawna
     //   int number3 = (int) 5.8; //konwersja zawężające kiedy próbujemy przypisać wartość zmiennej o większym zakresie do typu o mniejszym zakresie

//        Ikrementacja - zwiększenie wartosci o 1
//        postinkrementacja = 1++ -  zwracana jast aktualna wartość zmiennej i dopiero później zwracana jest wartosć zwiększona o 1

        int number4 = 5;
        int postfixResult = number4++;
        System.out.println(number4);
        System.out.println(postfixResult);

//        preinkrementacja = ++1 -  najpierw zwiększona jest wartość o jeden i dopiero potem ta zwiększona wartość jest zwracana
        int number5 = 5;
        int prefixResult = ++number5;
        System.out.println(number5);
        System.out.println(prefixResult);

//Operatory logiczne
//        > - większe
//        >= - większe równe
//        < - mniejsze
//        <= - mniejsze równe
//        == - równe dla typów prostych
//        != - różne

        int number6 = 10;
        int number7 = 15;

        boolean larger = number6 > number7;
        boolean largerEqual = number6 >= number7;
        boolean less = 8 < 7;
        boolean lessEqual = 8 <= 8;
        boolean equal = number6 == 10;
        boolean notEqual = 9 != number7;

        System.out.println(larger);
        System.out.println(equal);
        System.out.println(10.9 != 11);

//        operatory negacji
//        ! - negacja

        boolean notTrue = !true;
        boolean notEqual1 = !(5==10); // !false
        System.out.println(notTrue);
        System.out.println(notEqual);

//        Zdania logiczne
//        Koniunkcja && - pozwala sprawdzić czy obie strony wyrazenia są prawdziwe, koniunkcje czytamy jako "i"
        int number8 = 12;
//        liczba jest parzysta i większa od 10?
        boolean checkNumber = (number8 % 2 == 0) && number8 > 10; // da true && true -> true

//        liczba jest parzysta i większa od 10?
        int number9 = 13;
        boolean checkNumber9 = (number9 % 2 == 0) && number9 > 10; // da false && true -> false

//        Alternatywa - odwrotnosć koninkcji i zapisana jest || czytaj "lub"

        int number10 = 13;
//        czy liczba jest parzysta lub większa od 10?
        boolean checkNumber10 = (number10 % 2 == 0) || number10 > 10; // da false ||true -> true

//        czy liczba jest parzysta lub większa od 10?
          int number11 = 9;
          boolean checkNumber11 = (number11 % 2 == 0) || number11 > 10; // da false || false -> false

//        operatory logiczne możemy łączyć w jednym zdaniu, koniunkcja ma wyższy priorytet od alternatywy
        int number12 = 13;
        boolean checkNumber12 = (number12 % 2 ==0) && number12 > 10 || number12 < 20;
        boolean checkNumber13 = ((number12 % 2 ==0) && number12 > 10) || number12 < 20; // można też tak zapisać

    }


}
