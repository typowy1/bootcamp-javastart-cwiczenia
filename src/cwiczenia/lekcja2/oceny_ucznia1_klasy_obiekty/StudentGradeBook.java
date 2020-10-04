package cwiczenia.lekcja2.oceny_ucznia1_klasy_obiekty;

public class StudentGradeBook {
    public static void main(String[] args) {

        Student student1 = new Student(); // new Student() alt enter i eneter
        student1.firstName = "Rafal";
        student1.lastName = "Kowalski";
        student1.gender = 'M';
        student1.mathsGrade = 5.0;
        student1.itsGrade = 3.5;
        student1.physicsGrade = 4.0;

        Student student2 = new Student();
        student2.firstName = "Aleksandra";
        student2.lastName = "Niewiadomska";
        student2.gender = 'K';
        student2.mathsGrade = 4.0;
        student2.itsGrade = 5.0;
        student2.physicsGrade = 6.0;

        Student student3 = new Student();
        student3.firstName = "Piotr";
        student3.lastName = "Zmiennicki";
        student3.gender = 'K';
        student3.mathsGrade = 3.0;
        student3.itsGrade = 4.5;
        student3.physicsGrade = 3.0;

        double student1Avg = (student1.mathsGrade + student1.itsGrade + student1.physicsGrade) / 3;
        double student2Avg = (student2.mathsGrade + student2.itsGrade + student2.physicsGrade) / 3;
        double student3Avg = (student3.mathsGrade + student3.itsGrade + student3.physicsGrade) / 3;

        double mathsAvg = (student1.mathsGrade + student2.mathsGrade + student3.mathsGrade) / 3;
        double itsAvg = (student1.itsGrade + student2.itsGrade + student3.itsGrade) / 3;
        double physicsAvg = (student1.physicsGrade + student2.physicsGrade + student3.physicsGrade) / 3;

        System.out.println("Students average:");
        System.out.println(student1.firstName + " " + student1.lastName + ", average grade: " + student1Avg);
        System.out.println(student2.firstName + " " + student2.lastName + ", average grade: " + student2Avg);
        System.out.println(student3.firstName + " " + student3.lastName + ", average grade: " + student3Avg);

        System.out.println();
        System.out.println("School subjects average:");
        System.out.println("Math average: " + mathsAvg);
        System.out.println("IT average: " + itsAvg);
        System.out.println("Physics average: " + physicsAvg);
    }
}
