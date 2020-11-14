package prework.typyopakowujace;

public class Typy {
//    https://javastart.pl/kurs/java/java-podstawy-temat-28-typy-opakowuj%C4%85ce/lekcja/java-podstawy-typy-opakowujace-typow-prostych

//W celu stworzenia obiektów odpowiednich typów stosujemy konstruktor lub statyczna metodę valueOf().
    // od javy 9 używanie konstruktorów jest odaradzane

    public static void main(String[] args) {
        int num = 5;
        //Integer number1 = new Integer(num); // od javy 9 używanie konstruktorów jest odaradzane

        Integer number2 = Integer.valueOf(num);

//        wygodne konwertowanie liczb na napisy za pomocą statycznej metody toString()
        int num1 = 5;
        String number = Integer.toString(num);

//        Analogicznie możemy postępować z każdym innym typem.


//        valueOf(String),
//        parseXXX(String), gdzie XXX to odpowiedni typ, np. Int lub Double.

        String numberString = "5.5";
        double num2 = Double.parseDouble(numberString);
        double num3 = Double.valueOf(numberString);

        //Autoboxing i unboxing
//        Do typów obiektowych takich jak Integer, czy Double możemy przypisywać bezpośrednio wartości typów prostych
//        bez potrzeby wywoływania konstruktora lub metody valueOf() jak pokazaliśmy wcześniej.
//        W Javie funkcjonuje mechanizm autoboxingu, czyli automatycznego opakowania i unboxingu, czyli automatycznego
//        rozpakowania wartości z typu obiektowego. Możliwy jest więc zapis:

        Integer number4 = 5; //autoboxing
        int otherNumber = number4; //unboxing
//        Pierwszą z powyższych operacji nazwiemy autoboxingiem (opakowywaniem) natomiast drugą unboxingiem (rozpakowywaniem) typu.
//                W podobny sposób działa to dla wszystkich pozostałych typów prostych

//        Dla przykładu wartość typu int zajmuje w pamięci 4 bajty, a ta sama wartość opakowana w obiekt Integer będzie zajmowała już 16 bajtów.

//        Z tego względu wprowadzone zostały podstawowe optymalizacje dla typów całkowitoliczbowych polegające na cacheowaniu
//        wartości z przedziału od -127 do 128. Polega to na tym, że jeżeli tworzymy obiekt Integer (lub innego typu całkowitoliczbowego)
//        na podstawie wartości z podanego przedziału używając metody valueOf(), to nie jest tworzony nowy obiekt, a jedynie zwracana
//        jest referencja na już istniejący obiekt. W przypadku wartości spoza tego zakresu, lub tworzeniu obiektów przy użyciu
//        konstruktora a nie metody valueOf(), zawsze tworzony będzie nowy obiekt. M.in. z tego powodu konstruktory zostały oznaczone
//        adnotacją @Deprecated i ich używanie od Javy 9 jest odradzane.

        Integer value1 = Integer.valueOf(90);
        Integer value2 = Integer.valueOf(90);
        //porównanie referencji, a nie wartości!
        System.out.println(value1 == value2); //true
        //dwie referencje wskazują na ten sam obiekt, zwróci true porównanie referencji a nie wartości i jest ponizej 128

        Integer value3 = Integer.valueOf(900);
        Integer value4 = Integer.valueOf(900);

//porównanie referencji, a nie wartości!
        System.out.println(value1 == value2); //false , powyżej 128 bitow


//        Górną granicę dla cache można zmienić ze 127 na dowolną liczbę. Należy w tym celu dodać przy uruchamianiu programu
//        flagę -XX:AutoBoxCacheMax. Warto zapamiętać ten szczegół, jest to jedno z popularnych podchwytliwych pytań na rozmowach
//        kwalifikacyjnych.

//        W klasach opakowujących znajdziesz też wiele statycznych metod, które mogą ułatwić Ci wykonanie różnych operacji.
//        Kilka przykładów:
//
//        Integer.min(a, b) - zwraca mniejszą z dwóch liczb,
//        Character.isDigit(c) - zwraca true, jeżeli znak jest cyfrą,
//        Character.isLetter(c) - zwraca true, jeżeli znak jest literą.

//        Wykorzystanie klas opakowujących typów prostych może wydawać się bezsensowne, szczególnie, gdy istnieje mechanizm
//        autoboxingu i unboxingu. Niebawem się jednak przekonasz, że w niektórych sytuacjach niemożliwe jest przekazanie do
//            konstruktora, czy metody wartości typu prostego. W takim przypadku musimy posiadać mechanizm, który pozwoli
//        nam w wygodny sposób konwertować typy proste na obiekty. Oprócz tego typy opakowujące odblokowują dla nas jednak
//        możliwości związane z polimorfizmem. Dzięki nim możemy tworzyć struktury i zmienne, do których może być np.
//        przypisana albo liczba, albo znak. W przypadku samych typów prostych jest to niemożliwe ze względu na statyczną
//        kontrolę typów w Javie.

    }

}
