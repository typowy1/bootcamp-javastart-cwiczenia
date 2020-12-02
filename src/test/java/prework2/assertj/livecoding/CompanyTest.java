package prework2.assertj.livecoding;

import org.junit.jupiter.api.Test;
import prework2.livecoding.Company;
import prework2.livecoding.Employee;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CompanyTest {

    private Company company = new Company();

    @Test
        //nazwa zaczynamy od should cos sie powinno stac
    void shouldRaiseBy3Percent() {
        //given - dla jakiś danych testowych
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ania", 5000));

        //when -- jesli(kiedy) wykonam polecenie dania podwyzki

        company.raises(employees);

        //than -- sprwadzamy czy Ania zarabia więcej
        Employee employee = employees.get(0);
        int wage = employee.getWage();

        assertThat(wage).isEqualTo(5150);//sprawdzamy to za pomocą asercji
    }

    @Test
        //nazwa zaczynamy od should cos sie powinno stac
    void shouldRaiseBy3PercentForTwoPeople() { // czy działa poprawnie dla dwóch pracowników
        //given - dla jakiś danych testowych
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ania", 5000));
        employees.add(new Employee("Basia", 10000));

        //when -- jesli(kiedy) wykonam polecenie dania podwyzki

        company.raises(employees);

        //than -- sprwadzamy czy Ania zarabia więcej

        assertThat(employees.get(0).getWage()).isEqualTo(5150);//sprawdzamy to za pomocą asercji
        assertThat(employees.get(1).getWage()).isEqualTo(10300);//sprawdzamy to za pomocą asercji
    }

    @Test
        //nazwa zaczynamy od should cos sie powinno stac
    void shouldRaiseBy100() { // czy działa poprawnie dla dwóch pracowników
        //given - dla jakiś danych testowych
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Krzysiek", 3000)); // jezeli 3% to mniej niż 100 to podnosimy do 100

        //when -- jesli(kiedy) wykonam polecenie dania podwyzki

        company.raises(employees);

        //than -- sprwadzamy czy Ania zarabia więcej

        assertThat(employees.get(0).getWage()).isEqualTo(3100);//sprawdzamy to za pomocą asercji
    }

    @Test
        //nazwa zaczynamy od should cos sie powinno stac
    void shouldRaiseBy100And3Percent() { // czy działa poprawnie dla dwóch pracowników
        //given - dla jakiś danych testowych
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ania", 3000));
        employees.add(new Employee("Basia", 10000));

        //when -- jesli(kiedy) wykonam polecenie dania podwyzki

        company.raises(employees);

        //than -- sprwadzamy czy Ania zarabia więcej

        assertThat(employees.get(0).getWage()).isEqualTo(3100);//sprawdzamy to za pomocą asercji
        assertThat(employees.get(1).getWage()).isEqualTo(10300);//sprawdzamy to za pomocą asercji
        assertThat(employees.get(1).getName()).isEqualTo("Basia");//sprawdzamy to za pomocą asercji
        assertThat(employees.get(1).getName()).endsWith("a");//sprawdzamy to za pomocą asercji
    }
}
