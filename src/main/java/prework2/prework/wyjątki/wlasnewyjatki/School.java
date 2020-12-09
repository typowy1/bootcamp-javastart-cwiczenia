package prework2.prework.wyjątki.wlasnewyjatki;

public class School {

    private Student[] students;
    private int studentsNumber;

    public School(int studentsNumber) {
        students = new Student[studentsNumber];
    }

    public void add(Student student) throws NoMoreSpaceException {
        if (studentsNumber >= students.length) {
            throw new NoMoreSpaceException("Brak miejsca w School, dostępne są " + students.length);
        } else {
            students[studentsNumber] = student;
            studentsNumber++;
        }
    }

    public Student find(String firstName, String lastName) throws NoElementFoundException {
        boolean found = false;
        int index = 0;
        while (!found && index < students.length) {
            if (students[index].getFirstName().equals(firstName) && students[index].getLastName().equals(lastName)) {
                return students[index];
            } else {
                index++;
            }
        }
        throw new NoElementFoundException("Nie znaleziono elementu " + firstName + " " + lastName);
    }
//    Metoda add() może wygenerować wyjątek kontrolowany NoMoreSpaceException w przypadku, gdy już zabraknie miejsca w tablicy.
//    Metoda find() służy do wyszukania studenta o podanym imieniu i nazwisku. Przeszukujemy w niej tablicę i jeżeli trafimy
//    na pierwszy element, którego imię i nazwisko (pola firstName i lastName) zgadzają się z argumentami metody, to zwracamy
//    znaleziony obiekt.

}
