package prework2.prework.wyjątki.wlasnewyjatki;

public class SchoolTest {

    public static void main(String[] args) {
        School school = new School(3);
        try {
            school.add(new Student(1, "Jan", "Kowalski"));
            school.add(new Student(2, "Tomasz", "Kowalski"));
            school.add(new Student(3, "Zbigniew", "Kowalski"));
            school.add(new Student(4, "Robert", "Kowalski"));
            school.add(new Student(5, "Lukasz", "Kowalski"));
        } catch (NoMoreSpaceException e) {
            System.err.println("Nie można dodać tylu osób do klasy School");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println(school.find("Tomasz", "Kowalski"));
            System.out.println(school.find("Tomasz", "Kowalsk"));
        } catch (NoElementFoundException e) {
            System.err.println("Nie znaleziono takiej osoby");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
//    Aktualnie praktycznie wszystkie wyjątki, które definiuje się w aplikacjach to wyjątki niekontrolowane
//            (dziedziczące po RuntimeException), często wyjątki kontrolowane uważane są za błąd przy projektowaniu
//    języka Java i raczej staraj się ich unikać w swoich aplikacjach.


}
