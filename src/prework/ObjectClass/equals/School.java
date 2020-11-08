package prework.ObjectClass.equals;

public class School {

    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        Student student2 = new Student("Jan Kowalski", 22);
        Student student3 = new Student("Jan Kowalski", 12);
        System.out.println("student1 == student2:");
        System.out.println(student1 == student2);
        // bedzie false ponieważ porównują referancje czyli adresy obiektu a nie obiekty, ale jeśli chcemy czy dwie
        // referencje wskazują na ten sam obiekt to możemy wykożystać == zwróci nam true

        System.out.println("student1.equals(student2)");
        boolean studentEquals = student1.equals(student2); // przypisanie wyniku metody do zmiennej
        System.out.println(studentEquals); // też będzie false

        int hashCode1 = student1.hashCode();
        int hashCode2 = student2.hashCode();
        int hashCode3 = student3.hashCode();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());// zwróci ten sam numer dlatego ze obiekty mają tą sama wartosć, działa
        // tak tylko jeśli będziemy mieli wygenerowaną metode equals w danej klasie nadżednej z polami itd, inaczej zwróci inne numery
        System.out.println(student3.hashCode());// zwróci inny numer

        //hash code moze zwrócić te same numery hash nawet jesli qquals jest false czyli

        String string3 = "Fb";
        String string4 = "Ea";
        System.out.println(string3.equals(string4));
        System.out.println(string3.hashCode());
        System.out.println(string4
                .hashCode());
        // zwróci te same numery

//        jezeli equals zwraca wartość true to hash code zwraca taką samą liczbę
    }
}
