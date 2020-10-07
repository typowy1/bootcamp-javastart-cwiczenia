package cwiczenia.lekcja2.oceny_ucznia1_klasy_obiekty;

public class StudentGradeBook {
    public static void main(String[] args) {
// referencja nitka łącząca
        StudentGrade student1 = new StudentGrade(); // new Student() alt enter i eneter, sududent1 = referencja na obiekt
        student1.mathsGrade = 5.0;
        student1.itsGrade = 3.5;
        student1.physicsGrade = 4.0;

        student1.person = new Person();
        student1.person.firstName = "Rafal";
        student1.person.lastName = "Kowalski";
        student1.person.gender = 'M';

        student1.person.address = new PersonAddress();
        student1.person.address.city = "Warsaw";
        student1.person.address.street = "Marszałkowska";
        student1.person.address.number = "100C";


        StudentGrade student2 = new StudentGrade();
        student2.mathsGrade = 4.0;
        student2.itsGrade = 5.0;
        student2.physicsGrade = 6.0;

        student2.person = new Person(); // referencja na obiekt student2.person
        student2.person.firstName = "Aleksandra";
        student2.person.lastName = "Niewiadomska";
        student2.person.gender = 'K';

        student2.person.address = new PersonAddress();
        student2.person.address.city = "Warsaw";
        student2.person.address.street = "Broniewskiego";
        student2.person.address.number = "12";


        StudentGrade student3 = new StudentGrade();
        student3.mathsGrade = 3.0;
        student3.itsGrade = 4.5;
        student3.physicsGrade = 3.0;

        student3.person = new Person();
        student3.person.firstName = "Piotr";
        student3.person.lastName = "Zamiennicki";
        student3.person.gender = 'K';

        student3.person.address = new PersonAddress(); // student3.person.address referencja na obiekt PersonAddress
        student3.person.address.city = "Warsaw";
        student3.person.address.street = "Jasna";
        student3.person.address.number = "23";

        double student1Avg = (student1.mathsGrade + student1.itsGrade + student1.physicsGrade) / 3;
        double student2Avg = (student2.mathsGrade + student2.itsGrade + student2.physicsGrade) / 3;
        double student3Avg = (student3.mathsGrade + student3.itsGrade + student3.physicsGrade) / 3;

        double mathsAvg = (student1.mathsGrade + student2.mathsGrade + student3.mathsGrade) / 3;
        double itsAvg = (student1.itsGrade + student2.itsGrade + student3.itsGrade) / 3;
        double physicsAvg = (student1.physicsGrade + student2.physicsGrade + student3.physicsGrade) / 3;

        System.out.println("Students average:");
        System.out.println(student1.person.firstName + " " + student1.person.lastName + ", average grade: " + student1Avg);
        System.out.println(student2.person.firstName + " " + student2.person.lastName + ", average grade: " + student2Avg);
        System.out.println(student3.person.firstName + " " + student3.person.lastName + ", average grade: " + student3Avg);

        System.out.println();
        System.out.println("School subjects average:");
        System.out.println("Math average: " + mathsAvg);
        System.out.println("IT average: " + itsAvg);
        System.out.println("Physics average: " + physicsAvg);

        System.out.println();
        System.out.println("Informacje o uczniu 1:");
        System.out.println("Imię: " + student1.person.firstName);
        System.out.println("Nazwisko: " + student1.person.lastName);
        System.out.println("Płeć: " + student1.person.gender);
        System.out.println("Adres: " + student1.person.address.city + " " + student1.person.address.street + " "
                + student1.person.address.number);
    }
}
