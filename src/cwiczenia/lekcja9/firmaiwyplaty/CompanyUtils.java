package cwiczenia.lekcja9.firmaiwyplaty;

public class CompanyUtils {

    // drukuje informacje o pracownikach
    public static void printEmployees(Employee[] employees) {
        for (Person person : employees) {
            if (person != null) {
                System.out.println(person.getInfo());
            }
        }
    }

    //suma wypłat i bonusów
    public static Double companyCost(Employee[] employees) {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.totalPaymant();
            }
        }
        return result;
    }

    // zliczanie ikości pracowników którzy zarabiają powyżej jakiejś kwoty

    public static double countEmployeesWithSalaryAbove(Employee[] employees, double salary) { //salary to kwota powyżej której chcemy zliczać wypłaty
        double counter = 0;
        for (Employee employee : employees) {// lepiej fora zastosować i odniesć sie do wielkości tablicy
            if (employee != null) {
                if (employee.totalPaymant() > salary) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
