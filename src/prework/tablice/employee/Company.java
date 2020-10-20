package prework.tablice.employee;

public class Company {
    public static void main(String[] args) {
        Employee[] empoyees = new Employee[20]; // tablica może przechowywać informacje o 20 pracownikach z obiektu Empliyee
        // w tym monecie zawiera same puste wartosci
        // to tak jak byśmy zdefiniowali 20 zmiennych tylu Employee,
        // Employee employee1; itd
        //przypisanie obiektów Employee do indeksu z tablicy
        empoyees[0] = new Employee("Jan", "Kowalski", 3500); //przypisalismy obiekt do indeksu 0 z tablicy
        empoyees[1] = new Employee("Marta", "Zięba", 3700);
        empoyees[2] = new Employee("Karol", "Wojak", 5000);
        // ablice typów obiektowych przechowują tylko referencje na obiekty

        //Ponieważ dla ludzi bardziej intuicyjne jest numerowanie od 1 posłużmy się dodatkową zmienną.
        //Chcemy wyświetlić informację o drugim pracowniku w naszej tablicy, jednak ponieważ indeksowanie jest od 0,
        // to odwołujemy się do elementu o indeksie employeeIndex-1.

//        zabezpieczenie przed nullPointerExeption, dajemy warunki w jakich ma szukać , czyli wielkość tablicy
        int employyIndex = 2;// zwróci 3 obiejt z tablicy
        if (employyIndex >= 0 && employyIndex < empoyees.length)//zabezpieczenie przed nullPointerExeption, dajemy
            // warunki w jakich ma szukać , czyli wielkość tablicy, tablica jest od 0 do 19 jest 20 elementów
            System.out.println(empoyees[employyIndex].getFirstName() + " " +
                    empoyees[employyIndex].getLastName() + " " +
                    empoyees[employyIndex].getSalary() + "zł");
        System.out.println("Rozmiar tablicy: " + empoyees.length);

        //odwołujemy się do indeksu 2 czyli 3 obiektu w tablicy

    }
}
