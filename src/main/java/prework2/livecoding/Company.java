package prework2.livecoding;

import java.util.List;

public class Company {

    public void raises(List<Employee> employees) { // zwiększamy wypłate o 3%, podwyżka
        for (Employee employee : employees) {
            int wage = employee.getWage();
            int afterRaise = (int) ((double) wage * 1.03);
            if (afterRaise - wage < 100) {
                afterRaise = wage + 100;
            }
            employee.setWage(afterRaise);
        }
    }
}
