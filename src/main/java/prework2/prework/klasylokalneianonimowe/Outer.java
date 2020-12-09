package prework2.prework.klasylokalneianonimowe;

public class Outer {

    //https://javastart.pl/kurs/java/java-podstawy-temat-25-klasy-wewn%C4%99trzne/lekcja/java-podstawy-klasy-lokalne-i-anonimowe
    private int x;

    public void doSometing() {
        int localVar = 5;

        class Inner {
            public void innerMethod() {
                x = 5;
                System.out.println(localVar);
            }
        }
    }

//    Klasa Inner została stworzona wewnątrz metody doSomething() z klasy Outer. Możemy z metody w jej wnętrzu odwoływać
//    się do pola x klasy opakowującej, możemy też wyświetlać wartość localVar, jednak tylko pod warunkiem, że nie
//    zmienimy wartości tej zmiennej w dalszej części kodu. Zmienna taka nazywa się od Javy 8 efektywnie finalną - tzn.
//    pomimo iż nie ma modyfikatora final, to kompilator jest w stanie stwierdzić, że faktycznie jest ona raz
//    zainicjowana i później nie zmienia wartości.
//    Programując w Javie od kilkunastu lat nigdy nie spotkałem się z tym, żeby ktoś stosował klasy lokalne.

//    Programując w Javie od kilkunastu lat nigdy nie spotkałem się z tym, żeby ktoś stosował klasy lokalne.
}
