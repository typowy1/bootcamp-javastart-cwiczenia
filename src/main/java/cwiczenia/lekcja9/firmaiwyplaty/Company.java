package cwiczenia.lekcja9.firmaiwyplaty;

public class Company {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5]; // nie musimy używać najogilnijszego typu, użycie employee ułatwi np
        // liczenie wypłay i bonusa
        employees[0] = new Employee("Rafał", "Kowalski", 5000);
        employees[1] = new Employee("Piotr", "Zemow", 4000);
        employees[2] = new Employee("Krzysztof", "Luka", 7000);
        employees[3] = new Director("Tomasz", "Popławski", 10000, 1000);

        CompanyUtils.printEmployees(employees);
        System.out.println("Suma wypłat: " + CompanyUtils.companyCost(employees));
        System.out.println("Ilość pracowników któży zarabiają powyżej 5000 to: "
                + CompanyUtils.countEmployeesWithSalaryAbove(employees, 5000));
    }
}
