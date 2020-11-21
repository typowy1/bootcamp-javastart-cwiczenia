package prework.enum1;

public enum Size {
    XSMALL("Bardzo mały"), SMALL("Mały"), MEDIUM("Sredni"),
    LARGE("Duży"), XLARGE("Bardzo duży");
    //konstruktor wywołujemy podczas definiowania wartosći np EDIUM("Sredni") - konstruktor odnosi sie do wartosci enum
    // coś w podobie public static final Size Small =  new Size("Mały"); tylko że przy wywołaniu konstruktora enum nie dajemy słowa new

    private final String description;

    // Konstruktor można wywołać tylko tu, domyślnie prywatny
    Size(String description) {//czyli MEDIUM("Sredni")
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
//    powinniśmy więc od użytkownika wczytać napis lub liczbę i przekształcić je na wartość typu Size. Do zamiany nazwy
//    typu String na wartość typu enum można wykorzystać metodę valueOf(), jednak zmuszanie użytkownika do podawania
//    nazwy rozmiaru np. w postaci SMALL, czy MEDIUM jest mało naturalne. Lepiej byłoby wpisanie polskiej nazwy, np.
//    "Mały". Jeśli chcemy coś takiego osiągnąć, to możemy zdefiniować dodatkową metodę, która dokona konwersji.

    public static Size fromDescription(String description) {// pomocne przy wybieraniu przez uzytkownika rozmiaru po polsku np. Mały
        Size[] values = values();
        for (Size size : values) {
            if (size.getDescription().equals(description))
                return size;// użytkownik wpisze Mały i zwróci Size.SMALL
        }
        return null;
    }

    @Override
    public String toString() {
        return name() + " " + description;
    }

    //    Metoda fromDescription() przyjmuje jako argument dowolny String. Następnie porównujemy, czy opis którejś z wartości
//    XSMALL, SMALL itp. zgadza się z tą nazwą. Jeśli tak, to zwracamy tę wartość, jeśli przekazany napis nie odpowiada
//    opisowi żadnej wartości, zwracamy null (w rzeczywistości lepiej byłoby w tym miejscu rzucić wyjątek/błąd, ale
//    jeszcze nie wiemy jak to zrobić). Metoda jest statyczna, więc możemy ją wywołać zapisując po prostu Size.fromDescription(...)
//    Przykład wykorzystania takiej metody:


//    W typie Size dodaliśmy pole description, które przechowuje polską nazwę konkretnej wartości. Choć pola w enumach
//    muszą być oznaczone jako finalne, to ma to najwięcej sensu, ponieważ wartości tego typu chcemy traktować jako stałe.
//    Z tego samego powodu nie ma większego sensu generowanie dla takiego pola settera.
//
//Wygenerowałem także konstruktor, który pozwala ustawić wartość pole description. Zwróć uwagę, że konstruktor jest
// prywatny, czyli możemy go wywoływać tylko wewnątrz typu Size. Jeśli nie zapiszesz przy konstruktorze słowa private,
// to efektywnie i tak będzie on prywatny. Wywołanie konstruktora dla typu enum wygląda trochę inaczej niż w przypadku
// klas, ponieważ w tym przypadku nigdy nie pojawi się operator new.
//
//Konstruktor wywołujemy definiując odpowiednie wartości, np. SMALL("Mały"). SMALL będzie w tym przypadku wartością
// typu Size i będzie przechowywać napis "Mały" przypisany do pola description.
}
